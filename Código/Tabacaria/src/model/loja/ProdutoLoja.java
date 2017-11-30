package model.loja;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import model.fornecedores.Produto;
import view.comboboxModel.Descriptible;
import static view.comboboxModel.Descriptible.sep;
import view.tableModel.Arrayable;

@Entity
/**
 * Classe ProdutoLoja indica quais dos produtos fornecidos foram comprados e que
 * potencialmente estão sendo vendidos
 */
public class ProdutoLoja implements Serializable, Arrayable,Descriptible {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey)
    private Produto produto;

    @Column
    private int quantidadeEstoque;

    @Column
    private double precoVenda;

    /**
     * Construtor para a classe
     * @param produto
     * @param quantidadeEstoque
     * @param precoVenda 
     */
    public ProdutoLoja(Produto produto, int quantidadeEstoque, double precoVenda) {
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    public ProdutoLoja() {
    }
    
    

    /**
     * Obter o id do produto da loja
     * @return 
     */
    public long getId() {
        return id;
    }

    /**
     * Setar o id do produto da loja
     * @param id 
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obter o objeto produto 
     * @return 
     */
    public Produto getProduto() {
        return produto;
    }

    
    /**
     * Definir o objeto produto
     * @param produtoto 
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Obter a quantidade em estoque do produto
     * @return 
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Definir a quantidade em estoque do produto
     * @param quantidadeEstoque 
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Obter o preço de venda do produto
     * @return 
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Definir o preço de venda do produto
     * @param precoVenda 
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    
    public String getClassName() {
        return "ProdutoLoja";
    }
    @Override
    public String describe() {
        return this.id + sep + this.getProduto().getNome()+ sep + this.getPrecoVenda() + sep + this.getPrecoVenda() + sep + this.getQuantidadeEstoque();
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
        try{
            parsedId = Long.parseLong(arr[0]);
        }catch(Exception e){
            System.err.println("ERRO DE CONVERSÃO EM: Produto > id");
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
                case "nome":
                    rsp[rspCount] = this.getProduto().getNome();
                    break;
                case "qtd_estoque":
                    rsp[rspCount] = this.getQuantidadeEstoque();
                    break;
                case "preco_venda":
                    rsp[rspCount] = this.getPrecoVenda();
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
            case "preco_venda":
                try{
                    this.setPrecoVenda(utils.parse.NumberParser.getDoubleFrom((String)value));
                }catch(Exception e){
                    System.err.println("ERRO AO CONVERTER UM VALOR");
                }
                break;
            case "qtd_estoque":
                try{
                    this.setQuantidadeEstoque(utils.parse.NumberParser.getIntegerFrom((String)value));
                }catch(Exception e){
                    System.err.println("ERRO AO CONVERTER UM VALOR");
                }
                break;
            
            default:
                break;
        }
        return this;
    }
}
