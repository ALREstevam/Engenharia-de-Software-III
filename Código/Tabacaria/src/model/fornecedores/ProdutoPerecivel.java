package model.fornecedores;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	private Date dataProducao;

	private Date dataValidade;

	private String modoConservacao;

    public ProdutoPerecivel(Date dataProducao, Date dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {
        super(id, nome, descricao, preco);
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
        this.modoConservacao = modoConservacao;
    }

    ProdutoPerecivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ProdutoPerecivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getModoConservacao() {
        return modoConservacao;
    }

    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

    

	public boolean naValidade() {
		return false;
	}

}
