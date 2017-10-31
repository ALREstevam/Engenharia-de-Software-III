,/*
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
     * Test of setStatus method, of class Pedido.
     * @param status
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
        // TODO review the generated test code and lean.parseBoolean(status))
            System.out.println("Entrega feita com sucesso!");
        else
            System.out.println("Entrega não realizada!");remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
