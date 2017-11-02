/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import java.util.ArrayList;
import java.util.List;
import model.fornecedores.Produto;
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
        if(result!=null)
            System.out.println("Venda realizada com sucesso!");
        else
            System.out.println("Venda não realizada!");
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
        int id1=0;
        List<ProdutoLoja> produtos=new ArrayList();
        double valorTotal=120;
        Venda vend= new Venda(id1, produtos, valorTotal);
        int id2=1;
        String nome2="cigarro";
        String descricao="....";
        float preco=8;
        Produto produto=new Produto(id2, nome2, descricao, preco);
        int quantidadeEstoque=30;
        double precoVenda=14;
        ProdutoLoja prod=new ProdutoLoja(produto, quantidadeEstoque, precoVenda);
        boolean result = instance.adicionarProduto(vend ,prod);
        if (result) {
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Erro na adicao do produto!");
        }
        
        
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
        int id1=0;
        List<ProdutoLoja> produtos=new ArrayList();
        double valorTotal=120;
        Venda vend= new Venda(id1, produtos, valorTotal);
        int id2=1;
        String nome2="cigarro";
        String descricao="....";
        float preco=8;
        Produto produto=new Produto(id2, nome2, descricao, preco);
        int quantidadeEstoque=30;
        double precoVenda=14;
        ProdutoLoja prod=new ProdutoLoja(produto, quantidadeEstoque, precoVenda);
        instance.adicionarProduto(vend, prod);
        boolean result = instance.removerProduto(vend, prod);
        if (result) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Falha na remocao do produto!");
        }
       // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
 /**
     * Test of emitirNotaVenda method, of class Caixa.
     */
    @Test
    public void testEmitirNotaVenda_0args() {
        System.out.println("emitirNotaVenda");
        int id=0;
        String nome="Flavia";
        String cpf="975373167-20";
        Caixa instance = new Caixa(id, nome, cpf);
        NotaFiscalVenda result = instance.emitirNotaVenda();
        if(result==null){
            System.out.println("Nota fiscal de venda emitida!");
        } else {
            System.out.println("Falha na emissão da nota!");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of emitirNotaVenda method, of class Caixa.
     */
    @Test
    public void testEmitirNotaVenda_19args() {
        System.out.println("emitirNotaVenda");
        String comentarioVenda = "";
        int id = 0;
        String prestadorNome = "Carlos Andrade";
        String prestadorEndereco = "Rua Coriolano Francisco Machado, 45";
        String prestadorCnpj = "123445678765-09";
        String tomadorNome = "Diego Souza";
        String tomadorEndereco = "Alameda Campinas, Edificio Acqua";
        int tomadorCnpj = 1234;
        String prestadorOutrosDados = "....";
        String tomadorOutrosDados = "....";
        String servicosLista = "";
        float valorNota = 1230;
        float deducoes = 12;
        float desconto = 10;
        float base = 0;
        float aliquota = 32;
        float iss = 0;
        float credito = 6;
        String outros = "";
        int id1=0;
        String nome="Flavia";
        String cpf="975373167-20";
        Caixa instance = new Caixa(id1, nome, cpf);
        NotaFiscalVenda result = instance.emitirNotaVenda(comentarioVenda, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=null){
            System.out.println("Nota fiscal de venda emitida!");
        } else {
            System.out.println("Falha na emissão da nota!");
        }
    
    }

    /**
     * Test of obterDadosEntrega method, of class Caixa.
     */
    @Test
    public void testObterDadosEntrega() {
        System.out.println("obterDadosEntrega");
        int id = 0;
        String receptorNome = "Gabriel Inacio";
        List<ProdutoLoja> produtos = new ArrayList();
        String endereco = "Alameda Santos , Jd.Paulista";
        float valorTotal = 178;
        int id1=0;
        String nome="Flavia";
        String cpf="975373167-20";
        Caixa instance = new Caixa(id1, nome, cpf);
        Pedido result = instance.obterDadosEntrega(id, receptorNome, produtos, endereco, valorTotal);
         if(result!=null){
            System.out.println("Dados obtidos com sucesso!");
        } else {
            System.out.println("Falha na obtenção dos dados!");
        }
        
    }}