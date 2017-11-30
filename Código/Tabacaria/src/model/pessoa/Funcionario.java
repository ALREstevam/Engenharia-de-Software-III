package model.pessoa;

import dao.ClassNamable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import view.comboboxModel.Descriptible;
import static view.comboboxModel.Descriptible.sep;
import view.tableModel.Arrayable;

@Entity
/**
 * Funcionário define os dados e operações fundamentais que todo funcionário terá 
 */
public  class Funcionario implements Serializable, Arrayable,Descriptible {

   
    public String getClassName() {
        return "Funcionario";
    }
    
    public enum funcType{CAIXA, ENTREGADOR, GERENTE};
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String func;
    @Column
    private String nome;

    @Column
    private String cpf;
    
   

    /**
     * Construtor para a classe
     * @param id
     * @param func
     * @param nome
     * @param cpf 
     */
    public Funcionario (int id, funcType func, String nome, String cpf) {
        System.out.println(func);
        this.id = id;
        this.func = func.toString();
        this.nome = nome;
        this.cpf = cpf;
    }
    public Funcionario(){
        
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
    
    public String getFunc(){
        return this.func;
    }

    @Override
    public String describe() {
        return this.id + sep + this.nome + sep + this.cpf ;
    }

    @Override
    public long getIdFromDescription() {
        /*
        String frase = "nome;teste;10";
        String array[] = new String[3];
        array = frase.split(";");
        */
        String description = this.describe();
        String arr[] = description.split(sep);
        
        Long parsedId = null;
        try{
            parsedId = Long.parseLong(arr[0]);
        }catch(Exception e){
            System.err.println("ERRO DE CONVERSÃO EM: Produto > id");
        }
        return parsedId;
    }
        

    @Override
    public Object[] attributesToArray(String[] order) {
        Object[] rsp = new Object[5];
        int rspCount = 0;
        for (String s : order) {
            
            switch (s) {
                case "id":
                   rsp[rspCount] = this.getId();
                    break;
                case  "cargo"  :
                    rsp[rspCount] = this.getFunc();
                    break;
                case "nome":
                    rsp[rspCount] = this.getNome();
                    break;
                case "cpf":
                    rsp[rspCount] = this.getCpf();
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
            case "cpf":
                this.setCpf((String) value);   
                break;
            
            default:
                break;
        }
        return this;
    }

}