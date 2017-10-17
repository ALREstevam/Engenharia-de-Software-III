package model.loja;

<<<<<<< HEAD
import model.fornecedores.Produto;

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

@Entity
public class Pedido extends Venda implements Serializable{
        private static final long serialVersionUID = 1L;
       
        /*@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;*/

        @Column
	private String receptorNome;

        @Column
	private String endereco;
        
        
	public void entregar() {
=======
public class Pedido extends Venda {

    private String receptorNome;

    private String endereco;

    private boolean status;

    public Pedido(String receptorNome, String endereco, int id, ProdutoLoja[] produtos, int valorTotal) {
        super(id, produtos, valorTotal);
        this.receptorNome = receptorNome;
        this.endereco = endereco;
        this.status = false;
    }
>>>>>>> refs/remotes/origin/master

    public String getReceptorNome() {
        return receptorNome;
    }

    public void setReceptorNome(String receptorNome) {
        this.receptorNome = receptorNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void entregar() {

        setStatus(true);

    }
}
