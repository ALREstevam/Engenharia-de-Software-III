package model.notasFiscais;

public abstract class NotaFiscal {

	private int id;

	private String prestadorNome;

	private String prestadorEndereco;

	private String prestadorCnpj;

	private String tomadorNome;

	private String tomadorEndereco;

	private int tomadorCnpj;

	private String prestadorOutrosDados;

	private String tomadorOutrosDados;

	private String servicosLista;

	private float valorNota;

	private float deducoes;

	private float desconto;

	private float base;

	private float aliquota;

	private float iss;

	private float credito;

	private String outros;

	/**
	 *  
	 */
	public void paraArquivo() {

	}

}
