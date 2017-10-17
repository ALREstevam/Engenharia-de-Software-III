package model.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;
import model.loja.ProdutoLoja;

public class Caixa extends Funcionario implements Serializable {

    public Caixa(int id, String nome, String cpf) {

        super(id, nome, cpf);
    }

    /**
     *
     * <<<<<<< HEAD
     *
     * @param comentarioVenda
     * @param id
     * @param prestadorNome
     * @param prestadorEndereco
     * @param prestadorCnpj
     * @param tomadorNome
     * @param tomadorEndereco
     * @param tomadorCnpj
     * @param prestadorOutrosDados
     * @return
     */
    public NotaFiscalVenda emitirNotaVenda(String comentarioVenda, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        NotaFiscalVenda notaFiscal = new NotaFiscalVenda(comentarioVenda, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);

        return notaFiscal;

    }

    public NotaFiscalCompra receberPagamento(String comentarioCompra, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        NotaFiscalCompra notaFiscal = new NotaFiscalCompra(comentarioCompra, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        return notaFiscal;
    }

    /**
     *
     */
    public Venda realizarVenda(int id, double valorTotal) {
        List produtos = new ArrayList<ProdutoLoja>();
        Venda venda = new Venda(id, produtos, valorTotal);
        return venda;
    }

    /**
     *
     * @return
     */
    public boolean finalizarVenda() {
        return true;
    }

    /**
     *
     * @return
     */
    public Pedido obterDadosEntrega(int id, String receptorNome, List<ProdutoLoja> produtos, String endereco, float valorTotal) {
        Pedido pedido = new Pedido(receptorNome, endereco, id, produtos, valorTotal);
        return pedido;
    }

}
