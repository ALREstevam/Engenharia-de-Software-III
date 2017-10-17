package model.fornecedores;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class ProdutoPerecivel extends Produto {
       
        private LocalDate dataProducao;



	private LocalDate dataValidade;



	
	private String modoConservacao;
       

    public ProdutoPerecivel(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {

        super(id, nome, descricao, preco);
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
        this.modoConservacao = modoConservacao;
    }


    
    



    public LocalDate getDataProducao() {

        return dataProducao;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getModoConservacao() {
        return modoConservacao;
    }

    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

    

	public boolean naValidade() {
            if (Integer.parseInt(dataValidade.format(DateTimeFormatter.BASIC_ISO_DATE)) > Integer.parseInt(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE))){
                return true;
            } else {
                return false;
            }
		
	}

}
