package model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cdId;
	
	@Column(name="Customer_Name")
	private String cName;
	
	@Column(name="mobile_number")
	private long mNum;
	
	@Column(name="emai_id")
	private String email;
	
	@Column(name="Address")
	private String add;

	@OneToOne(targetEntity=Customer.class, cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="cId")
	private Customer cParent;
	
	public Customer getcParent() {
		return cParent;
	}

	public void setcParent(Customer cParent) {
		this.cParent = cParent;
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public long getmNum() {
		return mNum;
	}

	public void setmNum(long mNum) {
		this.mNum = mNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}
	
	
}