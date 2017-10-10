package model.loja;

import model.notasFiscais.NotaFiscalVenda;

public class Venda  {

	private int id;

	private ProdutoLoja[] produtos;

	private int valorTotal;

    public Venda(int id, ProdutoLoja[] produtos, int valorTotal) {
        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProdutoLoja[] getProdutos() {
        return produtos;
    }

    public void setProdutos(ProdutoLoja[] produtos) {
        this.produtos = produtos;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
    
        
}
