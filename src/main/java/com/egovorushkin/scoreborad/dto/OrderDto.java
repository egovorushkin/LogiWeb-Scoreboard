package com.egovorushkin.scoreborad.dto;

import com.egovorushkin.scoreborad.dto.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

public class OrderDto implements Serializable {

    private long id;
    private OrderStatus status;
    private CityDto fromCity;
    private CityDto toCity;
    private CargoDto cargo;
    private Integer distance;
    private TruckDto truck;

    public OrderDto() {
        status = OrderStatus.NOT_COMPLETED;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public CityDto getFromCity() {
        return fromCity;
    }

    public void setFromCity(CityDto fromCity) {
        this.fromCity = fromCity;
    }

    public CityDto getToCity() {
        return toCity;
    }

    public void setToCity(CityDto toCity) {
        this.toCity = toCity;
    }

    public CargoDto getCargo() {
        return cargo;
    }

    public void setCargo(CargoDto cargo) {
        this.cargo = cargo;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @JsonIgnore
    public int getDuration() {
        return distance / 80;
    }

    public TruckDto getTruck() {
        return truck;
    }

    public void setTruck(TruckDto truck) {
        this.truck = truck;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", status=" + status +
                ", fromCity=" + fromCity +
                ", toCity=" + toCity +
                ", cargo=" + cargo +
                ", distance=" + distance +
                ", truck=" + truck +
                '}';
    }
}
