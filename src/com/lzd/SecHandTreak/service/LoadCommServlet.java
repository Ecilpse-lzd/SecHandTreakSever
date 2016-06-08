package com.lzd.SecHandTreak.service;

import com.lzd.SecHandTreak.doman.OtherCommodity;
import com.lzd.SecHandTreak.utils.GsonImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by lzd-develop on 16-5-4.
 */
@WebServlet(name = "LoadCommServlet", urlPatterns = "/loadcomm")
public class LoadCommServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String type = request.getParameter("type");
        String a = request.getParameter("page");


        OtherCommodity otherCommodity = new OtherCommodity();
        otherCommodity.setMSG(ReturnType.REFRISH_SUCCESS);

        //if (type.equals("frish"))
        //   otherCommodity.setMSG(ReturnType.REFRISH_SUCCESS);

        List<OtherCommodity.CommBean> list = new ArrayList<>();
        //System.out.println(request.getRequestURI());
        for (int i = 0; i < 50; i++) {
            OtherCommodity.CommBean comm = new OtherCommodity.CommBean();
            comm.setCommpic(request.getRequestURI() + "");
            comm.setSeller("我卖的" + i);
            comm.setSecPrice(50);
            comm.setFirPrice(55);
            comm.setCommpic("http://192.168.0.116:8080/pic/4.jpg");
            comm.setSellerPic("http://192.168.0.116:8080/pic/5.jpg");
            comm.setTitle("我是一个标题" + i);
            list.add(comm);
        }
        otherCommodity.setComm(list);

        response.getOutputStream().write(GsonImpl.get().toJson(otherCommodity).toString().getBytes("utf-8"));


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }
}
