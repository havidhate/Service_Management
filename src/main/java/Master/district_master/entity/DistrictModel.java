package Master.district_master.entity;

import Master.state_master.entity.State_Model;
import Master.tahsil_master.entity.TahsilModel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class DistrictModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer district_id;

    private String district_name;

    private Integer district_code;

    private String district_description;

    private Character active_status='Y';

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State_Model stateModel;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "districtModel",fetch = FetchType.LAZY)
    private List<TahsilModel> tahsilModels;




    public DistrictModel() {
    }

    public DistrictModel(Integer district_id, String district_name, Integer district_code, String district_description, Character active_status, State_Model stateModel,List<TahsilModel> tahsilModels) {
        this.district_id = district_id;
        this.district_name = district_name;
        this.district_code = district_code;
        this.district_description = district_description;
        this.active_status = active_status;
        this.stateModel = stateModel;
        this.tahsilModels=tahsilModels;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public Integer getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(Integer district_code) {
        this.district_code = district_code;
    }

    public String getDistrict_description() {
        return district_description;
    }

    public void setDistrict_description(String district_description) {
        this.district_description = district_description;
    }

    public Character getActive_status() {
        return active_status;
    }

    public void setActive_status(Character active_status) {
        this.active_status = active_status;
    }


    @JsonBackReference
    public State_Model getStateModel() {
        return stateModel;
    }

    public void setStateModel(State_Model stateModel) {
        this.stateModel = stateModel;
    }

    @JsonManagedReference
    public List<TahsilModel> getTahsilModels() {
        return tahsilModels;
    }

    public void setTahsilModels(List<TahsilModel> tahsilModels) {
        this.tahsilModels = tahsilModels;
    }
}
