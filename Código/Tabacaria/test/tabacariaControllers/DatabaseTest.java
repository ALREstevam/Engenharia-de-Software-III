/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacariaControllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcus
 */
public class DatabaseTest {
    
    public DatabaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of openConnection method, of class Database.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        Database instance = new Database();
        boolean expResult = false;
        boolean result = instance.openConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class Database.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        Database instance = new Database();
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnectionState method, of class Database.
     */
    @Test
    public void testGetConnectionState() {
        System.out.println("getConnectionState");
        Database instance = new Database();
        int expResult = 0;
        int result = instance.getConnectionState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
