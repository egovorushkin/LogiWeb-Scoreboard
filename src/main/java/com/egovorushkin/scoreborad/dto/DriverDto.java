package com.egovorushkin.scoreborad.dto;

import com.egovorushkin.scoreborad.dto.enums.DriverStatus;
import java.io.Serializable;
import java.util.Objects;

public class DriverDto implements Serializable {

    private long id;
    private String username;
    private String firstName;
    private String lastName;
    private int personalNumber;
    private int workedHoursPerMonth;

    private boolean isInShift;

    private DriverStatus status;

    private CityDto currentCity;

    private TruckDto truck;

    public DriverDto() {
        status = DriverStatus.RESTING;
        workedHoursPerMonth = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public int getWorkedHoursPerMonth() {
        return workedHoursPerMonth;
    }

    public void setWorkedHoursPerMonth(int workedHoursPerMonth) {
        this.workedHoursPerMonth = workedHoursPerMonth;
    }

    public boolean isInShift() {
        return isInShift;
    }

    public void setInShift(boolean inShift) {
        isInShift = inShift;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public CityDto getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(CityDto currentCity) {
        this.currentCity = currentCity;
    }

    public TruckDto getTruck() {
        return truck;
    }

    public void setTruck(TruckDto truck) {
        this.truck = truck;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverDto driverDto = (DriverDto) o;
        return personalNumber == driverDto.personalNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalNumber);
    }

    @Override
    public String toString() {
        return "DriverDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", personalNumber=" + personalNumber +
                ", workedHoursPerMonth=" + workedHoursPerMonth +
                ", isInShift=" + isInShift +
                ", status=" + status +
                '}';
    }
}
