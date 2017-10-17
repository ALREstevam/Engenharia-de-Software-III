package model.pessoa;

import java.io.Serializable;
import model.loja.Pedido;

public class Entregador extends Funcionario implements Serializable {

    public Entregador(int id, String nome, int cpf) {
        super(id, nome, cpf);
    }

    /**
     *
     *
     */
    public void entregarPedido(Pedido p) {
        
         p.entregar();
         
    }

    
}
