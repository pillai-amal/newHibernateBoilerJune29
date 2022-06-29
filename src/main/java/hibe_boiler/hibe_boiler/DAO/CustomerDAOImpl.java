package hibe_boiler.hibe_boiler.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import hibe_boiler.hibe_boiler.entity.Customer;
import org.hibernate.Query;


@Repository(value = "customerDao")
public class CustomerDAOImpl implements CustomerDAO {
	
	HibernateTemplate hbtemp;
	
	public HibernateTemplate getHbtemp() {
		return hbtemp;
	}
	public void setHbtemp(HibernateTemplate hbtemp) {
		this.hbtemp = hbtemp;
	}
	public Integer addCustomer(Customer c) throws Exception {
		
		SessionFactory fact=hbtemp.getSessionFactory();
		Session sec=fact.openSession();
		sec.save(c);
		sec.beginTransaction().commit();
		
		
		return null;
	}

	public Integer UpdateCustomer(Customer c) throws Exception {
		SessionFactory fact=hbtemp.getSessionFactory();
		Session sec=fact.openSession();
		
		Customer cust=(Customer)sec.get(Customer.class, c.getcId());
		
		cust.setcName(c.getcName());
		cust.setCity(c.getCity());
		cust.setDob(c.getDob());
		
		sec.save(cust);
		sec.beginTransaction().commit();
		
		return null;
	}
	
public Integer deleteCustomer(Integer cid) throws Exception {
		
		SessionFactory fact=hbtemp.getSessionFactory();
		Session sec=fact.openSession();
		Customer cust=(Customer)sec.get(Customer.class, cid);
		sec.delete(cust);
		sec.beginTransaction().commit();
		
		
		return null;
	}

	public Customer getCustomer(Integer cid) throws Exception {
		Session ses=hbtemp.getSessionFactory().openSession();
		
		Customer s1=(Customer)ses.get(Customer.class, cid);
		
		return s1;
	}
	
	public List<Customer> getAllCustomer() throws Exception {
		Session ses=hbtemp.getSessionFactory().openSession();
		Query q=ses.createQuery("from Customer");
		return q.list(); 
		
	}

}
