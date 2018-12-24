package io.swagger.entities;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "workers", schema = "holidaydb", catalog = "")
public class WorkersEntity {
    private Integer workerId;
    private String fullName;
    private byte[] photo;
    private String phone;
    private String passportData;
    private String role;
    private String userColor;
    private String login;
    private String pass;
    private Double rating;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "worker_id", nullable = false)
    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    @Basic
    @Column(name = "full_name", nullable = false, length = 50)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "photo", nullable = false)
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "phone", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "passport_data", nullable = false, length = 100)
    public String getPassportData() {
        return passportData;
    }

    public void setPassportData(String passportData) {
        this.passportData = passportData;
    }

    @Basic
    @Column(name = "role", nullable = false, length = 10)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "user_color", nullable = false, length = 6)
    public String getUserColor() {
        return userColor;
    }

    public void setUserColor(String userColor) {
        this.userColor = userColor;
    }

    @Basic
    @Column(name = "login", nullable = false, length = 20)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "pass", nullable = false, length = 20)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Basic
    @Column(name = "rating", nullable = false, precision = 0)
    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkersEntity that = (WorkersEntity) o;

        if (workerId != null ? !workerId.equals(that.workerId) : that.workerId != null) return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (!Arrays.equals(photo, that.photo)) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (passportData != null ? !passportData.equals(that.passportData) : that.passportData != null) return false;
        if (role != null ? !role.equals(that.role) : that.role != null) return false;
        if (userColor != null ? !userColor.equals(that.userColor) : that.userColor != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (pass != null ? !pass.equals(that.pass) : that.pass != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = workerId != null ? workerId.hashCode() : 0;
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (passportData != null ? passportData.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (userColor != null ? userColor.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (pass != null ? pass.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }
}
