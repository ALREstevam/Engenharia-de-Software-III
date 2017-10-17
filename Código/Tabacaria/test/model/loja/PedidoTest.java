/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.loja;

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
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getReceptorNome method, of class Pedido.
     */
    @Test
    public void testGetReceptorNome() {
        System.out.println("getReceptorNome");
        Pedido instance = null;
        String expResult = "";
        String result = instance.getReceptorNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setReceptorNome method, of class Pedido.
     */
    @Test
    public void testSetReceptorNome() {
        System.out.println("setReceptorNome");
        String receptorNome = "";
        Pedido instance = null;
        instance.setReceptorNome(receptorNome);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Pedido.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Pedido instance = null;
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Pedido.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Pedido instance = null;
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isStatus method, of class Pedido.
     */
    @Test
    public void testIsStatus() {
        System.out.println("isStatus");
        Pedido instance = null;
        boolean expResult = false;
        boolean result = instance.isStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Pedido.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        boolean status = false;
        Pedido instance = null;
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of entregar method, of class Pedido.
     */
    @Test
    public void testEntregar(String status) {
        
        String receptorNome="Joao da Silva"; 
        String endereco="Rua Paschoal Marmo, 12345, Jd.São Paulo"; 
        int id=0;
        ProdutoLoja[] produtos=new ProdutoLoja[10];
        float valorTotal=100;
        System.out.println("entregar");
        Pedido p= new Pedido(receptorNome, endereco, id, produtos, valorTotal);
       p.entregar(); 
        if(Boolean.parseBoolean(status))
            System.out.println("Entrega feita com sucesso!");
        else
            System.out.println("Entrega não realizada!");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
