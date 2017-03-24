package controller;

import domain.Product;
import form.ProductForm;
import validator.ProductValidator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by zhaoke on 2017/3/23.
 */
public class SaveProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
        ProductForm productForm = new ProductForm();
        productForm.setName(req.getParameter("name"));
        productForm.setDescription(req.getParameter("description"));
        productForm.setPrice(req.getParameter("price"));

        ProductValidator productValidator = new ProductValidator();
        List<String> errors = productValidator.validate(productForm);
        if (errors.isEmpty()){
            Product product =  new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            product.setPrice(new BigDecimal(productForm.getPrice()));

            req.setAttribute("product", product);
            return "/WEB-INF/jsp/ProductDetails.jsp";
        } else {
            req.setAttribute("errors",errors);
            req.setAttribute("form",productForm);
            return "/WEB-INF/jsp/ProductForm.jsp";
        }


    }
}
