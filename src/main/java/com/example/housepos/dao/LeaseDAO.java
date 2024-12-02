package com.example.housepos.dao;

import com.example.housepos.pojo.Lease;

import java.util.ArrayList;

public interface LeaseDAO {
    public ArrayList<Lease> getAllLease();

    // Get all leases from the Lease table
    ArrayList<Lease> getAllLeases();

    public Lease getLease(int id);

    // Create a new lease in the database
    boolean createLease(Lease lease);

    // Delete a lease by its ID
    boolean deleteLease(int id);
}