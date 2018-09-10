package com.wpp.spike.model;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private Integer id;

    private String username;

    private BigDecimal account;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public BigDecimal getAccount() {
      return account;
   }

   public void setAccount(BigDecimal account) {
      this.account = account;
   }

   public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}