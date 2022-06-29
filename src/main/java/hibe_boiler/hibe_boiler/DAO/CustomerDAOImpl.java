package hibe_boiler.hibe_boiler.DAO;

import org.hibernate.*; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Repository;
import hibe_boiler.hibe_boiler.entity.Customer;

@Repository(value = "customerDao")
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	SessionFactory sessionFactory;
	public Integer addCustomer(hibe_boiler.hibe_boiler.entity.Customer c) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = new Customer();
		return null;
	}

	public Integer updateCustomer(hibe_boiler.hibe_boiler.entity.Customer c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteCustomer(Integer cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public hibe_boiler.hibe_boiler.entity.Customer getCustomer(Integer cid) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
