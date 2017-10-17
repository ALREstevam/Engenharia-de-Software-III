package model.pessoa;

import java.io.Serializable;

public class Entregador extends Funcionario implements Serializable {

    public Entregador(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    /**
     *
     *
     */
    public boolean entregarPedido() {
        return false;
    }

    /**
     *
     *
     */
    public void retornarPedido() {

    }

}
