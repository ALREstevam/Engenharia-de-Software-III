package model.fornecedores;

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

@Entity
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String nome;

    @Column
    private String contato;

    @Column
    private int cnpj;

    @ElementCollection
        @CollectionTable(
              name="produtos",
              joinColumns=@JoinColumn(name="p_id")
        )
        @Column(name="f_id")
    private List<Produto> produtos;
    
    

    public Fornecedor(int id, String nome, String contato, int cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
        produtos = new ArrayList<>();
    }

    /**
     *
     *
     *
     */
    public Produto novoProduto() {
        return null;
    }

    /**
     *
     *
     *
     */
    public Produto alterarProduto() {
        return null;
    }

    /**
     *
     *
     *
     */
    public boolean pararVenderProduto() {
        return false;
    }





    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     *
     *
     *
     */
    public boolean novoProduto(int id, String nome, String descricao, float preco) {
        Produto e = new Produto(id, nome, descricao, preco);
        return produtos.add(e);
    }

    /**
     *
     *
     *
     */
    public boolean alterarProduto(String nome, float preco) {

        for (Produto e : produtos) {
            if (e.getNome().equals(nome)) {
                e.setPreco(preco);
                return true;
            }
        }

        return false;
    }

    /**
     *
     *
     *
     */
    public boolean alterarProduto(String nome, String descricao) {
        for (Produto e : produtos) {
            if (e.getNome().equals(nome)) {
                /*produtos.get(e.getId()).setNome(descricao);
                produtos.get(cnpj)*/
                
                e.setNome(nome);
                e.setDescricao(descricao);
                return true;
            }
        }
        return false;
    }

    /**
     *
     *
     *
     */
    public boolean pararVenderProduto(String nome) {
        Produto p;
        for (Produto e : produtos) {
            if (e.getNome().equals(nome)) {
                p = e;
               return produtos.remove(e);
            }
        }
        return false;
    }
}
