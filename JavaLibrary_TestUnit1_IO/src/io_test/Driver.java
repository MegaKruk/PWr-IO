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
class Driver {
    static int idIt = 0;
    private int id;
    private String _firstName;
    private String _lastName;
    private String _mail;
    private String _phone;
    public Driver(String[] data){
        id = idIt++;
        _firstName = data[0];
        _lastName = data[1];
        _mail = data[2];
        _phone = data[3];
    }
    
    void SendMail(Order order){
        if(order != null)
            ;//SENDMAILTODRIVER
    }

    public static int getIdIt() {
        return idIt;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getMail() {
        return _mail;
    }

    public String getPhone() {
        return _phone;
    }


    
    
}
