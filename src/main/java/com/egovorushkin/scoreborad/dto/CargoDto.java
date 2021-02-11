package com.egovorushkin.scoreborad.dto;

import com.egovorushkin.scoreborad.dto.enums.CargoStatus;
import java.io.Serializable;
import java.util.Objects;

public class CargoDto implements Serializable {

    private long id;
    private String name;
    private int weight;
    private CargoStatus status;

    public CargoDto() {
        status = CargoStatus.PREPARED;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CargoStatus getStatus() {
        return status;
    }

    public void setStatus(CargoStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoDto cargoDto = (CargoDto) o;
        return id == cargoDto.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg) - " + status;
    }
}
