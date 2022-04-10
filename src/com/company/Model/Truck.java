package com.company.Model;


import com.company.enums.State;

public class Truck {
    private Integer id;
    private String name;
    private Driver driver;
    private State state;

    public Truck() {
    }

    public Truck(Integer id, String name, State state) {
        this.id = id;
        this.name = name;
        this.state = state;
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean hasDrive() {
        return this.driver != null;
    }
}
