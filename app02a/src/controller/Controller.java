package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhaoke on 2017/3/23.
 */
public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
