package model.notasFiscais;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscalVenda extends NotaFiscal implements Serializable{

    private String content;
    private String comentarioVenda;

    public NotaFiscalVenda(String comentarioVenda, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        super(id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        this.comentarioVenda = comentarioVenda;
    }

    public String getComentarioVenda() {
        return comentarioVenda;
    }

    public void setComentarioVenda(String comentarioVenda) {
        this.comentarioVenda = comentarioVenda;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
