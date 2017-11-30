package model.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;
import model.loja.ProdutoLoja;

/**
 * O caixa é o funcionário responsável por lidar com os clientes efetuando a cobrança
 * do produto comprado
 * @author andre
 */
@Entity
public class Caixa extends Funcionario implements Serializable {

    @Override
    public String getClassName() {
        return "Caixa";
    }

    public Caixa(int id, funcType func, String nome, String cpf) {
        super(id, func, nome, cpf);
    }

    public Caixa() {
    }
    
   
    
    /**
     * Após uma venda ser feita um caixa deve emitir uma nota fiscal de venda
     * @return 
     */
    public NotaFiscalVenda emitirNotaVenda() {
        return null;
    }

    /**
     * Após uma venda ser feita um caixa deve emitir uma nota fiscal de venda
     * @return 
     * @param comentarioVenda
     * @param id
     * @param prestadorNome
     * @param prestadorEndereco
     * @param prestadorCnpj
     * @param tomadorNome
     * @param tomadorEndereco
     * @param tomadorCnpj
     */
    public NotaFiscalVenda emitirNotaVenda(String comentarioVenda, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        NotaFiscalVenda notaFiscal = new NotaFiscalVenda(comentarioVenda, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        return notaFiscal;
    }

    /**
     * Após uma venda ser feita um caixa deve emitir uma nota fiscal de venda
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
     * @return 
     */
    public NotaFiscalCompra receberPagamento(String comentarioCompra, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        NotaFiscalCompra notaFiscal = new NotaFiscalCompra(comentarioCompra, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        return notaFiscal;
    }
}
