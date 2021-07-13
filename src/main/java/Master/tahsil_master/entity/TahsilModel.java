package Master.tahsil_master.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TahsilModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String tahsil_name;

    private Integer tahsil_code;

    private String tahsil_description;

    private Character active_status='Y';

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
