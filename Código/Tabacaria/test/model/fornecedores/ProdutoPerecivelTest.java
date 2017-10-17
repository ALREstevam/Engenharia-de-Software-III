/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fornecedores;

import java.util.Date;
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
        String dataProducao="28/09/2017";
        String dataValidade="16/10/2018";
        String modoConservacao="Não deverá estar em local úmido";
        int id=0;
        String descricao="...";
        float preco=10;
        
        System.out.println(" Teste naValidade");
        ProdutoPerecivel instance= new ProdutoPerecivel(dataProducao, dataValidade,  modoConservacao,  id,  nome,  descricao,  preco);
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

    /**
     * Test of getDataProducao method, of class ProdutoPerecivel.
     */
    @Test
    public void testGetDataProducao() {
        System.out.println("getDataProducao");
        ProdutoPerecivel instance = null;
        Date expResult = null;
        Date result = instance.getDataProducao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataProducao method, of class ProdutoPerecivel.
     */
    @Test
    public void testSetDataProducao() {
        System.out.println("setDataProducao");
        Date dataProducao = null;
        ProdutoPerecivel instance = null;
        instance.setDataProducao(dataProducao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataValidade method, of class ProdutoPerecivel.
     */
    @Test
    public void testGetDataValidade() {
        System.out.println("getDataValidade");
        ProdutoPerecivel instance = null;
        Date expResult = null;
        Date result = instance.getDataValidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataValidade method, of class ProdutoPerecivel.
     */
    @Test
    public void testSetDataValidade() {
        System.out.println("setDataValidade");
        Date dataValidade = null;
        ProdutoPerecivel instance = null;
        instance.setDataValidade(dataValidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModoConservacao method, of class ProdutoPerecivel.
     */
    @Test
    public void testGetModoConservacao() {
        System.out.println("getModoConservacao");
        ProdutoPerecivel instance = null;
        String expResult = "";
        String result = instance.getModoConservacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModoConservacao method, of class ProdutoPerecivel.
     */
    @Test
    public void testSetModoConservacao() {
        System.out.println("setModoConservacao");
        String modoConservacao = "";
        ProdutoPerecivel instance = null;
        instance.setModoConservacao(modoConservacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
