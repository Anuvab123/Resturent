package com.geekster.Resturent.model;

public class Resturent {

    private int id;
    private String name;
    private String address;
    private String specialty;
    private int totalStaffs;

    public Resturent(int id, String name, String address, String specialty, int totalStaffs) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.specialty = specialty;
        this.totalStaffs = totalStaffs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }
}
