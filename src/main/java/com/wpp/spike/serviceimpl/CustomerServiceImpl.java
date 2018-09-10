package com.wpp.spike.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wpp.spike.mapper.CustomerMapper;
import com.wpp.spike.model.Customer;
import com.wpp.spike.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

   @Autowired
   private CustomerMapper customerMapper;
   @Override
   public int deleteByPrimaryKey(Integer id) {
      // TODO Auto-generated method stub
      return customerMapper.deleteByPrimaryKey(id);
   }

   @Override
   public int insert(Customer record) {
      // TODO Auto-generated method stub
      return customerMapper.insert(record);
   }

   @Override
   public int insertSelective(Customer record) {
      // TODO Auto-generated method stub
      return customerMapper.insertSelective(record);
   }

   @Override
   public Customer selectByPrimaryKey(Integer id) {
      // TODO Auto-generated method stub
      return customerMapper.selectByPrimaryKey(id);
   }

   @Override
   public int updateByPrimaryKeySelective(Customer record) {
      // TODO Auto-generated method stub
      return customerMapper.updateByPrimaryKeySelective(record);
   }

   @Override
   public int updateByPrimaryKey(Customer record) {
      // TODO Auto-generated method stub
      return customerMapper.updateByPrimaryKey(record);
   }

   
}
