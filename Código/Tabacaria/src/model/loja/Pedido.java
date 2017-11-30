package model.loja;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

@Entity
/**
 * A classe Pedido indica uma venda que deve ser entregue à domicílio
 */
public class Pedido extends Venda implements Serializable, Arrayable, Descriptible {

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
    public Pedido(String receptorNome, String endereco, int id, List<ItemCarrinho> produtos) {
        super(id, produtos);
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
    public Pedido(int id, List<ItemCarrinho> produtos) {
        super(id, produtos);
    }

    public Pedido() {
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
    @Override
    public String describe() {
        return this.getId() + sep + this.endereco + sep + this.receptorNome + sep + this.getStatus();
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
        Object[] rsp = new Object[4];
        int rspCount = 0;
        for (String s : order) {
            switch (s) {
                case "id":
                   
                    break;
                case "endereco":
                    rsp[rspCount] = this.getEndereco();
                    break;
                case "receptorNome":
                    rsp[rspCount] = this.getReceptorNome();
                    break;
                case "status":
                    rsp[rspCount] = this.getStatus();
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
                try{
                    this.setId(Long.parseLong((String)value));
                }
                catch(Exception e){
                
                }
                break;
            case "endereco":
                this.setEndereco((String) value);
                break;
            case "status":
               
                break;
            case "receptorNome":
                try{
                   this.setReceptorNome((String) value);
                }
                catch(Exception e){
                    System.err.println("ERRO DE CONVERSÃO NO CAMPO \"Produto > preço\"");
                }
                break;
            default:
                break;
        }
        return this;
    }
}
