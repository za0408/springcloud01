package com.aaa.Entity;

public class Fun {
    private int fid;
    private String fname;
    private String fpath;

    public Fun(int fid, String fname, String fpath) {
        this.fid = fid;
        this.fname = fname;
        this.fpath = fpath;
    }

    public Fun() {
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath;
    }

    @Override
    public String toString() {
        return "Fun{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fpath='" + fpath + '\'' +
                '}';
    }
}
