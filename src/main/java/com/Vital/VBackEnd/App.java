package com.Vital.VBackEnd;

import java.util.Date;
import java.util.List;

import model.dao.CustomerDAO;
import model.dao.ProductDAO;
import model.entity.Customer;
import model.entity.CustomerDetails;
import model.entity.Product;
import model.entity.ProductDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//---------------------------------------------------Product Entity------------------------------------------------------- 
        /*ProductDAO pdo = new ProductDAO();
         Product pc = new Product();*/	
                  											
        /*pc.setpName("BlackBary3");      // Create method is calling
        pc.setpCost(12343);
        pdo.insertProduct(pc);													
*/
        
//        boolean b = pdo.insertProduct(p1);				
//        if(b)
//        {
//        	System.out.println("Success inserted!!!");		//to use of boolean remove all (//) comments from App and ProductDAO=>insertPdocut and put required comments
//        }else
//        {
//        	System.out.println("Sorry failed to insert!!!");
//        }
        
        
        /*List<Product> lp = pdo.getProduct();									//retrieve method is calling
        for(Product p: lp)
        {
     	   System.out.println(p.getpId()+" "+p.getpName()+" "+p.getpCost());
        }*/
        
               
        /*Product pc = new Product(1,"Apple",1234);								//updateProduct is calling
        pdo.updateProduct(pc);*/
        
        
       /* pc.setpId(1);										//deleteProdut is calling
        pdo.deleteProduct(pc);	*/										
        
        
//-------------------------------------------------ProductDetils Entity----------------------------------------------------------------- 
       
        /*ProductDAO pdod = new ProductDAO();
        Date d = new Date();
        Product pc = new Product();
        ProductDetails pd = new ProductDetails();
*/        
        
        /*pc.setpId(7);			//---------------insert productDetails is calling
        pc.setpName("Apple5");
        pc.setpCost(15638);
        pd.setParent(pc);
        pd.setPdName(pc.getpName());
        pd.setMrp(pc.getpCost());
        pd.setmDate(d);
        pd.setpFeature("This is a good quality");

        pdod.insertProductDetails(pd);*/
        
        
      /*  pc.setpId(4);						//----------------update productDetails is calling
        pc.setpName("Apple1");
        pc.setpCost(951);
        
        pd.setParent(pc);
        pd.setP_Id(pc.getpId());
        pd.setPdName(pc.getpName());
        pd.setmDate(d);
        pd.setMrp(pc.getpCost());
        pd.setpFeature("this is latest");
        
        pdod.updateProduct(pc);
        pdod.updateProductDetails(pd);*/
        
       /* List<ProductDetails> lp = pdod.getPdetails();		//-----------------------------retrieve method is calling
        for(ProductDetails p: lp)
        {
     	   System.out.println(p.getP_Id()+" "+p.getPdName()+" "+p.getMrp()+" "+p.getpFeature()+" \t "+p.getParent());
        }
        */
        
        /*pc.setpId(7);								//---------------------delete method is calling
        pd.setP_Id(pc.getpId());
        pd.setParent(pc);
        pdod.deletePdetails(pd);*/
        
//-------------------------------------------------------Customer Entity---------------------------------------------------------------- 
       /*CustomerDAO cdo = new CustomerDAO();
       Customer cs = new Customer();*/
       
       /*cs.setcName("Amit Kumar2");										//create is calling
       cdo.insertCustomer(cs);*/
       
       
       /*List<Customer> lic = cdo.getCustomer();							//retrieve is calling
       for(Customer c: lic)
       {
    	   System.out.println(c.getcId()+" "+c.getcName());
       }*/
       
       
      /* cs.setcId(1);														//update is calling
       cs.setcName("Amit kumar");
       cdo.updateCustomer(cs);*/
       
       
       /*cs.setcId(3);															//delete is calling
       cdo.deleteCustomer(cs);*/

        
//---------------------------------------------------------------Customer Details-------------------------------------------------------------    
    
        CustomerDAO cdod = new CustomerDAO();
        Customer cs = new Customer();
        CustomerDetails cd = new CustomerDetails();
        
    
        /*cs.setcId(1);					//-----------------insert customerDetails is calling
        cs.setcName("Amit kumar2");
        cd.setcParent(cs);
        cd.setcName(cs.getcName());
        cd.setmNum(1234567890);
        cd.setEmail("amit@gmail.com");
        cd.setAdd("Laxman Vihar");
        cdod.insertCustomerDetails(cd);*/
        
        
        /*List<CustomerDetails> lic = cdod.getCustomerDetails();	//----------------------retrieve is calling
        for(CustomerDetails c: lic)
        {
        	System.out.println(c.getCdId()+" "+c.getcName()+" "+c.getmNum()+" "+c.getEmail()+" "+c.getAdd());
        }*/
        
        
        /*cs.setcId(2);						//-------------------------update is calling
        cs.setcName("Amit kumar3");
        cd.setCdId(cs.getcId());
        cd.setcName(cs.getcName());
        cd.setAdd("Begusarai");
        cd.setEmail("amit123@gmail.com");
        cd.setmNum(12456542);
        cdod.updateCustomer(cs);*/
        
        
        /*cs.setcId(2);						//-------------------delete is calling
        cd.setcParent(cs);
        cd.setCdId(cs.getcId());
        cdod.deleteCustomerDetails(cd);*/
    }
}
