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
    private int cnpj;

    @ElementCollection
    @CollectionTable(
            name = "produtos",
            joinColumns = @JoinColumn(name = "p_id")
    )
    @Column(name = "f_id")
    private List<Produto> produtos;

    /**
     * Construtor para o fornecedor
     *
     * @param id
     * @param nome
     * @param contato
     * @param cnpj
     */
    public Fornecedor(int id, String nome, String contato, int cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
        produtos = new ArrayList<>();
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
    public int getCnpj() {
        return cnpj;
    }

    /**
     * Setar o cnj do fornecedor
     *
     * @param cnpj
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * Obter a lista de produtos fornecidos
     *
     * @return
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Fornecedor começou a vender um novo tipo de produto
     */
    public boolean novoProduto(int id, String nome, String descricao, float preco) {
        Produto e = new Produto(id, nome, descricao, preco);
        return produtos.add(e);
    }

    /**
     * Fornecedor alterando um produto já cadastrado
     */
    public boolean alterarProduto(long id, float preco) {

        for (Produto e : produtos) {
            if (e.getId() == id) {
                produtos.remove(e);
                e.setPreco(preco);
                produtos.add(e);
                return true;
            }
        }

        return false;
    }

    /**
     * Fornecedor alterando um produto já cadastrado
     */
    public boolean alterarProduto(long id, String descricao) {
        for (Produto e : produtos) {
            if (e.getId() == id) {
                /*produtos.get(e.getId()).setNome(descricao);
                produtos.get(cnpj)*/
                produtos.remove(e);
                e.setDescricao(descricao);
                produtos.add(e);
                return true;
            }
        }
        return false;
    }

    /**
     * Fornecedor parou de vender o produto
     *
     * @param nome
     */
    public boolean pararVenderProduto(long id) {
        Produto p;
        for (Produto e : produtos) {
            if (e.getId() == id) {
                p = e;
                return produtos.remove(e);
            }
        }
        return false;
    }

    public long getId() {
        return id;
    }

    @Override
    public String getClassName() {
        return "Fornecedor";
    }

    @Override
    public Object[] attributesToArray(String[] order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object setValue(String variable, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String describe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getIdFromDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
