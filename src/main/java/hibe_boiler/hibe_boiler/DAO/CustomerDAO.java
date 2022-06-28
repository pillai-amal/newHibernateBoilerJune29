package hibe_boiler.hibe_boiler.DAO;

import hibe_boiler.hibe_boiler.entity.Customer;

public interface CustomerDAO {
	public Integer addCustomer(Customer c) throws Exception;
	public Integer updateCustomer(Customer c) throws Exception;
	public Integer deleteCustomer(Integer cid) throws Exception;
	public Customer getCustomer(Integer cid) throws Exception;

}