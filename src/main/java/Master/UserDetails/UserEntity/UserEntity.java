package Master.UserDetails.UserEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {

    @Id
    private Long mobileNo;
    private String fname;
    private String lname;
    private String emailID;
    private String password;

    public UserEntity() {
    }

    public UserEntity(Long mobileNo, String fname, String lname, String emailID, String password) {
        this.mobileNo = mobileNo;
        this.fname = fname;
        this.lname = lname;
        this.emailID = emailID;
        this.password = password;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
