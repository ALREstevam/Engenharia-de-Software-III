package model.fornecedores;

import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import view.comboboxModel.Descriptible;
import view.tableModel.Arrayable;

@Entity
/**
 * ProdutoPerecivel é um tipo de produto com data de validade e modo de conservação
 */
public class ProdutoPerecivel extends Produto implements Serializable, Arrayable, Descriptible {

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataProducao;

    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataValidade;

    @Column
    private String modoConservacao;

    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey)
    private Produto produtoBase;


    /**
     * Construtor da classe
     * @param dataProducao
     * @param dataValidade
     * @param modoConservacao
     * @param id
     * @param nome
     * @param descricao
     * @param preco 
     */
    public ProdutoPerecivel(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {

        super(id, nome, descricao, preco);
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
        this.modoConservacao = modoConservacao;
    }

    public ProdutoPerecivel() {
    }
    
    

    /**
     * Obter a data de produção
     * @return 
     */
    public LocalDate getDataProducao() {
        return utils.DateUtils.asLocalDate(dataProducao);

    }

    /**
     * Definir a data de produção
     * @param dataProducao 
     */
    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
    }

    /**
     * Obter a data de validade
     * @return 
     */
    public LocalDate getDataValidade() {
        return utils.DateUtils.asLocalDate(dataValidade);
    }

    /**
     * Setar a data de validade
     * @param dataValidade 
     */
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
    }

    /**
     * Obter o texto com o modo de conservação
     * @return 
     */
    public String getModoConservacao() {
        return modoConservacao;
    }

    /**
     * Definir o modo de conservação
     * @param modoConservacao 
     */
    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

    /**
     * Testando se um produto está na validade usando a data atual do sistema
     * @return 
     */
    public boolean naValidade() {
        return utils.DateUtils.asLocalDate(this.dataValidade).isAfter(LocalDate.now());
    }

    public String getClassName() {
        return "ProdutoPerecivel";
    }
       @Override
    public String describe() {
        return this.getId() + sep + this.getNome() + sep + this.getDescricao() + sep + this.getPreco() + sep + this.modoConservacao + sep + this.dataProducao + sep + this.dataValidade;
    }

  
        

    @Override
    public Object[] attributesToArray(String[] order) {
        Object[] rsp = new Object[7];
        int rspCount = 0;
        for (String s : order) {
            switch (s) {
                case "id":
                    rsp[rspCount] = this.getId();
                    break;
                case "nome":
                    rsp[rspCount] = this.getNome();
                    break;
                case "descricao":
                    rsp[rspCount] = this.getDescricao();
                    break;
                case "preco":
                    rsp[rspCount] = this.getPreco();
                    break;
                case "dataValidade" :
                    rsp[rspCount] = this.getDataValidade();
                case "dataProducao" :
                    rsp[rspCount] = this.getDataProducao();
                case "modoConservacao" :
                    rsp[rspCount] = this.getModoConservacao();
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
            case "nome":
                this.setNome((String) value);
                break;
            case "descricao":
                this.setDescricao((String) value);   
                break;
            case "preco":
                try{
                    this.setPreco(Double.parseDouble((String)value));
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
