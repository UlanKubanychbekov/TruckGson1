package com.company.Model;

public class Driver {
    private Integer id;
    private String name;
    private Truck truck;

    public Driver() {
    }

    public Driver(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
    public boolean hasTruck(){
        return this.truck != null;
    }
}
