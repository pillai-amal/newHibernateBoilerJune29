package hibe_boiler.hibe_boiler.service;

import java.util.List;

import hibe_boiler.hibe_boiler.entity.Customer;

public interface CustomerService {
	public Integer addCustomer(Customer c) throws Exception;
	public Integer UpdateCustomer(Customer c) throws Exception;
	public Integer deleteCustomer(Integer cid) throws Exception;
	public Customer getCustomer(Integer cid) throws Exception;
	public List<Customer> getAllCustomer()throws Exception;
}
