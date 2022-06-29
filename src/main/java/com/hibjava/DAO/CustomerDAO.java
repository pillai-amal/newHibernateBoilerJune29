package com.hibjava.DAO;

import java.util.List;

import com.hibjava.entity.Customer;

public interface CustomerDAO {
	public Integer addCustomer(Customer c) throws Exception;
	public Integer UpdateCustomer(Customer c) throws Exception;
	public Integer deleteCustomer(Integer cid) throws Exception;
	public Customer getCustomer(Integer cid) throws Exception;
	public List<Customer> getAllCustomer()throws Exception;

}