package com.example.housepos.pojo;

public class Property extends DatabaseItem {
    private String name;
    private String location;
    private String type;
    private double monthlyRent;
    private String availability;

    public Property(int id, String name, String location, String type, double monthlyRent, String availability) {
        super(id);
        this.name = name;
        this.location = location;
        this.type = type;
        this.monthlyRent = monthlyRent;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", availability='" + availability + '\'' +
                '}';
    }
}


