package state_master.ThirdTest.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	
	@Id
	private long contactNo;
	private String emailId;
	private String fname;
	private String lname;
	private String city;
	private String password;
	
	public Model(String emailId, String fname, String lname, long contactNo, String city,String password) {
		super();
		this.emailId = emailId;
		this.fname = fname;
		this.lname = lname;
		this.contactNo = contactNo;
		this.city = city;
		this.password = password;
	}
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Model [contactNo=" + contactNo + ", emailId=" + emailId + ", fname=" + fname + ", lname=" + lname
				+ ", city=" + city + ", password=" + password + "]";
	}

}
