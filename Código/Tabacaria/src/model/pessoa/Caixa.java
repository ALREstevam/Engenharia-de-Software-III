package model.pessoa;

import java.io.Serializable;
import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;


public class Caixa extends Funcionario implements Serializable {
    public Caixa(int id, String nome, int cpf) {

        super(id, nome, cpf);
    }

    public Caixa() {
    }
    
    
    
    

    /**
     *
     * @return 
     */
    public NotaFiscalVenda emitirNotaVenda() {
        return null;
    }

    /**
     *
     * @return 
     */
    public NotaFiscalCompra receberPagamento() {
        return null;
    }

    /**
     *
     * @return 
     */
    public Venda realizarVenda() {
        return null;
    }

    /**
     *
     */
    public boolean adicionarProduto() {
        return false;
    }

    /**
     *
     * @return 
     */
    public boolean removerProduto() {
        return false;
    }

    /**
     *
     * @return 
     */
    public Venda finalizarVenda() {
        return null;
    }

    /**
     *
     * @return 
     */
    public Pedido obterDadosEntrega(int id) {
        Pedido p = null;
        return p;
    }

    Object obterDadosEntrega() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
