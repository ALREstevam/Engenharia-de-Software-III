package model.fornecedores;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import utils.DateUtils;

@Entity
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

    public ProdutoPerecivel(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {

        super(id, nome, descricao, preco);
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
        this.modoConservacao = modoConservacao;
    }

    public LocalDate getDataProducao() {
        return utils.DateUtils.asLocalDate(dataProducao);

    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
    }

    public LocalDate getDataValidade() {
        return utils.DateUtils.asLocalDate(dataValidade);
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
    }

    public String getModoConservacao() {
        return modoConservacao;
    }

    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

    public boolean naValidade() {
        if (utils.DateUtils.asLocalDate(this.dataValidade).isAfter(LocalDate.now())) {
            return false;
        }
        return true;
    }

}
