package com.example.housepos.pojo;


public class DatabaseItem {
    private int id;

    // Constructor
    public DatabaseItem(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DatabaseItem{" +
                "id=" + id +
                '}';
    }

    public String getStatus() {
        return null;
    }
    public String getTime() {
        return null;
    }
}
