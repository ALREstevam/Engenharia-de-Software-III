package model.loja;

public class Pedido extends Venda {

    private String receptorNome;

    private String endereco;

    private boolean status;

    public Pedido(String receptorNome, String endereco, int id, ProdutoLoja[] produtos, float valorTotal) {
        super(id, produtos, valorTotal);
        this.receptorNome = receptorNome;
        this.endereco = endereco;
        this.status = false;
    }

    public String getReceptorNome() {
        return receptorNome;
    }

    public void setReceptorNome(String receptorNome) {
        this.receptorNome = receptorNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void entregar() {

        setStatus(true);

    }
}
