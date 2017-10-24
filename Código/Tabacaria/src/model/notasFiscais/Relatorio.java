package model.notasFiscais;

public class Relatorio {

    private String titulo;

    private String texto;
    private String data;

    public Relatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void fill() {

    }

    public Relatorio(String titulo, String texto, String data) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
