package com.example.housepos.pojo;

public class Tenant extends DatabaseItem {
    private String name;
    private String contactInfo;
    private String email;
    private int loyaltyPoints;

    public Tenant(int id, String name, String contactInfo, String email, int loyaltyPoints) {
        super(id);
        this.name = name;
        this.contactInfo = contactInfo;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", email='" + email + '\'' +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}
