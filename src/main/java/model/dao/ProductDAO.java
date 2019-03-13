package model.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import config.HibernateUtil;
import model.entity.Product;
import model.entity.ProductDetails;

public class ProductDAO {

	private Session sess;
	private Transaction ts;
	public ProductDAO()
	{
		sess = HibernateUtil.getSessionFactory().openSession();

	}
	
	
//		public boolean insertProduct(Product p1)
		public void insertProduct(Product pi)													//this is create method
		{
//			boolean b = true;
			try
			{
				ts = sess.beginTransaction();
				sess.save(pi);
				ts.commit();
				System.out.println("!!!Successfully Inserted!!!");
			}catch(Exception ex)
			{
				ts.rollback();
//				b=false;
				System.out.println("Sorry Failed to insert!!!");
				ex.printStackTrace();
			}
//			return b;
		}
		
		public void insertProductDetails(ProductDetails pi)													//this is for productDetails
		{
			try
			{
				sess.beginTransaction();
				sess.save(pi);
				sess.getTransaction().commit();
				System.out.println("!!!Successfully Inserted!!!");
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				ex.printStackTrace();
				System.out.println("!!!Sorry Failed to insert!!!");
			}
		}
		
		public List<Product> getProduct()															//this is retrieve method
		{
			List<Product> lp = null;
			try
			{
				
				sess.beginTransaction();
				Query<Product> q = sess.createQuery("from Product", Product.class);
				lp = q.getResultList();
				System.out.println("These are products:-");
			}catch(Exception ex)
			{
				ex.printStackTrace();
				System.out.println("!!!Sorry Unable to getProducts!!!");
			}
			return lp;
		}
		
		public List<ProductDetails> getPdetails()
		{
			List<ProductDetails> lp = null;
			try
			{
				sess.beginTransaction();
				Query<ProductDetails> q = sess.createQuery("from ProductDetails", ProductDetails.class);
				lp = q.getResultList();
				System.out.println("These are Product Details:-");
			}catch(Exception ex)
			{
				System.out.println("!!!Sorry Unable to get product details!!!");
				ex.printStackTrace();
			}
			return lp;
		}
				
		public void updateProduct(Product pu)															//this is update method
		{
			try {
				sess.beginTransaction();
				sess.update(pu);
				sess.getTransaction().commit();
				System.out.println("!!!Successfully Updated!!!");
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				ex.printStackTrace();
				System.out.println("!!!Sorry Failed to Update!!!");
			}
		}
			
		public void updateProductDetails(ProductDetails pdu)					//this is update of ProductDetails
		{
			try {
				sess.beginTransaction();
				sess.update(pdu);
				sess.getTransaction().commit();
				System.out.println("!!!Successfully Updated!!!");
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				System.out.println("!!!Sorry Failed to update!!!");
				ex.printStackTrace();
			}
		}
					
		public void deleteProduct(Product pd)																//this is delete method
		{
			try
			{
				sess.beginTransaction();
				sess.delete(pd);
				sess.getTransaction().commit();
				System.out.println("!!!Successfully Deleted!!!");
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				ex.printStackTrace();
				System.out.println("Sorry Failed to Delete!!!");
			}
		}
		
		public void deletePdetails(ProductDetails pdd)									//this is delete productDetails
		{
			try
			{
				sess.beginTransaction();
				sess.delete(pdd);
				sess.getTransaction().commit();
				System.out.println("!!!Successfully Deleted!!!");
			}catch(Exception ex)
			{
				sess.getTransaction().rollback();
				ex.printStackTrace();
				System.out.println("Sorry Failed to Delete!!!");
			}
		}
}
