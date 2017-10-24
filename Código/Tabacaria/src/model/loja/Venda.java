package model.loja;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import model.fornecedores.Produto;
import model.notasFiscais.NotaFiscalVenda;

@Entity
public class Venda implements Serializable{

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        /*@OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
	private List<ProdutoLoja> produtos;*/
        
        /*
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
        */
        
        /*
        @OneToOne(mappedBy = "Produto")
        @ElementCollection
        @JoinColumn(name="PART_ID")
        */
        
        @ElementCollection
        @CollectionTable(
              name="produtos",
              joinColumns=@JoinColumn(name="p_id")
        )
        @Column(name="a_id")
        private List<ProdutoLoja> produtos;


        @Column
	private double valorTotal;
        
        
    public Venda(int id) {

        this.id = id;
        this.produtos =  new ArrayList();
        this.valorTotal = 0;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ProdutoLoja> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorAdc) {
        this.valorTotal += valorTotal;
    }
     /**
     *
     */
    public boolean adicionarProduto(ProdutoLoja p, int qtd) {
        
        setValorTotal(p.getPrecoVenda()*qtd);
        return this.produtos.add(p);
    }

    /**
     *
     */
    public boolean removerProduto(ProdutoLoja p,int qtd ) {
        setValorTotal(-1*(p.getPrecoVenda()*qtd));
        
        return this.produtos.remove(p);
    }
    /**
     * 
     * @return 
     */
    public boolean vendaVazia (){
        
        return this.produtos.isEmpty();
    }
}
