package controller;

import domain.Product;
import form.ProductForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

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

        Product product =  new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());
        try {
            product.setPrice(new BigDecimal(productForm.getPrice()));
        }catch (Exception e){
            throw new IllegalStateException("价格金额格式不正确");
        }

        req.setAttribute("product", product);

        return "/WEB-INF/jsp/ProductDetails.jsp";
    }
}
