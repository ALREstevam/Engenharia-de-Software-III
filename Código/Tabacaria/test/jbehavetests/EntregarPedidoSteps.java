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

import model.loja.Entregador;
import static org.jbehave.Ensure.ensureThat;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;
import tests.easymock.Pedido;

public class EntregarPedidoSteps extends Steps {
    Entregador entregador = new Entregador;
    Boolean results =false;
    
    @Given (&quot;Há um entregador cadastrado com id $x, nome $y e cpf$z &quot;)
    public void preencherPedido (Integer x, String y, Integer z) {
        Entregador.id = x;
        Entregador.nome = y;
        Entregador.cpf = z;
    }
    
    @When (&quot;Executar o método entregarPedido&quot)
    public void executarFuncao () {
        results = entregador.entregarPedido();
    }
    
    @Then (&quot;Deve ser \&quot;$retorno\&quot;&quot;)
    public void checarResultado(String retorno) {
        ensureThat(results.toString().equals(retorno));
    }
}


