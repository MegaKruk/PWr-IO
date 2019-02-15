/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

import fitnesse.Data;
import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author zolty
 */

@Category({ Test_Entity.class})
@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NaturalPersonClientTest {
    
    static Data dane;
    static NaturalPersonClient clientsInstances[]; 
    @Rule
    public ExpectedException exception = ExpectedException.none();//zad2 A
    
   
    @BeforeClass
    public static void setUpClass() {
        dane = new Data();
        clientsInstances = new NaturalPersonClient[2];
        clientsInstances[0] = new NaturalPersonClient(dane.daneNatClientPers[0]);
        clientsInstances[1] = new NaturalPersonClient(dane.daneNatClientPers[0]);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
  //ZAD3
    @Parameterized.Parameter
    public Order[][] orders;
    
   @Parameterized.Parameters     
   public static Collection<Object[][][]> data() {         
       /*Object[][] data1 = new Object[][]{             
           {0, 1}, {2, 3}, {4, 5}, {6, 7}  };
           return Arrays.asList(data1);   */
       Object[][][][] data1 = new Order[][][][]{{
           {
               {new Order("123","1 tir ryb", "Gdansk", "Wawa", 5000.50F), new Order("123","1 tir ryb", "Gdansk", "Wroc", 4000.50F)},
               {new Order("123","1 tir ryb", "Gdansk", "Bydgoszcz", 3000.50F), new Order("123","1 tir ryb", "Gdansk", "Poznan", 3000.50F)}
           }
       }};
       return Arrays.asList(data1);   
    }

    
    /**
     * Test of Add method, of class Client.
     */
    /*@Test
    public void testAdd() {
        System.out.println("Add");   
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++)
            {                
                clientsInstances[i].Add(orders[i][j]);
                Order order = clientsInstances[i].getOrderByIndexInList(j);
                assertSame(order, orders[i][j]);// spr rownosci danych referenycjnych
            }
            int rozmiar1 = clientsInstances[i].getNumberOfOrders();
            clientsInstances[i].Add(orders[i][0]);
            assertEquals(rozmiar1 + 1, clientsInstances[i].getNumberOfOrders());//czy zgadza sie liczba zamowien
        }
    }
    
   /* @Test //G PO A
    public void testGetNumberOfOrders() {
        System.out.println("GetNumberOfOrders");   
        for(int i = 0; i < 2; i++)
            assertEquals(3, clientsInstances[i].getNumberOfOrders());
    }
    
    /**
     * Test of getPesel method, of class NaturalPersonClient.
     */
    @Test
    public void testGetPesel() {
        System.out.println("getPesel");
        NaturalPersonClient instance = new NaturalPersonClient(dane.daneNatClientPers[0]);
        
        assertTrue("pesel sie zgadza", instance.getPesel().equals(dane.daneNatClientPers[0][2]));
        assertFalse("pesel sie nie zgadza", instance.getPesel().equals(dane.daneNatClientPers[1][2]));
        instance.setIdAsNull();
        exception.expect(NullPointerException.class);    //k1.2 – definicja zachowania metody         
        //exception.expectMessage("Code point = 0x0");       //testowej podczas testowania generowania          
        instance.getPesel().equals(dane.daneNatClientPers[0][2]); // wyjątku IllegalFormatCodePointException                                                       
    }

    /**
     * Test of equals method, of class NaturalPersonClient.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        
        NaturalPersonClient instance1 = new NaturalPersonClient(dane.daneNatClientPers[0]);
        NaturalPersonClient instance2 = new NaturalPersonClient(dane.daneNatClientPers[1]);
        NaturalPersonClient instance3 = new NaturalPersonClient(dane.daneNatClientPers[2]);
        NaturalPersonClient instance4 = new NaturalPersonClient(dane.daneNatClientPers[3]);
        assertTrue("Metoda jest zwrotna",instance1.equals(instance1));
        
        assertFalse("2 rozne obiekty - false", instance1.equals(instance2));
        
        assertTrue("Symetryczna ", instance1.equals(instance3) && instance3.equals(instance1));
        
        assertTrue("Przechodnia",
        instance1.equals(instance3)==true&&instance3.equals(instance4)&&instance4.equals(instance1));
        
        //exception.expect(NullPointerException.class);    //k1.2 – definicja zachowania metody      
        assertFalse("Antek to nie null",instance1.equals(null));
    }
//*/

    
}
