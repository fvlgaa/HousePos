package com.example.housepos.dao;

import com.example.housepos.pojo.Lease;

import java.util.ArrayList;

public interface LeaseDAO {
    public ArrayList<Lease> getAllLease();
    public Lease getLease(int id);

}