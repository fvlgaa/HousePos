package com.example.housepos.dao;

import com.example.housepos.pojo.Payment;


import java.util.ArrayList;

public interface PaymentDAO {
    public ArrayList<Payment> getAllPayment();
    public Payment getPayment(int id);

}