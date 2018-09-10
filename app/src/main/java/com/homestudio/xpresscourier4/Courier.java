package com.homestudio.xpresscourier4;



public class Courier {

    private int id;
    private String uname;
    private String pack;
    private String handling;
    private String address;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void  setUname(String uname) {
        this.uname = uname;
    }

    public String getPackage() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
