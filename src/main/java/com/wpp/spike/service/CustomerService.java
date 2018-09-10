package com.wpp.spike.service;

import com.wpp.spike.model.Customer;

public interface CustomerService {
   int deleteByPrimaryKey(Integer id);

   int insert(Customer record);

   int insertSelective(Customer record);

   Customer selectByPrimaryKey(Integer id);

   int updateByPrimaryKeySelective(Customer record);

   int updateByPrimaryKey(Customer record);
   
   
}
