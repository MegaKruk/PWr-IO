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
public class NaturalPersonClient extends Client{
    private String _firstName;
    private String _lastName;
    private String _pesel;
    
  
    public NaturalPersonClient(String[] data) {        
        super(data);
        _firstName = data[0];
        _lastName = data[1];
        _pesel = data[2];
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getPesel() {
        return _pesel;
    }
    @Override
    public boolean equals(Object obj) {
        if (_pesel.equals(((NaturalPersonClient)obj).getId()))
            return true;
        return false;
    }
    
    public String getId(){
        return _pesel;
    }
}
