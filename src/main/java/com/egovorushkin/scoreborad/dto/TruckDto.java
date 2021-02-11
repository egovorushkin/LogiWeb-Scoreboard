package com.egovorushkin.scoreborad.dto;

import com.egovorushkin.scoreborad.dto.enums.TruckState;
import com.egovorushkin.scoreborad.dto.enums.TruckStatus;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class TruckDto implements Serializable {

    private long id;
    private String registrationNumber;
    private int teamSize;
    private int capacity;
    private int currentNumberOfDrivers;
    private TruckStatus status;
    private TruckState state;
    private boolean isBusy;
    private CityDto currentCity;
    private Set<DriverDto> currentDrivers;
    private Set<OrderDto> currentOrders;

    public TruckDto() {
        status = TruckStatus.PARKED;
        isBusy = false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTeamSize() {

        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public TruckStatus getStatus() {
        return status;
    }

    public void setStatus(TruckStatus status) {
        this.status = status;
    }

    public TruckState getState() {
        return state;
    }

    public void setState(TruckState state) {
        this.state = state;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }

    public CityDto getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(CityDto currentCity) {
        this.currentCity = currentCity;
    }

    public int getCurrentNumberOfDrivers() {
        if (currentDrivers != null) {
            return currentDrivers.size();
        }
        return 0;
    }

    public void setCurrentNumberOfDrivers(int currentNumberOfDrivers) {
        this.currentNumberOfDrivers = currentNumberOfDrivers;
    }

    public Set<DriverDto> getCurrentDrivers() {
        return currentDrivers;
    }

    public void setCurrentDrivers(Set<DriverDto> currentDrivers) {
        this.currentDrivers = currentDrivers;
    }

    public Set<OrderDto> getCurrentOrders() {
        return currentOrders;
    }

    public void setCurrentOrders(Set<OrderDto> currentOrders) {
        this.currentOrders = currentOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TruckDto truckDto = (TruckDto) o;
        return registrationNumber.equals(truckDto.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber);
    }

    @Override
    public String toString() {
        return registrationNumber;
    }
}
