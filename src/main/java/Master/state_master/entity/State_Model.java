package Master.state_master.entity;

import Master.Country_Master.entity.Country_Model;
import Master.district_master.entity.DistrictModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class State_Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer state_id;
	private String state_name;
	private String state_code;
	private String state_description;
	private Character active_status;


	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country_Model countryModel;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "stateModel",fetch = FetchType.LAZY)
	private List<DistrictModel> districtModel;

	public State_Model() {
	}

	public State_Model(Integer state_id, String state_name, String state_code, String state_description, Character active_status, Country_Model countryModel,List<DistrictModel> districtModel) {
		this.state_id = state_id;
		this.state_name = state_name;
		this.state_code = state_code;
		this.state_description = state_description;
		this.active_status = active_status;
		this.countryModel = countryModel;
		this.districtModel=districtModel;
	}

	public Integer getState_id() {
		return state_id;
	}

	public void setState_id(Integer state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getState_code() {
		return state_code;
	}

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}

	public String getState_description() {
		return state_description;
	}

	public void setState_description(String state_description) {
		this.state_description = state_description;
	}

	public Character getActive_status() {
		return active_status;
	}

	public void setActive_status(Character active_status) {
		this.active_status = active_status;
	}

	@JsonBackReference
	public Country_Model getCountryModel() {
		return countryModel;
	}

	public void setCountryModel(Country_Model countryModel) {
		this.countryModel = countryModel;
	}

	@JsonManagedReference
	public List<DistrictModel> getDistrictModel() {
		return districtModel;
	}

	public void setDistrictModel(List<DistrictModel> districtModel) {
		this.districtModel = districtModel;
	}
}
