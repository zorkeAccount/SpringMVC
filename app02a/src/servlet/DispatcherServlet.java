package servlet;

import controller.InputProductController;
import controller.SaveProductController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 该Servlet耦合程度程度较高，现将该代码解耦成一个Controller接口+InputProductController+SaveProductController
 * Created by zhaoke on 2017/3/22.
 */
public class DispatcherServlet extends HttpServlet {
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

        String dispatchUrl = null;
        if ("product_input.action".equals(action)){
            InputProductController controller = new InputProductController();
            dispatchUrl = controller.handleRequest(req,resp);
        }else if ("product_save.action".equals(action)){
            SaveProductController controller = new SaveProductController();
            dispatchUrl = controller.handleRequest(req,resp);
        }

        if (null != dispatchUrl){
            RequestDispatcher rd = req.getRequestDispatcher(dispatchUrl);
            rd.forward(req,resp);
        }
    }
}
