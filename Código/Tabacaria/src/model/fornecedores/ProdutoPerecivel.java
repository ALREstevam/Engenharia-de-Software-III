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

@Entity
/**
 * ProdutoPerecivel é um tipo de produto com data de validade e modo de conservação
 */
public class ProdutoPerecivel extends Produto implements Serializable {

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

}
