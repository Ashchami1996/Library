package lk.lib.ijse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sid;
    private int regId;
    private String name;
    private String address;
    private String bday;
    private String grade;
    private String password;

    public Student() {
    }

    public Student(int regId, String name, String address, String bday, String grade, String password) {
        this.regId = regId;
        this.name = name;
        this.address = address;
        this.bday = bday;
        this.grade = grade;
        this.password = password;
    }
    public Student(int sid, int RegId, String name, String address, String bday, String grade,String password) {
        this.sid = sid;
        this.regId = RegId;
        this.name = name;
        this.address = address;
        this.bday = bday;
        this.grade = grade;
        this.password = password;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
