package model.loja;

import dao.ClassNamable;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

@Entity
/**
 * Classe Venda
 */
public class Venda implements Serializable, Arrayable, Descriptible, ClassNamable {

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
    
    
  
    /*
    @ElementCollection
    @CollectionTable(
            name = "produtos",
            joinColumns = @JoinColumn(name = "p_id")
    )
    @Column(name = "f_id")
    private List<Produto> produtos;
    
    */
    
    @ElementCollection
	@CollectionTable(name="carrinho", joinColumns=@JoinColumn(name="id"))
	@Column(name="prod")
    private List<ItemCarrinho> produtos;
    
    @Column
    private double valorTotal;

    /**
     * Construtor para a classe
     *
     * @param id
     * @param produtos
     * @param valorTotal
     */
    public Venda(int id, List<ItemCarrinho> produtos) {

        this.id = id;
        this.produtos = produtos;
        this.valorTotal = this.recalcularValorTotal();
    }

    public Venda() {
    }

    /**
     * Obter o id da venda
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * Definir o id da venda
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obter a lista de produtos vendidos
     *
     * @return
     */
    public List<ItemCarrinho> getProdutos() {
        return produtos;
    }

    /**
     * Definir a lista de produtos vendidos
     *
     * @param produtos
     */
    public void setProdutos(List<ItemCarrinho> produtos) {
        this.produtos = produtos;
    }

    /**
     * Obter o valor total da venda
     *
     * @return
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Calcula o valor total da venda
     */
    public double recalcularValorTotal() {
        this.valorTotal = 0;
        for (ItemCarrinho elem : this.produtos) {
            this.valorTotal += elem.getQuantidade() * elem.getProduto().getPrecoVenda();
        }
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Adiciona um produto aos vendidos
     */
    public boolean adicionarProduto(ItemCarrinho prod) {
        if (this.produtos.add(prod)) {
            this.valorTotal += prod.getQuantidade() * prod.getProduto().getPrecoVenda();
            return true;
        }
        return false;
    }

    /**
     * Remove um produto dos vendidos
     */
    public boolean removerProduto(ProdutoLoja prod) {
        if (this.produtos.remove(prod)) {
            this.valorTotal -= prod.getPrecoVenda();
            return true;
        }
        return false;
    }

    @Override
    public String getClassName() {
        return "Venda";
    }

    @Override
    public String describe() {
        return this.id + sep + this.valorTotal;
    }

    @Override
    public long getIdFromDescription() {
        /*
        String frase = "nome;teste;10";
        String array[] = new String[3];
        array = frase.split(";");
         */
        String description = this.describe();
        String arr[] = description.split(sep);

        Long parsedId = null;
        try {
            parsedId = Long.parseLong(arr[0]);
        } catch (Exception e) {
            System.err.println("ERRO DE CONVERSÃO EM: Venda > id");
        }
        return parsedId;
    }

    @Override
    public Object[] attributesToArray(String[] order) {
        Object[] rsp = new Object[4];
        int rspCount = 0;
        for (String s : order) {
            switch (s) {
                case "id":
                    rsp[rspCount] = this.getId();
                    break;
                case "valorTotal":
                    rsp[rspCount] = this.valorTotal;
                    break;

                default:
                    rsp[rspCount] = "";
                    break;
            }
            rspCount++;
        }
        return rsp;
    }

    @Override
    public Object setValue(String variable, Object value) {
        switch (variable) {
            case "id":

                break;
            case "valor":

                break;

            default:

                break;
        }
        return this;
    }

    @Override
    public String toString() {
        return this.describe();
    }
    
    
    
}
