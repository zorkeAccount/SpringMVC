package servlet;

import domain.Product;
import form.ProductForm;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by zhaoke on 2017/3/22.
 */
public class ControllerServlet extends HttpServlet {
    private static final long serialVersionUID = -6395821976983329589L;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); //浏览器默认是GB2312编码的，解决乱码问题需要在此设置字符格式为UTF-8与jsp文件中字符格式保持一致
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);
        if ("product_input.action".equals(action)){
            //nothing
        }else if ("product_save.action".equals(action)){

            ProductForm productForm = new ProductForm();
            productForm.setName(req.getParameter("name"));
            productForm.setDescription(req.getParameter("description"));
            productForm.setPrice(req.getParameter("price"));

            Product product =  new Product();
            product.setName(productForm.getName());
            product.setDescription(productForm.getDescription());
            product.setPrice(new BigDecimal(productForm.getPrice()));

            req.setAttribute("product", product);
        }

        String dispatchUrl = null;
        if ("product_input.action".equals(action)){
            dispatchUrl = "/WEB-INF/jsp/ProductForm.jsp";
        }else if ("product_save.action".equals(action)){
            dispatchUrl = "/WEB-INF/jsp/ProductDetails.jsp";
        }
        if (null != dispatchUrl){
            RequestDispatcher rd = req.getRequestDispatcher(dispatchUrl);
            rd.forward(req,resp);
        }
    }
}
