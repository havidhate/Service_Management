package district_master;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Model {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String district_name;

    private Integer district_code;

    private String district_description;

    private char active_status='Y';

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public char getActive_status() {
        return active_status;
    }

    public void setActive_status(char active_status) {
        this.active_status = active_status;
    }
}
