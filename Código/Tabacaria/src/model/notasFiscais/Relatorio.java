package model.notasFiscais;

public class Relatorio {
    private String titulo;
    private String texto;
    private String data;
    private String relatorio;
    
    /**
     * Contstrutor para a classe
     * @param titulo
     * @param data
     * @param texto 
     */
    public Relatorio(String titulo, String data, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        relatorio += titulo + '\n' + data + '\n' + texto + '\n';
    }

    /**
     *Preenche um relatório
     * @param data 
     * @param texto 
     * @param titulo 
     */
    public void fill(String titulo, String data, String texto) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        relatorio += titulo + '\n' + data + '\n' + texto + '\n';
    }

    /**
     * Obter o título do relatório
     * @return 
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Definir o título do relatório
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obter o texto do reltório
     * @return 
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Definir o texto do relatório
     * @param texto 
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Defini a data do relatório
     * @param data 
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obter a data do relatório
     * @return 
     */
    public String getData() {
        return data;
    }
}
