/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import model.loja.ProdutoLoja;
import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;
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
public class GerenteTest {
    
    public GerenteTest() {
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
     * Test of gerarRelatorioCompras method, of class Gerente.
     */
    @Test
    public void testGerarRelatorioCompras() {
        System.out.println("gerarRelatorioCompras");
        String data = "";
        Gerente instance = new Gerente();
        RelatorioCompras expResult = null;
        RelatorioCompras result = instance.gerarRelatorioCompras(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gerarRelatorioVendas method, of class Gerente.
     */
    @Test
    public void testGerarRelatorioVendas() {
        System.out.println("gerarRelatorioVendas");
        String data = "";
        Gerente instance = new Gerente();
        RelatorioVendas expResult = null;
        RelatorioVendas result = instance.gerarRelatorioVendas(data);
        assertEquals(expResult, result);
// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of comprarProduto method, of class Gerente.
     */
    @Test
    public void testComprarProduto() {
        System.out.println("comprarProduto");
        Gerente instance = new Gerente();
        instance.comprarProduto();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listarProdutosVencidos method, of class Gerente.
     */
    @Test
    public void testListarProdutosVencidos() {
        System.out.println("listarProdutosVencidos");
        Gerente instance = new Gerente();
        ProdutoLoja expResult = null;
        ProdutoLoja result = instance.listarProdutosVencidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of descartarProduto method, of class Gerente.
     */
    @Test
    public void testDescartarProduto() {
        System.out.println("descartarProduto");
        Gerente instance = new Gerente();
        instance.descartarProduto();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
