/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

/**
 *
 * @author zolty
 */
public class Order {
    static int idIt = 0;
    public int _orderId;
    private String _clientId;
    private int _driverId;
    private String _orderDescription;
    private String _source;
    private String _destination;
    private float _price;
    public Order( String clientId, String desc, String src, String dest, float price)
    {
        _orderId = idIt++;
        _clientId = clientId;
        _orderDescription = desc;
        _source = src;
        _destination = dest;
        _price = price;        
    }
    
    public void Edit(String[] data) {
        _orderDescription = data[0];
        _source = data[1];
        _destination = data[2];
        _price = Integer.parseInt(data[3]); 
    }
    
    public boolean equals(Object obj) {
        return ((Order)obj).getOrderId()== _orderId;
    }
    
    void AddDriver(Driver driver) {
        if(driver != null)
            this._driverId = driver.getId();
    }

    public int getOrderId() {
        return _orderId;
    }

    public String getClientId() {
        return _clientId;
    }

    public int getDriverId() {
        return _driverId;
    }

    public String getOrderDescription() {
        return _orderDescription;
    }

    public String getSource() {
        return _source;
    }

    public String getDestination() {
        return _destination;
    }

    public float getPrice() {
        return _price;
    }



    
    
}
