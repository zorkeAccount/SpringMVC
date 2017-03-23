package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhaoke on 2017/3/23.
 */
public class InputProductController implements Controller {
    @Override
    public String handleRequest(HttpServletRequest req, HttpServletResponse resp) {
        return "/WEB-INF/jsp/ProductForm.jsp";
    }
}
