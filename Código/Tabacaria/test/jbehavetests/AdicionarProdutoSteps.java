/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jbehavetests;

/**
 *
 * @author Karen
 */

import model.fornecedores.Produto;
import model.pessoa.Caixa;
import static org.jbehave.Ensure.ensureThat;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;
import tests.easymock.Caixa;

public class AdicionarProdutoSteps extends Steps {
    Caixa caixa = new Caixa;
    Boolean result = false;
    
    @Given (&quot;Há um caixa cadastrado com id $x, nome $y e cpf$z &quot;)
    public void preencherCaixa (Integer x, String y, Integer z) {
        caixa.id = x;
        caixa.nome = y;
        caixa.cpf = z;
    }
    
    @When (&quot;Executar o método adicionarProduto&quot)
    public void executarFuncao () {
        result = caixa.adicionarProduto();
    }
    
    @Then (&quot;Deve ser \&quot;$retorno\&quot;&quot;)
    public void checarResultado(String retorno) {
        ensureThat(result.toString().equals(retorno));
    }
}
