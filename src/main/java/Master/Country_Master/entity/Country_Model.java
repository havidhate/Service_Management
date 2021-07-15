package Master.Country_Master.entity;

import Master.state_master.entity.State_Model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country_Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer country_id;
	private String country_name;
	private String country_code;
	private String country_description;
	private String active_status;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "countryModel",fetch = FetchType.LAZY)
	private List<State_Model> state_models;


	public Country_Model() {
	}

	public Country_Model(Integer country_id, String country_name, String country_code, String country_description, String active_status, List<State_Model> state_models) {
		this.country_id = country_id;
		this.country_name = country_name;
		this.country_code = country_code;
		this.country_description = country_description;
		this.active_status = active_status;
		this.state_models = state_models;
	}

	public Integer getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Integer country_id) {
		this.country_id = country_id;
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

	@JsonManagedReference
	public List<State_Model> getState_models() {
		return state_models;
	}

	public void setState_models(List<State_Model> state_models) {
		this.state_models = state_models;
	}
}
