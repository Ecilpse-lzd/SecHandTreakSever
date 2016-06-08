package com.lzd.SecHandTreak.service;

import com.lzd.SecHandTreak.doman.WantInfo;
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
 * Created by lzd-develop on 16-5-25.
 */
@WebServlet(name = "LoadWantInfoServlet",urlPatterns = "/LoadWantInfo")
public class LoadWantInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("goodsId");
        WantInfo wantInfo = new WantInfo();
        wantInfo.setMSG(ReturnType.LOAD_WANT_INFO_SUCCESS);
        wantInfo.setWanterId(123);
        wantInfo.setWantContent("这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n" +
                "这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n" +
                "这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n这是描述\n");
        wantInfo.setWanterPic("http://192.168.0.116:8080/pic/4.jpg");
        wantInfo.setWantId(12);
        wantInfo.setWantPrice(150);
        wantInfo.setWantTitle("求购一个老王");
        wantInfo.setWantWriter("隔壁老王老王");
        wantInfo.setWantTime("19940806");
        wantInfo.setWanterIsVerification(true);
        List<WantInfo.WantWordsBean> list = new ArrayList<>();
        for (int i = 0;i<50;i++) {
            WantInfo.WantWordsBean wantWordsBean = new WantInfo.WantWordsBean();
            wantWordsBean.setWorldContent("我有,买我的");
            wantWordsBean.setWorldId(150);
            wantWordsBean.setWorldWriter("老李卖家");
            wantWordsBean.setWorldWriterID(1588);
            list.add(wantWordsBean);
        }
        wantInfo.setWantWords(list);
        response.getOutputStream().write(GsonImpl.get().toJson(wantInfo).getBytes("utf8"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
