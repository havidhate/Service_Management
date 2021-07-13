package Master;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country_Model {

	@Id
	private long id;
	private String country_name;
	private String country_code;
	private String country_description;
	private String active_status;

	public Country_Model() {
	}

	public Country_Model(long id, String country_name, String country_code, String country_description, String active_status) {
		this.id = id;
		this.country_name = country_name;
		this.country_code = country_code;
		this.country_description = country_description;
		this.active_status = active_status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
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

	public String getActive_status() {
		return active_status;
	}

	public void setActive_status(String active_status) {
		this.active_status = active_status;
	}

	@Override
	public String toString() {
		return "Country_Model{" +
				"id=" + id +
				", country_name='" + country_name + '\'' +
				", country_code='" + country_code + '\'' +
				", country_description='" + country_description + '\'' +
				", active_status='" + active_status + '\'' +
				'}';
	}
}
