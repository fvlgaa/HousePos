package com.example.housepos.pojo;

public class Payment extends DatabaseItem {
    private int tenantId;
    private double amount;
    private String date;
    private String status;

    public Payment(int id, int tenantId, double amount, String date, String status) {
        super(id);
        this.tenantId = tenantId;
        this.amount = amount;
        this.date = date;
        this.status = status;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + getId() +
                ", tenantId=" + tenantId +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}


