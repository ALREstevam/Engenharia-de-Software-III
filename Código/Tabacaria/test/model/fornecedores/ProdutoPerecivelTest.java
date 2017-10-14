/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fornecedores;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class ProdutoPerecivelTest {
    
    public ProdutoPerecivelTest() {
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
     * Test of naValidade method, of class ProdutoPerecivel.
     */
    @Test
    public void testNaValidade() {
        String nome="Derby";
        System.out.println(" Teste naValidade");
        ProdutoPerecivel instance= new ProdutoPerecivel();
        boolean expResult = true;
        boolean result = instance.naValidade();
        if(result==true)
            System.out.println("Produto está na validade");
        else
            System.out.println("Produto vencido");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
