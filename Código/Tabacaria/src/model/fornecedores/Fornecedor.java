package model.fornecedores;

<<<<<<< HEAD
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private String cnpj;

    public Fornecedor(String nome, String contato, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
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
=======
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
>>>>>>> refs/remotes/origin/master

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

        
        
}
