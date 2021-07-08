package state_master.ThirdTest.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country_Model {
	
	@Id
	private long id;
	private String country_name;
	private String country_code;
	private String country_description;
	private String country_status;
	
	public Country_Model(String country_name, String country_code, String country_description, long id, String country_status) {
		super();
		this.country_name = country_name;
		this.country_code = country_code;
		this.country_description = country_description;
		this.id = id;
		this.country_status = country_status;
	}
	
	public Country_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id = id;
	}
	
	public String getCountry_name() {
		return emailId;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_description() {
		return country_description;
	}
	public void setCountry_description(String country_description) {
		this.country_description = country_description;
	}
	
	public String getCountry_status() {
		return country_status;
	}
	public void setCountry_status(String country_status) {
		this.country_status = country_status;
	}

	@Override
	public String toString() {
		return "Model [id=" + id + ", country_name=" + country_name + ", country_code=" + country_code + ", country_description=" + country_description
				+ ", country_status=" + country_status + "]";
	}

}
