package com.hibjava.service;

import java.util.List;

import com.hibjava.entity.Customer;

public interface CustomerService {
	public Integer addCustomer(Customer c) throws Exception;
	public Integer UpdateCustomer(Customer c) throws Exception;
	public Integer deleteCustomer(Integer cid) throws Exception;
	public Customer getCustomer(Integer cid) throws Exception;
	public List<Customer> getAllCustomer()throws Exception;
}
