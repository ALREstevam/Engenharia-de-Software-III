package model.fornecedores;

import java.util.ArrayList;

public class Fornecedor {

    private int id;

    private String nome;

    private String contato;

    private int cnpj;
    private ArrayList<Produto> produtos;

    public Fornecedor(int id, String nome, String contato, int cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
        produtos = new ArrayList();
    }

    Fornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public ArrayList<Produto> getProdutos() {
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
        
        for (Produto e : produtos){
            if (e.getNome().equals(nome)){
                produtos.get(e.getId()).setPreco(preco);
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
    public boolean alterarProduto(String nome,String descricao) {
        
         for (Produto e : produtos){
            if (e.getNome().equals(nome)){
                produtos.get(e.getId()).setNome(descricao);
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
        for (Produto e : produtos){
            if (e.getNome().equals(nome)){
                produtos.remove(e.getId());
                return true;
            }
        }
        
        return false;
    }

}
