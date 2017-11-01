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
 * @author Pedro
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
     * Test of realizarVenda method, of class Caixa.
     */
    @Test
    public void testRealizarVenda() {
        System.out.println("realizarVenda");
        int id=0;
        String nome="Andre de Souza";
        String cpf="678954325-87";
        double valorTotal=124;
        Caixa instance = new Caixa(id, nome, cpf);
        Venda result = instance.realizarVenda(id, valorTotal);
        if(result==null)
            System.out.println("Venda realizada com sucesso!");
        else
            System.out.println("Venda não realizada!");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }}

    /**
     * Test of adicionarProduto method, of class Caixa.
     *//*
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
  /*  @Test
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
    }}*/