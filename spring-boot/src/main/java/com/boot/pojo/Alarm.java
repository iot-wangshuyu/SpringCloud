package com.boot.pojo;

/**
 * @Package:com.boot.pojo
 * @ClassName:alram
 * @Description:实体类
 * @Author Shuyu.Wang
 * @Date 2017-12-27 10:49
 **/

public class Alarm {

    private Integer id;
    private String alramName;
    private String userName;
    private String nation;
    private String idNumber;
    private String carNumber;
    private String alramTime;
    private Double lon;
    private Double lat;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlramName() {
        return alramName;
    }

    public void setAlramName(String alramName) {
        this.alramName = alramName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getAlramTime() {
        return alramTime;
    }

    public void setAlramTime(String alramTime) {
        this.alramTime = alramTime;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
