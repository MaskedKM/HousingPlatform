package com.football.housingplatform.dao.domain;

public class HousingInfo {
    private int id;
    private String site;
    private long price;
    private String description;
    private double area;

    public HousingInfo(int id, String site, long price, String description, double area) {
        this.id = id;
        this.site = site;
        this.price = price;
        this.description = description;
        this.area = area;
    }

    public HousingInfo() {
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
