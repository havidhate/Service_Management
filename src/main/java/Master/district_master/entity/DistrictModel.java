package Master.district_master.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DistrictModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String district_name;
    private String district_code;
    private String district_description;
    private Character active_status='Y';

    public DistrictModel(long id, String district_name, String district_code, String district_description, Character active_status) {
        this.id = id;
        this.district_name = district_name;
        this.district_code = district_code;
        this.district_description = district_description;
        this.active_status = active_status;
    }

    public DistrictModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getDistrict_code() {
        return district_code;
    }

    public void setDistrict_code(String district_code) {
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
}
