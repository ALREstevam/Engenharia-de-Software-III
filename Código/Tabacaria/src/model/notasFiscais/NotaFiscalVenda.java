package model.notasFiscais;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Nota fiscal de venda é um tipo especial de nota fiscal emitido quando a loja
 * faz uma venda para um cliente
 */
public class NotaFiscalVenda extends NotaFiscal implements Serializable{

    private String content;
    private String comentarioVenda;

    /**
     * Construtor da classe
     * @param comentarioVenda
     * @param id
     * @param prestadorNome
     * @param prestadorEndereco
     * @param prestadorCnpj
     * @param tomadorNome
     * @param tomadorEndereco
     * @param tomadorCnpj
     * @param prestadorOutrosDados
     * @param tomadorOutrosDados
     * @param servicosLista
     * @param valorNota
     * @param deducoes
     * @param desconto
     * @param base
     * @param aliquota
     * @param iss
     * @param credito
     * @param outros 
     */
    public NotaFiscalVenda(String comentarioVenda, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        super(id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        this.comentarioVenda = comentarioVenda;
    }

    /**
     * Obter comentários sobre a venda
     * @return 
     */
    public String getComentarioVenda() {
        return comentarioVenda;
    }

    /**
     * Definir o comentários sobre a venda
     * @param comentarioVenda 
     */
    public void setComentarioVenda(String comentarioVenda) {
        this.comentarioVenda = comentarioVenda;
    }

    /**
     * Obter o conteúdo da nota fiscal
     * @return 
     */
    public String getContent() {
        return content;
    }

    /**
     * Definir o conteúdo da nota fiscal
     * @param content 
     */
    @Deprecated
    public void setContent(String content) {
        this.content = content;
    }

    
    public String getClassName() {
        return "NotaFiscalVenda";
    }

    @Override
    public Object[] attributesToArray(String[] order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object setValue(String variable, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String describe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getIdFromDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
