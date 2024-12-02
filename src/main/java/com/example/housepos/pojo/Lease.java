package com.example.housepos.pojo;

public class Lease extends DatabaseItem {
    private int propertyId;
    private int tenantId;
    private String startDate;
    private String endDate;

    public Lease(int id, int propertyId, int tenantId, String startDate, String endDate) {
        super(id);
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Lease{" +
                "id=" + getId() +
                ", propertyId=" + propertyId +
                ", tenantId=" + tenantId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
