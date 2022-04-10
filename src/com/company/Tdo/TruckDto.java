package com.company.Tdo;


import com.company.enums.State;
import com.google.gson.annotations.SerializedName;

public record TruckDto(int id, String name, @SerializedName(value = "driver") DriverWithOutTruct driver, State state) {

}
