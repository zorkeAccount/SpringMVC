package com.controller;

import com.domain.Product;
import com.domain.ProductForm;
import com.service.ProductService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.math.BigDecimal;

/**
 * Created by zhaoke on 2017/3/26.
 */
@Controller
public class SecondProductController {
    private static final Log logger = LogFactory.getLog(SecondProductController.class);
    /*为productService字段添加@Autowired注解会使ProductService的一个实例被注入到ProductController实例中*/
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "second_product_input")
    public String inputProduct(){
        logger.info("secondInputProduct called");
        return "ProductForm";
    }

    @RequestMapping(value = "second_product_save", method = RequestMethod.POST)
    public String saveProduct(ProductForm productForm, RedirectAttributes redirectAttributes){
        logger.info("secondSaveProduct called");

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(new BigDecimal(productForm.getPrice()));
        }catch (Exception e){
            throw new IllegalArgumentException("价格金额格式不正确");
        }

        Product saveProduct = productService.add(product);
        redirectAttributes.addFlashAttribute("message","The product was successfully added.");

        return "redirect:/product_view/" + saveProduct.getId();
    }

    @RequestMapping(value = "/product_view/{id}")
    public String viewProduct(@PathVariable Long id, Model model){
        Product product =  productService.get(id);
        model.addAttribute("product",product);
        return "ProductDetails";
    }
}
