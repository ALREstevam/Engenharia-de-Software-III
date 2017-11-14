package model.notasFiscais;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
/**
 * Nota fiscal de compra é um tipo especial de nota fiscal utilizado quando
 * é feita a compra de algum produto por parte da loja com os fornecedores
 */
public class NotaFiscalCompra extends NotaFiscal implements Serializable{

    private String content;
    private String comentarioCompra;

    /**
     * Constutor da classe
     * @param comentarioCompra
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
    public NotaFiscalCompra(String comentarioCompra, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        super(id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        this.comentarioCompra = comentarioCompra;
    }

    /**
     * Obter os comentários da compra
     * @return 
     */
    public String getComentarioCompra() {
        return comentarioCompra;
    }

    /**
     * Definir os comentários da compra
     * @param comentarioCompra 
     */
    public void setComentarioCompra(String comentarioCompra) {
        this.comentarioCompra = comentarioCompra;
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
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getClassName() {
        return "NotaFiscalCompra";
    }
    
    

}
