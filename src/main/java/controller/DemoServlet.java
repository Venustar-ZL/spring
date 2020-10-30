package controller;

import service.DemoService;
import service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ：zhanglei
 * @date ：Created in 2020/10/19 14:03
 * @description：
 * @modified By：
 * @version: 1.0
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {

    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(demoService.findAll().toString());
    }
}
