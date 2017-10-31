/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbehavetests;

/**
 *
 * @author huann
 */
public class EntregarPedido extends Scenario {
    public EntregarPedido(){
       addSteps(new EntregarPedidoSteps());

    }
}



