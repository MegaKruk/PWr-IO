/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

import java.util.Objects;

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
        if(_pesel == null)
            return null;
        return _pesel;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        return _pesel.equals(((NaturalPersonClient)obj).getId());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this._pesel);
        return hash;
    }
    
    public void setIdAsNull() {_pesel = null;}
    
    public String getId(){
        if (_pesel == null){
         //       throw new NullPointerException("0x0");               
            return null;
        }
        return _pesel;
    }
}
