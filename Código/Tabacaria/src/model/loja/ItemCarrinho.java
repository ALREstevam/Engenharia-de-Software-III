/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.loja;

import dao.ClassNamable;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

/**
 *
 * @author andre
 */
@Entity
public class ItemCarrinho implements Serializable, Arrayable, Descriptible, ClassNamable{

    @Id
    private Long ID;
    
    @ManyToAny(metaColumn = @Column(name = "prod"))
    @JoinColumn(foreignKey = @ForeignKey)
    private ProdutoLoja produto;
    
    @Column
    private int quantidade;

    public ItemCarrinho() {
    }

    public ItemCarrinho(ProdutoLoja produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public ProdutoLoja getProduto() {
        return produto;
    }

    public void setProduto(ProdutoLoja produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String getClassName() {
        return "Carrinho";
    }
    
    @Override
    public Object[] attributesToArray(String[] order) {
        Object[] rsp = new Object[3];
        int rspCount = 0;
        for (String s : order) {
            switch (s) {
                case "id":
                    rsp[rspCount] = this.getId();
                    break;
                case "produto":
                    rsp[rspCount] = this.produto.getProduto().getNome();
                    break;
                    
                case "quantidade":
                    rsp[rspCount] = this.quantidade;
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
            case "produto":
                break;
            case "quantidade":
                try{
                    this.quantidade = utils.parse.NumberParser.getIntegerFrom((String)value);
                }catch(Exception e){
                    
                }
                break;
            default:

                break;
        }
        return this;
    }

    @Override
    public String describe() {
        return this.ID + sep + this.produto.getProduto().getNome() + sep + this.quantidade;
    }

    @Override
    public long getId() {
        return this.ID;
    }

    @Override
    public long getIdFromDescription() {
        String description = this.describe();
        String arr[] = description.split(sep);

        Long parsedId = null;
        try {
            parsedId = Long.parseLong(arr[0]);
        } catch (Exception e) {
            System.err.println("ERRO DE CONVERSÃO EM: Produto > id");
        }
        return parsedId;
    }

    public void setID(long i) {
        this.ID = i;
    }

    

    
}
