package com.boot.pojo;

/**
 * @Package:com.boot.pojo
 * @ClassName:che
 * @Description:a
 * @Author Shuyu.Wang
 * @Date 2017-12-27 13:27
 **/

public class Che {


    private Double lon;

    private Double lat;
    private String type;
    private String name;

    public Che(Double lon, Double lat, String type, String name) {
        this.lon = lon;
        this.lat = lat;
        this.type = type;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
}
