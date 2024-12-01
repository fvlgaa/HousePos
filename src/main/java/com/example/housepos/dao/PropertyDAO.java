package com.example.housepos.dao;

import com.example.housepos.pojo.Property;

import java.util.ArrayList;

public interface PropertyDAO {
    public ArrayList<Property> getAllProperty();
    public Property getCoin(int id);

}
