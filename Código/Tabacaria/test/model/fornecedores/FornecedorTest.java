/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fornecedores;

import java.util.ArrayList;
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
public class FornecedorTest {

    public FornecedorTest() {
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
     * Test of novoProduto method, of class Fornecedor.
     */
    @Test
    public void testNovoProduto() {
        System.out.println("novoProduto");
        int id = 0;
        String nome = "Derby";
        String descricao = "Cigarro";
        float preco = 10;
        Fornecedor forn = new Fornecedor();
        boolean expResult = true;
        boolean result = forn.novoProduto(id, nome, descricao, preco);
        assertEquals(expResult, result);
        //if (expResult==result) 
            System.out.println("Produto cadastrado com sucesso!");
         //else 
            System.out.println("Falha no cadastro do produto");
        
        

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alterarProduto method, of class Fornecedor.
     */
    @Test
    public void testAlterarProduto_String_float() {
        System.out.println("alterarProduto");
        String nome = "Minister";
        float preco = 9.0F;
        Fornecedor instance = new Fornecedor();
        boolean expResult = true;
        boolean result = instance.alterarProduto(nome, preco);
        if(result==true)
        System.out.println("Produto alterado com sucesso!");    
            else
            System.out.println("Falha na alteracao do produto!");
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alterarProduto method, of class Fornecedor.
     */
    @Test
    public void testAlterarProduto_String_String() {
        System.out.println("alterarProduto");
        String nome = "";
        String descricao = "";
        Fornecedor instance = new Fornecedor();
        boolean expResult = false;
        boolean result = instance.alterarProduto(nome, descricao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of pararVenderProduto method, of class Fornecedor.
     */
    @Test
    public void testPararVenderProduto() {
        System.out.println("pararVenderProduto");
        String nome = "Fulano";
        Fornecedor instance = new Fornecedor();
        boolean expResult = true;
        boolean result = instance.pararVenderProduto(nome);
        if(result==true)
            System.out.println("Fornecedor não fornece mais produtos!");
        else
            System.out.println("Fornecedor ainda fornece produtos!");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

}
