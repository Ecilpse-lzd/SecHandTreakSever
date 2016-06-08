package com.lzd.SecHandTreak.service;

import com.lzd.SecHandTreak.doman.OtherWantBuy;
import com.lzd.SecHandTreak.utils.GsonImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by lzd-develop on 16-5-5.
 */
@WebServlet(name = "LoadWantServlet",urlPatterns = "/loadwant")
public class LoadWantServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String type = request.getParameter("type");

        OtherWantBuy otherCommodity = new OtherWantBuy();
        //otherCommodity.setMsg(ReturnType.REFRISH_SUCCESS);

        if (type.equals("frish")){
            otherCommodity.setMsg(ReturnType.REFRISH_SUCCESS);
        }

        else{
            otherCommodity.setMsg(ReturnType.LOAD_SUCCESS);

        }

        List<OtherWantBuy.ItemBean> list = new ArrayList<>();
        //System.out.println(request.getRequestURI());
        Random random = new Random();
        for (int i = 50; i > 0; i--) {
            OtherWantBuy.ItemBean item = new OtherWantBuy.ItemBean();
            item.setTitle("标题");
            item.setPrice(random.nextInt()%1000);
            item.setContext("谁卖我一个啊");
            item.setSellcount(i);
            item.setItemid(i);
            item.setTime("2016");

            list.add(item);
        }
        otherCommodity.setItems(list);

        response.getOutputStream().write(GsonImpl.get().toJson(otherCommodity).toString().getBytes("utf-8"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);

    }
}
