package model.loja;

import dao.ClassNamable;
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
/**
 * A classe Pedido indica uma venda que deve ser entregue à domicílio
 */
public class Pedido extends Venda implements Serializable, ClassNamable {

    private static final long serialVersionUID = 1L;

    @Override
    public String getClassName() {
        return "Pedido";
    }

    public enum Status {
        entregue, naoEntregue
    };

    @Column
    private String receptorNome;

    @Column
    private String endereco;

    @Column
    private Status status;

    /**
     * Construtor da classe
     * @param receptorNome
     * @param endereco
     * @param id
     * @param produtos
     * @param valorTotal 
     */
    public Pedido(String receptorNome, String endereco, int id, List<ProdutoLoja> produtos, double valorTotal) {
        super(id, produtos, valorTotal);
        this.receptorNome = receptorNome;
        this.endereco = endereco;
        this.status = Status.naoEntregue;
    }

    /**
     * Construtor da classe
     * @param id
     * @param produtos
     * @param valorTotal 
     */
    public Pedido(int id, List<ProdutoLoja> produtos, int valorTotal) {
        super(id, produtos, valorTotal);
    }

    /**
     * Obter o nome do receptor do pedido
     * @return 
     */
    public String getReceptorNome() {
        return receptorNome;
    }

    /**
     * Definir o nome do receptor do pedido
     * @param receptorNome 
     */
    public void setReceptorNome(String receptorNome) {
        this.receptorNome = receptorNome;
    }

    /**
     * Obter o endereço de entrega do pedido
     * @return 
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Definir o endereço de entrega do pedido
     * @param endereco 
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obter o estado do pedio (se já foi entregue)
     * @return 
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Definir o estado do pedido
     * @param status 
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Entregar um pedido
     * Um atalho para definir um pedido como entregue
     */
    public void entregar() {
        setStatus(Status.entregue);
    }
}
