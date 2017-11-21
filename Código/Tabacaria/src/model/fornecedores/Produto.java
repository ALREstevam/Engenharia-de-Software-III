package model.fornecedores;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

@Table(name = "Produto")
@Entity
/**
 * Classe produto
 */
public class Produto implements Serializable, Descriptible, Arrayable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private double preco;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey)
    private Fornecedor forn;

    /*
        Como o preço de compra é diferente de acordo com cada fornecedor
        cada produto precisa estar ligado com apenas um fornecedor
     */

    /**
     * Construtor da classe
     *
     * @param id
     * @param nome
     * @param descricao
     * @param preco
     */
    public Produto(int id, String nome, String descricao, float preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }
    
    

    /**
     * Obeter id
     *
     * @return
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * Setar id
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obter o nome
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setar o nome
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obter a descrição do produto
     *
     * @return
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Setar a descrição do produto
     *
     * @param descricao
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obter o preço do produto
     *
     * @return
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Setar o preço do produto
     *
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String describe() {
        return this.id + sep + this.nome + sep + this.descricao + sep + this.preco;
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
                    rsp[rspCount] = this.getNome();
                    break;
                case "descricao":
                    rsp[rspCount] = this.getDescricao();
                    break;
                case "preco":
                    rsp[rspCount] = this.getPreco();
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
            case "nome":
                this.setNome((String) value);
                break;
            case "descricao":
                this.setDescricao((String) value);   
                break;
            case "preco":
                try{
                    this.setPreco(Double.parseDouble((String)value));
                }
                catch(Exception e){
                    System.err.println("ERRO DE CONVERSÃO NO CAMPO \"Produto > preço\"");
                }
                break;
            default:
                break;
        }
        return this;
    }
}
