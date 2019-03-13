package model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Past;

@Entity
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_Id;
	
	@Column(name="Features")
	private String pFeature;
	
	@Column(name="manufacturing_date")
	@Past
	private Date mDate;	
	
	@Column(name="Product_Name")
	private String pdName;
	
	@Column(name="MRP")
	private float mrp;
	
	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	@OneToOne(targetEntity=Product.class, cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="pId")
	private Product parent;



	public String getPdName() {
		return pdName;
	}

	public void setPdName(String pdName) {
		this.pdName = pdName;
	}

	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getpFeature() {
		return pFeature;
	}

	public void setpFeature(String pFeature) {
		this.pFeature = pFeature;
	}

	public Date getmDate() {
		return mDate;
	}

	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	public Product getParent() {
		return parent;
	}

	public void setParent(Product parent) {
		this.parent = parent;
	}

}
