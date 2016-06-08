package com.lzd.SecHandTreak.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lzd-develop on 16-5-25.
 */
@WebServlet(name = "LoadInfoServlet",urlPatterns = "/loadinfo")
public class LoadInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type =  request.getParameter("goodsType");
        switch (type) {
            case "want":
                request.getRequestDispatcher("/LoadWantInfo").forward(request, response);
                break;
            case "sell":
                request.getRequestDispatcher("/LoadGoodsInfo").forward(request, response);
                break;
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
