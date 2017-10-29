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

public class AdicionarProdutoSteps extends Steps {
    Produto prod = new Produto();
    Boolean result = false;
    
    @Given (&quot;Há um caixa cadastrado com id $x, nome $y e cpf$z &quot;)
    Caixa caixa = new Caixa(x, y, z);
    
    @When (&quot;Executar o método adicionarProduto&quot)
    result = caixa.adicionarProduto();
}

