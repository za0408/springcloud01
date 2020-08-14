package com.aaa.Entity;

import java.util.List;

public class Plate {
    private int pid;
    private String pname;
    private String ppath;
    private List<Fun> fun;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPpath() {
        return ppath;
    }

    public void setPpath(String ppath) {
        this.ppath = ppath;
    }

    public List<Fun> getFun() {
        return fun;
    }

    public void setFun(List<Fun> fun) {
        this.fun = fun;
    }

    public Plate(int pid, String pname, String ppath, List<Fun> fun) {
        this.pid = pid;
        this.pname = pname;
        this.ppath = ppath;
        this.fun = fun;
    }

    public Plate() {
    }

    @Override
    public String toString() {
        return "Plate{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", ppath='" + ppath + '\'' +
                '}';
    }
}
