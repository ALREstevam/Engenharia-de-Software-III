package model.notasFiscais;

public class Relatorio {

	private int id;

	private String titulo;

	private String texto;
        private String data;
	/**
	 *  
	 */
	public void fill() {
           
  
	}

    public Relatorio(int id, String titulo, String texto, String data) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.data=data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }
}
