/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author zolty
 */


































































@Categories.SuiteClasses({io_test.OrderTest.class, io_test.FacadeTest.class, io_test.NaturalPersonClientTest.class}) 
@RunWith(Categories.class) 
@Categories.IncludeCategory(Test_Entity.class) 
@Categories.ExcludeCategory(Test_Control.class) 
public class NewTestSuite {

    
}

/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package io_test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author zolty
 */
/*@Category({Test_Control.class, Test_Entity.class})
@RunWith(Parameterized.class) 
public class OrderTest {
    
    static Data dane;
   
    @Rule  
    public ExpectedException exception = ExpectedException.none();
    
    @BeforeClass
    public static void setUpClass() {
        dane = new Data();   
    }
    
 /*   @Parameterized.Parameter     
    public int numer1;        
    @Parameterized.Parameters     
    public static Collection<Object[]> data() {         
        Object[][] data1 = new Object[][]{ 
            {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7} 
        };         
        return Arrays.asList(data1);     
    }   
    
    

    /**
     * Test of equals method, of class Order.
     */
/*    @Test
    public void testEquals() {
        System.out.println("equals");
        
        for(int i = 0; i < 8;i++)
        {
            Order order = new Order( dane.ordersDataTest[i]);
            if(i == numer1)
                assertEquals(dane.ordersDataTest[i], order);//te same 
            else
                assertEquals(dane.ordersDataTest[i], order);//porownanie roznych
        }
        
    }

    /**
     * Test of AddDriver method, of class Order.
     */
 /*   @Test
    public void testAddDriver() {
        System.out.println("AddDriver");        
        Driver driver;
        Client c = new NaturalPersonClient(dane.daneNatClientPers[0]);
        Order instance = new Order(c.getId(), "Ryby", "Gdansk", "Wawa", 4000.1F);
        for(int i = 0; i < 2; i++)
        {
            driver = new Driver(dane.driversData[i]);            
            instance.AddDriver(driver);
            assertEquals(driver.getId(), instance.getDriverId());
        }
        driver = null;
        exception.expect(NullPointerException.class);    //k1.2 – definicja zachowania metody                 
        instance.AddDriver(driver); // wyjątku IllegalFormatCodeP        
    }

}
*/




























