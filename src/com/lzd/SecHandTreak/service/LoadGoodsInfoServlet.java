package com.lzd.SecHandTreak.service;

import com.lzd.SecHandTreak.doman.GoodsInfo;
import com.lzd.SecHandTreak.utils.GsonImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lzd-develop on 16-5-18.
 */
@WebServlet(name = "LoadGoodsInfoServlet", urlPatterns = "/LoadGoodsInfo")
public class LoadGoodsInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int goodsId = new Integer(request.getParameter("goodsId"));
        String type = request.getParameter("goodsType");

        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setPrice(95000);
        goodsInfo.setAddedTime("time");
        goodsInfo.setAddress("内蒙古");
        goodsInfo.setGoodsDescription("\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "\" +\n" +
                "                \"                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n\\aaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaaaaaaaa\\naaaaaaaaaaaaaaaaa\\naaaaaaaaaa\\naaaaaaaaaaaaaaaaaaa\n" +
                "                    aaaaaaaaaaaaaaaaaaaaaaaaaaaa\\n");
        goodsInfo.setGoodsId(goodsId);
        goodsInfo.setLODA_MSG(ReturnType.LOAD_GOODS_INFO_SUCCESS);
        goodsInfo.setGoodsTitle("美女要么");
        goodsInfo.setPriceOld(100000);
        goodsInfo.setSeller("隔壁的王叔叔");
        goodsInfo.setSellerId(233);
        goodsInfo.setSellerPic("http://192.168.0.116:8080/pic/4.jpg");
        goodsInfo.setReadCount(24);
        //TODO 改成false
        goodsInfo.setIsChoice(false);

        goodsInfo.setChoiseCount("因为是美女所以精选了");

        List<String> list = new ArrayList<>();
        list.add("http://192.168.0.116:8080/pic/1.jpg");
        list.add("http://192.168.0.116:8080/pic/2.jpg");
        list.add("http://192.168.0.116:8080/pic/3.jpg");
        goodsInfo.setPicURlS(list);

        response.getOutputStream().write(GsonImpl.get().toJson(goodsInfo).getBytes("utf8"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //TODO 调试用
        doPost(request, response);
    }
}
