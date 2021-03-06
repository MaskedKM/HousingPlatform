package com.football.housingplatform.dao.domain;

public class User {

    public User(String name, String password, int id, String address, int face, int authority) {
        this.name = name;
        this.password = password;
        this.id = id;
        this.address = address;
        this.face = face;
        this.authority = authority;
    }

    public User(){
    }

    private String name;
    private String password;
    private int id;
    private String address;
    private int face;

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    private int authority;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", face=" + face +
                ", authority=" + authority +
                '}';
    }
}
