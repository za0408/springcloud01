package com.aaa.Entity;

import java.util.List;

public class Role {
    private int rid;
    private String rpower;
    private List<Plate> plate;

    public Role(int rid, String rpower, List<Plate> plate) {
        this.rid = rid;
        this.rpower = rpower;
        this.plate = plate;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rpower='" + rpower + '\'' +
                '}';
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRpower() {
        return rpower;
    }

    public void setRpower(String rpower) {
        this.rpower = rpower;
    }

    public List<Plate> getPlate() {
        return plate;
    }

    public void setPlate(List<Plate> plate) {
        this.plate = plate;
    }
}
