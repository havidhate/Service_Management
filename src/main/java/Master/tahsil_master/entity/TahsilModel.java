package Master.tahsil_master.entity;

import Master.district_master.entity.DistrictModel;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class TahsilModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer tahsil_id;

    private String tahsil_name;

    private Integer tahsil_code;

    private String tahsil_description;

    private Character active_status='Y';

    @ManyToOne
    @JoinColumn(name = "district_id")
    private DistrictModel districtModel;

    public TahsilModel() {
    }

    public TahsilModel(Integer tahsil_id, String tahsil_name, Integer tahsil_code, String tahsil_description, Character active_status, DistrictModel districtModel) {
        this.tahsil_id = tahsil_id;
        this.tahsil_name = tahsil_name;
        this.tahsil_code = tahsil_code;
        this.tahsil_description = tahsil_description;
        this.active_status = active_status;
        this.districtModel = districtModel;
    }

    public Integer getTahsil_id() {
        return tahsil_id;
    }

    public void setTahsil_id(Integer tahsil_id) {
        this.tahsil_id = tahsil_id;
    }

    public String getTahsil_name() {
        return tahsil_name;
    }

    public void setTahsil_name(String tahsil_name) {
        this.tahsil_name = tahsil_name;
    }

    public Integer getTahsil_code() {
        return tahsil_code;
    }

    public void setTahsil_code(Integer tahsil_code) {
        this.tahsil_code = tahsil_code;
    }

    public String getTahsil_description() {
        return tahsil_description;
    }

    public void setTahsil_description(String tahsil_description) {
        this.tahsil_description = tahsil_description;
    }

    public Character getActive_status() {
        return active_status;
    }

    public void setActive_status(Character active_status) {
        this.active_status = active_status;
    }

    @JsonBackReference
    public DistrictModel getDistrictModel() {
        return districtModel;
    }

    public void setDistrictModel(DistrictModel districtModel) {
        this.districtModel = districtModel;
    }
}
