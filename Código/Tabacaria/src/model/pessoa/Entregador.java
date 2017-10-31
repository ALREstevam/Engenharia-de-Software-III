package model.pessoa;

import java.io.Serializable;
import model.loja.Pedido;

public class Entregador extends Funcionario implements Serializable {

    public Entregador(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    /**
     *
     *
     */
    public boolean entregarPedido(Pedido p) {
        
         p.entregar();
         
    }

    
}
