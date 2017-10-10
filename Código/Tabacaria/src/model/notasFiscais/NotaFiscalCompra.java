package model.notasFiscais;

public class NotaFiscalCompra extends NotaFiscal {

	private String comentarioCompra;

    public NotaFiscalCompra(String comentarioCompra, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        super(id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros);
        this.comentarioCompra = comentarioCompra;
    }

    public String getComentarioCompra() {
        return comentarioCompra;
    }

    public void setComentarioCompra(String comentarioCompra) {
        this.comentarioCompra = comentarioCompra;
    }

}
