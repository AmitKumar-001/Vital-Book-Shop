package model.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import config.HibernateUtil;
import model.entity.Customer;
import model.entity.CustomerDetails;

public class CustomerDAO {

	private Session sess;
	private Transaction ts;
	
	public CustomerDAO()
	{
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	public void insertCustomer(Customer c)													//this is create method
	{
		try
		{
			ts = sess.beginTransaction();
			sess.save(c);
			ts.commit();
			System.out.println("!!!Successfully Inserted!!!");
		}catch(Exception ex)
		{
			ts.rollback();
			System.out.println("!!!Sorry failed to insert!!!");
			ex.printStackTrace();
		}
	}
	
	
	public void insertCustomerDetails(CustomerDetails cd)
	{
		try
		{
			sess.beginTransaction();
			sess.save(cd);
			sess.getTransaction().commit();
			System.out.println("!!!Successfully inserted!!!");
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			System.out.println("Sorry failed to insert");
			ex.printStackTrace();
		}
	}
	
	
	public List<Customer> getCustomer()															//this is retrieve method
	{
		List<Customer> lc = null;
		try
		{
			
			sess.beginTransaction();
			Query<Customer> q = sess.createQuery("from Customer", Customer.class);
			lc = q.getResultList();
			System.out.println("These are customers list:-");
		}catch(Exception ex)
		{
			System.out.println("!!!Sorry Unable to get customer list!!!");
			ex.printStackTrace();
		}
		return lc;
	}


	public List<CustomerDetails> getCustomerDetails()
	{
		List<CustomerDetails> ld = null;
		try
		{
			sess.beginTransaction();
			Query<CustomerDetails> q = sess.createQuery("from CustomerDetails", CustomerDetails.class);
			ld = q.getResultList();
			System.out.println("These are customer's details:-");
		}catch(Exception ex)
		{
			System.out.println("Sorry unable to get Customer's Details");
			ex.printStackTrace();
		}
		return ld;
	}
	
	
	public void updateCustomer(Customer cu)
	{
		try
		{
			sess.beginTransaction();
			sess.update(cu);
			sess.getTransaction().commit();
			System.out.println("!!!Successfully updated!!!");
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
			System.out.println("!!!Sorry failed to update!!!");
		}
	}
	
	
	public void updateCustomerDetails(CustomerDetails cd)
	{
		try
		{
			sess.beginTransaction();
			sess.update(cd);
			sess.getTransaction().commit();
			System.out.println("!!!Successfully updated!!!");
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			System.out.println("Failed to update");
			ex.printStackTrace();
		}
	}

	
	public void deleteCustomer(Customer cd)
	{
		try
		{
			sess.beginTransaction();
			sess.delete(cd);
			sess.getTransaction().commit();
			System.out.println("!!!Successfully deleted!!!");
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			ex.printStackTrace();
			System.out.println("!!!Sorry failed to delete!!!");
		}
	}
	
	
	public void deleteCustomerDetails(CustomerDetails cd)
	{
		try
		{
			sess.beginTransaction();
			sess.delete(cd);
			sess.getTransaction().commit();
			System.out.println("!!!Successfully deleted!!!");
		}catch(Exception ex)
		{
			sess.getTransaction().rollback();
			System.out.println("Sorry failed to delete");
			ex.printStackTrace();
		}
	}
}
