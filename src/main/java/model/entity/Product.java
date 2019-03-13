package model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name="Products")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	
	@Column(name="Product_Name")
	private String pName;
	
	@Column(name="Product_Cost")
	@Min(value=100)
	@Max(value=9999999)
	private int pCost;
	
	@OneToOne(mappedBy="parent")
	private ProductDetails pDetails;
	
	/*@ManyToOne(targetEntity=Customer.class,cascade=CascadeType.ALL)
	private Customer cust;*/
	
	public Product() {
		
	}

	public ProductDetails getpDetails() {
		return pDetails;
	}

	public void setpDetails(ProductDetails pDetails) {
		this.pDetails = pDetails;
	}

	public Product(int pId, String pName, int pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpCost() {
		return pCost;
	}

	public void setpCost(int pCost) {
		this.pCost = pCost;
	}	
}
