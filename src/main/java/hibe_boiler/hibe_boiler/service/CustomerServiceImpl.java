package hibe_boiler.hibe_boiler.service;

import java.util.List;

import hibe_boiler.hibe_boiler.DAO.CustomerDAOImpl;
import hibe_boiler.hibe_boiler.entity.Customer;
public class CustomerServiceImpl implements CustomerService {

	CustomerDAOImpl impl;

	public CustomerDAOImpl getImpl() {
		return impl;
	}

	public void setImpl(CustomerDAOImpl impl) {
		this.impl = impl;
	}

	 
	public Integer addCustomer(Customer c) throws Exception {
		return impl.addCustomer(c);
	}

	 
	public Integer UpdateCustomer(Customer c) throws Exception {
		return impl.UpdateCustomer(c);
	}

	 
	public Integer deleteCustomer(Integer cid) throws Exception {
		return impl.deleteCustomer(cid);
	}


	public List<Customer> getAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomer(Integer cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}