/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pessoa;

import java.util.ArrayList;
import java.util.List;
import model.loja.Pedido;
import model.loja.ProdutoLoja;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karen
 */
public class EntregadorTest {
    
    public EntregadorTest() {
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
     * Test of entregarPedido method, of class Entregador.
     */
    @Test
    public void testEntregarPedido() {
        System.out.println("entregarPedido");
        int id=0;
        String nome="José Rezende";
        String cpf="654848390-41";
        Entregador p = new Entregador(id, nome, cpf);
        String receptorNome="Pedro"; 
        String endereco="Rua das Flores, 123"; 
        int id1=2; 
        List<ProdutoLoja> produtos= new ArrayList(); 
        double valorTotal=140;
        Pedido ped=new Pedido(receptorNome, endereco, id1,produtos, valorTotal);    
        boolean result = p.entregarPedido(ped);  
        if(result) {
            System.out.println("Entrega realizada com sucesso!");
        } else {
            System.out.println("Erro na realização da entrega!");
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }}
    /**
     * Test of retornarPedido method, of class Entregador.
     */