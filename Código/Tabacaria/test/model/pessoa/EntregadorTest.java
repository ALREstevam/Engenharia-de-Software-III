/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karen
 */
public class EntregadorTest {
    
    public EntregadorTest() {
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
     * Test of entregarPedido method, of class Entregador.
     */
    @Test
    public void testEntregarPedido() {
        System.out.println("entregarPedido");
        int id=0;
        String nome="José Rezende";
        String cpf="654848390-41";
        Entregador instance = new Entregador(id, nome, cpf);
        boolean expResult = true;
        boolean result = instance.entregarPedido();
        
        if (result == true) {
            System.out.println("Entrega realizada com sucesso!");
        } else {
            System.out.println("Erro na realização da entrega!");
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retornarPedido method, of class Entregador.
     */
    @Test
    public void testRetornarPedido() {
        System.out.println("retornarPedido");
        Entregador instance = new Entregador();
        instance.retornarPedido();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
