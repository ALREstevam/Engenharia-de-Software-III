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

    public Entregador(int id, funcType func, String nome, String cpf) {
        super(id, func, nome, cpf);
    }

    public Entregador() {
    }
    
    

    /**
     * Entregador marcando pedido como entregue
     */
    public boolean entregarPedido(Pedido p) {
         p.entregar();
         return true;
    }

    
}
