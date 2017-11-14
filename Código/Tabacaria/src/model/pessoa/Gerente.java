package model.pessoa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import model.fornecedores.Produto;
import model.fornecedores.ProdutoPerecivel;
import model.loja.ProdutoLoja;
import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;

/**
 * Gerente é um funcionário que tem responsabilidade sob os outros funcionários
 * @author andre
 */
@Entity
public class Gerente extends Funcionario implements Serializable {

    @Override
    public String getClassName() {
        return "Gerente";
    }
    
    /**
     * Construtor da classe
     * @param id
     * @param nome
     * @param cpf 
     */
    public Gerente(int id, String nome, String cpf) {
        super(funcType.GERENTE, id, nome, cpf);
    }

    /**
     * O Gerente pode requisitar um relatório de compras
     */
    public RelatorioCompras gerarRelatorioCompras(String titulo, String texto, String data) {
        RelatorioCompras relatorio = new RelatorioCompras(titulo,texto,data);
        return relatorio;
    }

    /**
     * O Gerente pode requisitar um relatório de vendas
     */
    public RelatorioVendas gerarRelatorioVendas(String titulo, String texto, String data) {
        RelatorioVendas re = new RelatorioVendas(titulo,texto,data);
        return re;
    }

    /**
     * Um gerente pode fazer a compra de um produto para a loja
     * @param prod
     * @return 
     */
    public ProdutoLoja comprarProduto(Produto prod, int quantidade, double valorVenda) {
        return new ProdutoLoja(prod, quantidade, valorVenda);
    }

    /**
     * Um administrador pode requisitar uma lista de produtos vencidos
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
     * Um administrador pode descartar um produto
     */
    public void descartarProduto(ArrayList <ProdutoPerecivel> produtos, String nomeP) {
              for (ProdutoPerecivel el : produtos){
              if (el.getNome().equals(nomeP)){
                  produtos.remove(el);
                  return;
              }
              
          }
    }

}
