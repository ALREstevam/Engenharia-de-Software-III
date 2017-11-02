/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fornecedores;


import java.util.ArrayList;
import java.util.List;
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
        String nome2="Jose da Silva";
        String contato="32424242";
        int cnpj=987;
        Fornecedor f = new Fornecedor(id, nome2, contato, cnpj);
        boolean result = f.novoProduto(id, nome, descricao, preco);
        if (result) 
            System.out.println("Produto cadastrado com sucesso!");
         else 
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
        int id=0;
        String nome = "Minister";
        String descricao="cigarro";
        float preco = 9;
        String contato="19976622222";
        int cnpj=3222;
        Fornecedor f = new Fornecedor(id, nome, contato, cnpj);
        f.novoProduto(id, nome, descricao, preco);
        preco=10;
        descricao="CIGARRO";
        boolean result0=f.alterarProduto(id, descricao);
        boolean result = f.alterarProduto(id, preco);
        if(result & result0)
        System.out.println("Produto alterado com sucesso!");    
        else{
            System.out.println("Falha na alteracao do produto!");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pararVenderProduto method, of class Fornecedor.
     */
    @Test
    public void testPararVenderProduto() {
        System.out.println("pararVenderProduto");
        int id=0;
        String nome = "Fulano";
        String contato="19- 34121298";
        int cnpj=1234;
        String nome1 = "Minister";
        String descricao="cigarro";
        float preco = 9;
        Fornecedor instance = new Fornecedor(id, nome, contato, cnpj);
        instance.novoProduto(id, nome1, descricao, preco);     
        boolean result = instance.pararVenderProduto(id);
        if(result==true)
            System.out.println("Fornecedor não fornece mais produtos!");
        else
            System.out.println("Fornecedor ainda fornece produtos!");
    }}
