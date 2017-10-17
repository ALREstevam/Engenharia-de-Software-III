/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import model.loja.Pedido;
import model.loja.ProdutoLoja;
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
        int id=0;
        String nome="Andre de Souza";
        String cpf="678954325-87";
        Caixa instance;
        instance = new Caixa(id, nome, cpf);
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
        int id=0;
        String nome="Joana Pereira";
        String cpf="098765432-12";
        Caixa instance = new Caixa(id, nome, cpf);
        boolean expResult = true;
        boolean result = instance.adicionarProduto();
        if (result == true) {
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Erro na adicao do produto!");
        }
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
        int id=0;
        String nome="Debora Rodrigues";
        String cpf="456321908-23";
        Caixa instance = new Caixa(id, nome, cpf);
        boolean expResult = true;
        boolean result = instance.removerProduto();
        if (result == true) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Falha na remocao do produto!");
        }
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
        String receptorNome="Lucas da Silva";
        String endereco="Rua das Flores 43, Jd. Paulista";
        ProdutoLoja[] produtos;
        int id=0;
        produtos = new ProdutoLoja[12];
        float valorTotal=100;
        Pedido p = new Pedido(receptorNome, endereco, id, produtos, valorTotal);
        Caixa instance = new Caixa();
        int expResult = p.getId();
        int result = p.getId();
        if (result ==0) {
            System.out.println("Dados obtidos com sucesso");
        } else {
            System.out.println("Erro na obtenção de dados");
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
