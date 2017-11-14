package model.loja;

import dao.ClassNamable;
import java.io.Serializable;
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
/**
 * Classe Venda
 */
public class Venda implements Serializable, ClassNamable{

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
        
        
        /**
         * Construtor para a classe
         * @param id
         * @param produtos
         * @param valorTotal 
         */
    public Venda(int id, List<ProdutoLoja> produtos, double valorTotal) {

        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    /**
     * Obter o id da venda
     * @return 
     */
    public long getId() {
        return id;
    }

    
   /**
    * Definir o id da venda
    * @param id 
    */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obter a lista de produtos vendidos
     * @return 
     */
    public List<ProdutoLoja> getProdutos() {
        return produtos;
    }

    /**
     * Definir a lista de produtos vendidos
     * @param produtos 
     */
    public void setProdutos(List<ProdutoLoja> produtos) {
        this.produtos = produtos;
    }

    /**
     * Obter o valor total da venda
     * @return 
     */
    public double getValorTotal() {
        return valorTotal;
    }
    
    /**
     * Calcula o valor total da venda
     */
    public double recalcularValorTotal(){
        this.valorTotal = 0;
        for(ProdutoLoja elem : this.produtos){
            this.valorTotal += elem.getPrecoVenda();
        }
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
     /**
     * Adiciona um produto aos vendidos
     */
    public boolean adicionarProduto(ProdutoLoja prod) {
        
        if(this.produtos.add(prod)){
            this.valorTotal += prod.getPrecoVenda();
            return true;
        }
        return false;
    }

    /**
     * Remove um produto dos vendidos
     */
    public boolean removerProduto(ProdutoLoja prod) {
        if(this.produtos.remove(prod)){
            this.valorTotal -= prod.getPrecoVenda();
            return true;
        }
        return false;
    }

    @Override
    public String getClassName() {
        return "Venda";
    }
}
