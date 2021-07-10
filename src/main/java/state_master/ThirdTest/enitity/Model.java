package state_master.ThirdTest.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class  Model {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String state_name;
	private String state_code;
	private String state_description;
	private Character active_status;

	public Model(long id, String state_name, String state_code, String state_description, Character active_status) {
		this.id = id;
		this.state_name = state_name;
		this.state_code = state_code;
		this.state_description = state_description;
		this.active_status = active_status;
	}

	public Model() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
