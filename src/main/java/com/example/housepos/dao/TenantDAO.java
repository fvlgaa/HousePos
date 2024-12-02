package com.example.housepos.dao;

import com.example.housepos.pojo.Tenant;

import java.util.ArrayList;

public interface TenantDAO {
    public ArrayList<Tenant> getAllProperty();
    public Tenant getProperty(int id);

}