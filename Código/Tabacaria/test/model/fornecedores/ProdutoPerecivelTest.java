/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fornecedores;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        String data= "10/10/2017";
        String data2 = "20/10/2017"; 
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataProducao =  LocalDate.parse(data, fo);
        LocalDate dataValidade =  LocalDate.parse(data2, fo);
        String modoConservacao="Não deverá estar em local úmido";
        int id=0;
        String descricao="...";
        float preco=10;
        int id1=2;
        String nome1="Joao Paulo";
        String contato="98775455";
        int cnpj=1234;
        System.out.println(" Teste naValidade");
        Fornecedor f= new Fornecedor(id1, nome1, contato, cnpj);
        ProdutoPerecivel instance= new ProdutoPerecivel(dataProducao, dataValidade,  modoConservacao,  id,  nome,  descricao,  preco);
        boolean result = instance.naValidade();
        if(result)
            System.out.println("Produto está na validade");
        else
            System.out.println("Produto vencido");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }}

    /**
     * Test of getDataProducao method, of class ProdutoPerecivel.
     */