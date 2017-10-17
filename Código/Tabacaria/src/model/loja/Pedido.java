package model.loja;

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
public class Pedido extends Venda implements Serializable {

    private static final long serialVersionUID = 1L;

    public enum Status {
        entregue, naoEntregue
    };

    @Column
    private String receptorNome;

    @Column
    private String endereco;

    @Column
    private Status status;

<<<<<<< HEAD
    public Pedido(String receptorNome, String endereco, int id, ProdutoLoja[] produtos, float valorTotal) {
=======
    public Pedido(String receptorNome, String endereco, int id, List<ProdutoLoja> produtos, int valorTotal) {
>>>>>>> origin/master
        super(id, produtos, valorTotal);
        this.receptorNome = receptorNome;
        this.endereco = endereco;
        this.status = Status.naoEntregue;
    }

    public Pedido(int id, List<ProdutoLoja> produtos, int valorTotal) {
        super(id, produtos, valorTotal);
    }
    
    
    

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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void entregar() {
        setStatus(Status.entregue);
    }
}
