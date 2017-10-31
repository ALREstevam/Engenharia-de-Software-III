package model.pessoa;

import java.io.Serializable;
import model.loja.Pedido;

/**
 * O entregador é o funcionário responsável por entregar um pedido aos clientes 
 * que requisitaram entrega à domicílio
 * @author andre
 */
public class Entregador extends Funcionario implements Serializable {
    /**
     * Construtor da classe
     * @param id
     * @param nome
     * @param cpf 
     */
    public Entregador(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    /**
     * Entregador marcando pedido como entregue
     */
    public void entregarPedido(Pedido p) {
         p.entregar();
    }

    
}
