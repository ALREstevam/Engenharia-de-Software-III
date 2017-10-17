/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import model.loja.Pedido;
import model.loja.Venda;
import model.notasFiscais.NotaFiscalCompra;
import model.notasFiscais.NotaFiscalVenda;
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
public class CaixaTest {
    
    public CaixaTest() {
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
     * Test of emitirNotaVenda method, of class Caixa.
     */
    @Test
    public void testEmitirNotaVenda() {
        System.out.println("emitirNotaVenda");
        Caixa instance = new Caixa();
        NotaFiscalVenda expResult = null;
        NotaFiscalVenda result = instance.emitirNotaVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of receberPagamento method, of class Caixa.
     */
    @Test
    public void testReceberPagamento() {
        System.out.println("receberPagamento");
        Caixa instance = new Caixa();
        NotaFiscalCompra expResult = null;
        NotaFiscalCompra result = instance.receberPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of realizarVenda method, of class Caixa.
     */
    @Test
    public void testRealizarVenda() {
        System.out.println("realizarVenda");
        Caixa instance = new Caixa();
        Venda expResult = null;
        Venda result = instance.realizarVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarProduto method, of class Caixa.
     */
    @Test
    public void testAdicionarProduto() {
        System.out.println("adicionarProduto");
        Caixa instance = new Caixa();
        boolean expResult = false;
        boolean result = instance.adicionarProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removerProduto method, of class Caixa.
     */
    @Test
    public void testRemoverProduto() {
        System.out.println("removerProduto");
        Caixa instance = new Caixa();
        boolean expResult = false;
        boolean result = instance.removerProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of finalizarVenda method, of class Caixa.
     */
    @Test
    public void testFinalizarVenda() {
        System.out.println("finalizarVenda");
        Caixa instance = new Caixa();
        Venda expResult = null;
        Venda result = instance.finalizarVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obterDadosEntrega method, of class Caixa.
     */
    @Test
    public void testObterDadosEntrega() {
        System.out.println("obterDadosEntrega");
        int id=0;
        Caixa instance = new Caixa();
        Pedido  p = new Pedido();
        int expResult = p.getId();
        int result = instance.obterDadosEntrega().getId();
        if(result=0)
            System.out.println("Dados obtidos com sucesso");
        else
            System.out.println("Erro na obtenção de dados");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
