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
public class Facade {
    public List<Order> orderList = new ArrayList<>();
    public List<Client> clientList = new ArrayList<>();
    public List<Driver> driverList = new ArrayList<>();
    public void AddOrder(String[] orderData, Client client)
    {
        Client client2 = SearchClient(client);
        if(client2 != null)
        {
            Order order = new Order(
                    client2.getId(),
                    orderData[0],
                    orderData[1],
                    orderData[2],
                    Float.parseFloat(orderData[3]));
            client.Add(order);
        }
    }

    public void EditOrder(Order order, String[] data){
        Order order2 = SearchOrder(order);
        if(order2 != null){
            order2.Edit(data);
        }
    }

    public void AddDriverToOrder(Driver driver, Order order)
    {
        order.AddDriver(driver);
    }

    public void SendMailToDriver(Driver driver, Order order)
    {
        driver.SendMail(order);
    }

    private Driver SearchDriver(Driver driver) {
        if(driver != null)
            for(int i = 0; i < driverList.size(); i++){
                if(driverList.get(i).equals(driver))
                    return driverList.get(i);
            }
        return null;
    }

    private Client SearchClient(Client client) {
        if(client != null)
            for(int i = 0; i < clientList.size(); i++){
                if(clientList.get(i).equals(client))
                    return clientList.get(i);
            }
        return null;
    }

    private Order SearchOrder(Order order) {
        if(order != null){\
            Order order2 = null;
            for(int i = 0; i < clientList.size(); i++){
                Client c = clientList.get(i);
                order2 = c.SearchOrder(order);
                if(order2 != null){
                    return order2;
                }
            }
        }
        return null;
    }
}
