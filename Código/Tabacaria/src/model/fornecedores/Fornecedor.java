package model.fornecedores;

import dao.ClassNamable;
import java.io.Serializable;
import java.util.ArrayList;
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
public class Fornecedor implements Serializable, ClassNamable, Arrayable, Descriptible {

    private static final long serialVersionUID = 1L;//ID do fornecedor

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nome;

    @Column
    private String contato;

    @Column
    private String cnpj;

    /*@ElementCollection
    @CollectionTable(
            name = "produtos",
            joinColumns = @JoinColumn(name = "p_id")
    )
    @Column(name = "f_id")
    private List<Produto> produtos;*/

    /**
     * Construtor para o fornecedor
     *
     * @param id
     * @param nome
     * @param contato
     * @param cnpj
     */
    public Fornecedor(int id, String nome, String contato, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
    }

    public Fornecedor() {
    }
    
    

    /**
     * Setar o id do fornecedor
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Obter o nome do fornecedor
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setar o nome do fonecedor
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obter os dados de contato do fornecedor
     *
     * @return
     */
    public String getContato() {
        return contato;
    }

    /**
     * Setar os dados de contato do fornecedor
     *
     * @param contato
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Obter o cnpj do fornecedor
     *
     * @return
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Setar o cnj do fornecedor
     *
     * @param cnpj
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getClassName() {
        return "Fornecedor";
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
                case "contato":
                    rsp[rspCount] = this.getContato();
                    break;
                case "cnpj":
                    rsp[rspCount] = this.getCnpj();
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
            case "contato":
                this.setContato((String) value);   
                break;
            case "cnpj":
                this.setCnpj((String)value);
                break;
            default:
                break;
        }
        return this;
    }
    

    @Override
    public String describe() {
        return this.id + sep + this.nome + sep + this.contato + sep + this.cnpj;
    }

    @Override
    public long getIdFromDescription() {
        String description = this.describe();
        String arr[] = description.split(sep);
        
        Long parsedId = null;
        try{
            parsedId = Long.parseLong(arr[0]);
        }catch(Exception e){
            System.err.println("ERRO DE CONVERSÃO EM: Fornecedor > id");
        }
        return parsedId;
    }

}
