/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

import fitnesse.Data;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

/**
 *
 * @author zolty
 */

@Category({Test_Control.class, Test_Entity.class}) 
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacadeTest {
    
    static Facade fasada;
    static Data dane;
    @Rule
    public ExpectedException exception = ExpectedException.none(); 
    
    @BeforeClass
    public static void setUpClass() {
        fasada = new Facade();
        dane = new Data();
    }
    
   
    @Test
    public void testAddNaturalClient() {//MA NIE DODAC TAKICH SAMYCH KLIENTOW
        System.out.println("AddClient");
        for(int i = 0; i < 4 ; i++){
            fasada.AddNaturalPersonClient(dane.daneNatClientPers[i]);
            assertEquals(fasada.clientList.size(), dane.liczba_klientow[i]);
        }
    }
    
    /**
     * Test of AddOrder method, of class Facade.
     */
    @Test
    public void testAddOrder() {
        System.out.println("AddOrder");
        String[] orderData;
        Client client = fasada.clientList.get(0);
        for(int i = 0; i < 4; i++){
            fasada.AddOrder(dane.OrderData[i], client);
            assertEquals(client.getNumberOfOrders(), dane.liczba_zamowien[i]);//MOZNA 2 takie same zamowienia (cyklicznie te same dane (inna data) 
        }
        client = new NaturalPersonClient(dane.daneNatClientPers[4]);
        fasada.AddOrder(dane.OrderData[4], client);
            assertEquals("nie ma klienta",client.getNumberOfOrders(), dane.liczba_zamowien[4]);//NIE MOZNA DODAC ZAMOWIENIA BEZ KLIENTA na liscie 
    }

    /**
     * Test of EditOrder method, of class Facade.
     */
    @Test
    public void testEditOrder() {
        System.out.println("EditOrder");
        String[] data;
        Client client = fasada.clientList.get(0);
        
        for(int i = 0; i < 4; i ++){
            data = dane.editedData[i];
            Order order  = client.getOrderByIndexInList(i);            
            fasada.EditOrder(order, data);
            boolean b = order.getDestination().equals(dane.editedData[i][2]);
            assertEquals(true, b);
        }
        
        exception.expect(IndexOutOfBoundsException.class);    
        data = dane.editedData[4];
        Order order  = client.getOrderByIndexInList(4);//zamowienie o nieisntiejacym indexie            
        fasada.EditOrder(order, data);
    }

   
    
}
