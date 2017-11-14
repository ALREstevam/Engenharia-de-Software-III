package model.pessoa;

import dao.ClassNamable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Funcionário define os dados e operações fundamentais que todo funcionário terá 
 */
public abstract class Funcionario implements Serializable, ClassNamable {

    @Override
    public String getClassName() {
        return "Funcionario";
    }
    
    public enum funcType{CAIXA, ENTREGADOR, GERENTE};
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column
    private String nome;

    @Column
    private String cpf;
    
    @Column
    private funcType func;

    /**
     * Construtor para a classe
     * @param id
     * @param nome
     * @param cpf 
     */
    public Funcionario(funcType func, int id, String nome, String cpf) {
        this.func = func;
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Obter id do funcionário
     * @return 
     */
    public long getId() {
        return id;
    }

    /**
     * Deifinir o id do funcionário
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obter o nome do funcionário
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Definir o nome do funcionário
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obter o CPF do funcionário
     * @return 
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Definir o CPF do funcionário
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}