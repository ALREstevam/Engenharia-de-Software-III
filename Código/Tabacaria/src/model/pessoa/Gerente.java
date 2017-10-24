package model.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.fornecedores.Produto;
import model.fornecedores.ProdutoPerecivel;
import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;


public class Gerente extends Funcionario implements Serializable {

    public Gerente(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    /**
     *
     *
     */
    public RelatorioCompras gerarRelatorioCompras(String titulo, String texto, String data) {
        RelatorioCompras relatorio = new RelatorioCompras(titulo,texto,data);
        return relatorio;
    }

    /**
     *
     */
    public RelatorioVendas gerarRelatorioVendas(String titulo, String texto, String data) {
        RelatorioVendas re = new RelatorioVendas(titulo,texto,data);
        return re;
    }

    /**
     *
     */
    public void comprarProduto() {
        

    }

    /**
     *
     */
    public List <String> listarProdutosVencidos(ArrayList <ProdutoPerecivel> produtos ) {
           List<String> listaP = new ArrayList () ;
          for (ProdutoPerecivel el : produtos){
              if (!el.naValidade()){
                  listaP.add(el.getNome());
                  listaP.add(el.getDataValidade().toString());
              }
              
          }
          return listaP;
    }

    /**
     *
     */
    public void descartarProduto(ArrayList <Produto> produtos, Produto P) {
               produtos.remove(P);
            
    }

}
