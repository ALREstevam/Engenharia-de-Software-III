/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import java.util.ArrayList;
import java.util.List;
import model.fornecedores.Produto;
import model.fornecedores.ProdutoPerecivel;
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
 * @author Pedro
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
        String titulo = "Relatorio de Compras";
        String texto = "........................";
        String data = "28/09/2017";
        int id=0;
        String nome= "João da Silva";
        String cpf="978143856-0";
        Gerente instance = new Gerente(id, nome, cpf);
        if(instance.gerarRelatorioCompras(titulo, texto, data)!=null)
            System.out.println("Relatório de Compras gerado com sucesso!");
        else
            System.out.println("Falha ao gerar relatório de Compras!");
        // TODO review the generated test code and remove the default call to fail.
    
    }
    /**
     * Test of gerarRelatorioVendas method, of class Gerente.
     */
    @Test
    public void testGerarRelatorioVendas() {
        System.out.println("gerarRelatorioVendas");
        String titulo = "Relatorio de Vendas";
        String texto = "..................................";
        String data = "12/07/2017"; 
        int id=0;
        String nome="João da Silva";
        String cpf="978143856-0";
        Gerente instance = new Gerente(id, nome,cpf);
        if(instance.gerarRelatorioVendas(titulo, texto, data)!=null)
            System.out.println("Relatório de Vendas gerado com sucesso!");
        else
            System.out.println("Falha ao gerar Relatório de Vendas!");
    }

    /**
     * Test of comprarProduto method, of class Gerente.
     */
    @Test
    public void testComprarProduto() {
        System.out.println("comprarProduto");
        int idproduto=0;
        String nome="charuto"; 
        String descricao=";;;;;"; 
        float preco=13;
        Produto prod = new Produto(idproduto, nome, descricao, preco);
        int id=0;
        String nomeG= "João da Silva";
        String cpf="978143856-0";
        Gerente instance = new Gerente(id, nomeG, cpf);
        int quantidade=250;
        double valorVenda=8;
        ProdutoLoja result = instance.comprarProduto(prod, quantidade, valorVenda);
        if(result!=null){
            System.out.println("Compra de produto realizada com sucesso!");
        }
        else
            System.out.println("Compra não realizada!");
    }}