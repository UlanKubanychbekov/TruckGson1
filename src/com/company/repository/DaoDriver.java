package com.company.repository;

import com.company.Model.Driver;


import java.util.HashMap;
import java.util.Map;

public class DaoDriver {
    private Map<Integer, Driver> driverMap = new HashMap<>();

    public DaoDriver() {
    }

    public Map<Integer, Driver> getDriverMap() {
        return driverMap;
    }

    public void setDriverMap(Map<Integer, Driver> driverMap) {
        this.driverMap = driverMap;
    }

    public void add(Driver driver) {
        driverMap.put(driver.getId(), driver);
    }


    public Driver fintTruck(int id) {
        return driverMap.get(id);
    }


    public void show() {
        System.out.println("""
                 #     | Driver         | Bus      
                -------+----------------+--------------""");
        for (Map.Entry<Integer, Driver> entry : driverMap.entrySet()) {
            Integer key = entry.getKey();
            Driver value = entry.getValue();
            try {
                System.out.printf("""
                                -%d-    | %s       | %s           """,
                        key, value.getName(), value.getTruck().getName() + "\n");
            } catch (NullPointerException e) {
                System.out.printf("""
                                -%d-    | %s       | %s           """,
                        key, value.getName(), " " + "\n");
            }
        }
    }
}
