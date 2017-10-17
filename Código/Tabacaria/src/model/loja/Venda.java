package model.loja;

import model.notasFiscais.NotaFiscalVenda;

public class Venda  {

	private int id;

	private ProdutoLoja[] produtos;

	private float valorTotal;

    public Venda(int id, ProdutoLoja[] produtos, float valorTotal) {
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

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
        
}
