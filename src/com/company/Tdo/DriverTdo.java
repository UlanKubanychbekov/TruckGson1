package com.company.Tdo;

import com.google.gson.annotations.SerializedName;

public record DriverTdo(int id, String name, @SerializedName(value = "truck") TruckWithOutDriver truck) {

}
