package io.swagger.entities;

import javax.persistence.*;

@Entity
@Table(name = "orders_site", schema = "holidaydb", catalog = "")
public class OrdersSiteEntity {
    private Integer orderSiteId;
    private String dateDay;
    private String city;
    private String place;
    private String startTime;
    private String endTime;
    private String phone;
    private String emailAddress;
    private String attraction;
    private String comments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_site_id", nullable = false)
    public Integer getOrderSiteId() {
        return orderSiteId;
    }

    public void setOrderSiteId(Integer orderSiteId) {
        this.orderSiteId = orderSiteId;
    }

    @Basic
    @Column(name = "dateDay", nullable = false, length = 30)
    public String getDateDay() {
        return dateDay;
    }

    public void setDateDay(String dateDay) {
        this.dateDay = dateDay;
    }

    @Basic
    @Column(name = "city", nullable = false, length = 50)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "place", nullable = false, length = 100)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "start_time", nullable = false, length = 50)
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time", nullable = false, length = 50)
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
    @Column(name = "email_address", nullable = false, length = 50)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "attraction", nullable = false, length = 2000)
    public String getAttraction() {
        return attraction;
    }

    public void setAttraction(String attraction) {
        this.attraction = attraction;
    }

    @Basic
    @Column(name = "comments", nullable = false, length = 2000)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersSiteEntity that = (OrdersSiteEntity) o;

        if (orderSiteId != null ? !orderSiteId.equals(that.orderSiteId) : that.orderSiteId != null) return false;
        if (dateDay != null ? !dateDay.equals(that.dateDay) : that.dateDay != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (attraction != null ? !attraction.equals(that.attraction) : that.attraction != null) return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderSiteId != null ? orderSiteId.hashCode() : 0;
        result = 31 * result + (dateDay != null ? dateDay.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (attraction != null ? attraction.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        return result;
    }
}
