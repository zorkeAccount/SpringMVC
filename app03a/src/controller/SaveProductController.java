package controller;

import domain.Product;
import domain.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

/**
 * Created by zhaoke on 2017/3/24.
 */
public class SaveProductController implements Controller {
    private static final Log logger = LogFactory.getLog(SaveProductController.class);
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("SaveProductController called");

        ProductForm productForm =  new ProductForm();
        productForm.setName(httpServletRequest.getParameter("name"));
        productForm.setDescription(httpServletRequest.getParameter("description"));
        productForm.setPrice(httpServletRequest.getParameter("price"));

        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(new BigDecimal(productForm.getPrice()));
        }catch (Exception e){
            throw new IllegalArgumentException("产品价格金额格式不正确");
        }

        return new ModelAndView("ProductDetails","product",product);
    }
}
