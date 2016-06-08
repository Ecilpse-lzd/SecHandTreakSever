package com.lzd.SecHandTreak.doman;

import java.util.List;

/**
 * Created by lzd-develop on 16-5-15.
 */
public class GoodsInfo {


    /**
     * goodsId : 1
     * goodsTitle : 标题
     * picURlS : ["picURLhttp","http"]
     * sellerId : 2
     * seller : 卖家昵称
     * sellerPic : 卖家头像
     * isAuthenticate : true 是否认证
     * price : 商品价格
     * AddedTime : 上架时间
     * goodsDescription : 商品描述(HTML)
     * address : 卖家地址
     * isChoice : true//是否精选
     * choiseCount : 精选理由
     */

    private int goodsId;
    private String goodsTitle;
    private int sellerId;
    private String seller;
    private String sellerPic;
    private boolean isAuthenticate;
    private int price;
    private int priceOld;
    private String AddedTime;
    private String goodsDescription;
    private String address;
    private boolean isChoice;
    private String choiseCount;
    private int readCount;
    private List<String> picURlS;

    private int LODA_MSG;


    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }


    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }


    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    public void setSeller(String seller) {
        this.seller = seller;
    }


    public void setSellerPic(String sellerPic) {
        this.sellerPic = sellerPic;
    }

    public boolean isIsAuthenticate() {
        return isAuthenticate;
    }

    public void setIsAuthenticate(boolean isAuthenticate) {
        this.isAuthenticate = isAuthenticate;
    }


    public void setPriceOld(int priceOld) {
        this.priceOld = priceOld;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setAddedTime(String AddedTime) {
        this.AddedTime = AddedTime;
    }


    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isChoice() {
        return isChoice;
    }

    public void setIsChoice(boolean isChoice) {
        this.isChoice = isChoice;
    }


    public void setChoiseCount(String choiseCount) {
        this.choiseCount = choiseCount;
    }

    public List<String> getPicURlS() {
        return picURlS;
    }

    public void setPicURlS(List<String> picURlS) {
        this.picURlS = picURlS;
    }


    public void setLODA_MSG(int LODA_MSG) {
        this.LODA_MSG = LODA_MSG;
    }


    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }
}
