/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zolty
 */
public abstract class Client {
    static int idIt = 0;
    private int id;
    private String _phone;
    private String _mail;
    private String _NIP;
    private String _address;
    private List<Order> orderList = new ArrayList<>();

    Client(String[] data)
    {
        id = idIt++;
        _NIP = data[3];
        _address = data[4];
        _phone = data[5];
        _mail = data[6];
    }
    
    public void Add(Order order) {
        if(order != null)
            orderList.add(order);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (_NIP.equals(((Client)obj).getNIP()))
            return true;
        return false;
    }
    
    public Order SearchOrder(Order order) {
        for(int i = 0; i < orderList.size(); i++)
        {
            if(orderList.get(i).equals(order))
                return orderList.get(i);
        }
        return null;
    }
    
    public abstract String getId();
    
    public String getPhone() {
        return _phone;
    }

    public String getMail() {
        return _mail;
    }

    public String getNIP() {
        return _NIP;
    }

    public String getAddress() {
        return _address;
    }




    
}
