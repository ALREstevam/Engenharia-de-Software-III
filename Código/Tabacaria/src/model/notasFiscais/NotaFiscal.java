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

    public NotaFiscal(int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        this.id = id;
        this.prestadorNome = prestadorNome;
        this.prestadorEndereco = prestadorEndereco;
        this.prestadorCnpj = prestadorCnpj;
        this.tomadorNome = tomadorNome;
        this.tomadorEndereco = tomadorEndereco;
        this.tomadorCnpj = tomadorCnpj;
        this.prestadorOutrosDados = prestadorOutrosDados;
        this.tomadorOutrosDados = tomadorOutrosDados;
        this.servicosLista = servicosLista;
        this.valorNota = valorNota;
        this.deducoes = deducoes;
        this.desconto = desconto;
        this.base = base;
        this.aliquota = aliquota;
        this.iss = iss;
        this.credito = credito;
        this.outros = outros;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrestadorNome() {
        return prestadorNome;
    }

    public void setPrestadorNome(String prestadorNome) {
        this.prestadorNome = prestadorNome;
    }

    public String getPrestadorEndereco() {
        return prestadorEndereco;
    }

    public void setPrestadorEndereco(String prestadorEndereco) {
        this.prestadorEndereco = prestadorEndereco;
    }

    public String getPrestadorCnpj() {
        return prestadorCnpj;
    }

    public void setPrestadorCnpj(String prestadorCnpj) {
        this.prestadorCnpj = prestadorCnpj;
    }

    public String getTomadorNome() {
        return tomadorNome;
    }

    public void setTomadorNome(String tomadorNome) {
        this.tomadorNome = tomadorNome;
    }

    public String getTomadorEndereco() {
        return tomadorEndereco;
    }

    public void setTomadorEndereco(String tomadorEndereco) {
        this.tomadorEndereco = tomadorEndereco;
    }

    public int getTomadorCnpj() {
        return tomadorCnpj;
    }

    public void setTomadorCnpj(int tomadorCnpj) {
        this.tomadorCnpj = tomadorCnpj;
    }

    public String getPrestadorOutrosDados() {
        return prestadorOutrosDados;
    }

    public void setPrestadorOutrosDados(String prestadorOutrosDados) {
        this.prestadorOutrosDados = prestadorOutrosDados;
    }

    public String getTomadorOutrosDados() {
        return tomadorOutrosDados;
    }

    public void setTomadorOutrosDados(String tomadorOutrosDados) {
        this.tomadorOutrosDados = tomadorOutrosDados;
    }

    public String getServicosLista() {
        return servicosLista;
    }

    public void setServicosLista(String servicosLista) {
        this.servicosLista = servicosLista;
    }

    public float getValorNota() {
        return valorNota;
    }

    public void setValorNota(float valorNota) {
        this.valorNota = valorNota;
    }

    public float getDeducoes() {
        return deducoes;
    }

    public void setDeducoes(float deducoes) {
        this.deducoes = deducoes;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAliquota() {
        return aliquota;
    }

    public void setAliquota(float aliquota) {
        this.aliquota = aliquota;
    }

    public float getIss() {
        return iss;
    }

    public void setIss(float iss) {
        this.iss = iss;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }

}
