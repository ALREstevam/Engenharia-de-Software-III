package model.pessoa;

import java.io.Serializable;
import javax.persistence.Entity;
import model.loja.Pedido;

/**
 * O entregador é o funcionário responsável por entregar um pedido aos clientes 
 * que requisitaram entrega à domicílio
 * @author andre
 */
@Entity
public class Entregador extends Funcionario implements Serializable {
    
    
    @Override
    public String getClassName() {
        return "Entregador";
    }
    
    /**
     * Construtor da classe
     * @param id
     * @param nome
     * @param cpf 
     */
    public Entregador(int id, String nome, String cpf) {
        super(funcType.ENTREGADOR ,id, nome, cpf);
    }

    /**
     * Entregador marcando pedido como entregue
     */
    public boolean entregarPedido(Pedido p) {
         p.entregar();
         return true;
    }

    
}
