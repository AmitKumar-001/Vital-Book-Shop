package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="Cust_Id")
	private int cId;
	
	@Column(name="Customer_Name")
	@NotNull(message="Customer name can't be Null")
	private String cName;
		
	@OneToOne(mappedBy="cParent")
	private CustomerDetails cDetails;
	
	public Customer()
	{
		
	}

	public Customer(int cId, String cName, long contNum, String email, String add) {
		super();
		this.cId = cId;
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
}
