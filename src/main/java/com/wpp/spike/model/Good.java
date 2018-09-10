package com.wpp.spike.model;

import java.math.BigDecimal;
import java.util.Date;

public class Good {
    private Integer id;

    private String goodname;

    private BigDecimal goodprice;

    private Integer inventory;

    private Integer sellerid;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public BigDecimal getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(BigDecimal goodprice) {
        this.goodprice = goodprice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}