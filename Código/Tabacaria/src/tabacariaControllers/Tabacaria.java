package tabacariaControllers;

import dao.FuncionarioDao;
import dao.VendaDao;
import dao.FornecedorDao;
import dao.ProdutoDao;
import dao.ProdutoLojaDao;
import dao.NotaFiscalDao;
import dao.PedidoDao;
import java.time.LocalDate;
import java.util.List;
import model.loja.Venda;
import model.notasFiscais.Relatorio;
import model.notasFiscais.NotaFiscal;
import model.pessoa.Funcionario;
import model.fornecedores.Produto;
import model.fornecedores.Fornecedor;
import model.fornecedores.ProdutoPerecivel;
import model.loja.ItemCarrinho;
import model.loja.Pedido;
import model.loja.ProdutoLoja;
import model.notasFiscais.NotaFiscalCompra;
import model.notasFiscais.NotaFiscalVenda;
import model.pessoa.Caixa;
import model.pessoa.Entregador;
import model.pessoa.Funcionario.funcType;
import model.pessoa.Gerente;

public class Tabacaria {
    
    
    private FuncionarioDao daoFunc;
    private VendaDao daoVend;
    private FornecedorDao daoForn;
    private ProdutoDao daoProd;
    private ProdutoLojaDao daoProdLoja;
    private NotaFiscalDao daoNf;
    private PedidoDao daoPed;
    
    public enum nfTypes{VENDA, COMPRA};

    public Tabacaria() {
        this.daoForn = new FornecedorDao();
        this.daoVend = new VendaDao();
        this.daoFunc = new FuncionarioDao();
        this.daoProd = new ProdutoDao();
        this.daoProdLoja = new ProdutoLojaDao();
        this.daoPed = new PedidoDao();
    }
    
    public boolean addVenda(int id, List<ItemCarrinho> produtos) {
        this.daoVend.insert(new Venda(id, produtos));
        return true;
    }
    
    public boolean addPedido(String receptorNome, String endereco, int id, List<ItemCarrinho> produtos){
        this.daoPed.insert(new Pedido(receptorNome, endereco, id, produtos));
        return true;
    }

    public boolean addProduto(int id, String nome, String descricao, float preco) {
        this.daoProd.insert(new Produto(id, nome, descricao, preco));
        return true;
    }
    
    public boolean addProduto(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {
        new ProdutoDao().insert(new ProdutoPerecivel(dataProducao, dataValidade, modoConservacao, id, nome, descricao, preco));
        return true;
    }

    public boolean addNotaFiscal(nfTypes nfType,String comentarioCompra, int id, String prestadorNome, String prestadorEndereco, String prestadorCnpj, String tomadorNome, String tomadorEndereco, int tomadorCnpj, String prestadorOutrosDados, String tomadorOutrosDados, String servicosLista, float valorNota, float deducoes, float desconto, float base, float aliquota, float iss, float credito, String outros) {
        switch (nfType){
            case COMPRA:
                this.daoNf.insert(new NotaFiscalCompra(comentarioCompra, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros));
                break;
            case VENDA:
                this.daoNf.insert(new NotaFiscalVenda(comentarioCompra, id, prestadorNome, prestadorEndereco, prestadorCnpj, tomadorNome, tomadorEndereco, tomadorCnpj, prestadorOutrosDados, tomadorOutrosDados, servicosLista, valorNota, deducoes, desconto, base, aliquota, iss, credito, outros));
                break;
        }
        return true;
    }

   public boolean addFuncionario( int id,Funcionario.funcType func, String nome, String cpf) {
        switch(func){
          
            case CAIXA:
                   Funcionario n = new Funcionario(id,funcType.CAIXA, nome, cpf);
                this.daoFunc.insert(n);
                break;
            case ENTREGADOR:
                  Funcionario m = new Funcionario(id, funcType.ENTREGADOR,nome, cpf);
                this.daoFunc.insert(m);
                break;
            case GERENTE:
                 Funcionario o = new Funcionario(id,funcType.GERENTE, nome, cpf);
                this.daoFunc.insert(o);
                break;
        }
        return true;
    }

    public boolean addProdutoLoja(Produto produto, int quantidadeEstoque, double precoVenda) {
        this.daoProdLoja.insert(new ProdutoLoja(produto, quantidadeEstoque, precoVenda));
        return true;
    }

    public boolean addFornecedor(int id, String nome, String contato, String cnpj) {
        this.daoForn.insert(new Fornecedor(id, nome, contato, cnpj));
        return true;
    }

    public boolean removeVenda(Venda elem) {
        this.daoVend.delete(elem);
        return true;
    }
    
    public boolean removePedido(Pedido elem) {
        this.daoPed.delete(elem);
        return true;
    }

    public boolean removeProdutoLoja(ProdutoLoja elem) {
        this.daoProdLoja.delete(elem);
        return true;
    }

    public boolean removeFuncionario(Funcionario elem) {
        this.daoFunc.delete(elem);
        return true;
    }

    public boolean removeProduto(Produto elem) {
        this.daoProd.delete(elem);
        return true;
    }

    public boolean removeFornecedor(Fornecedor elem) {
        this.daoForn.delete(elem);
        return true;
    }

    //OBS: Notas fiscais não podem ser deletadas
    
    /*
    Enviar os objetos atualizados mas com mesmo id!
    */
    public boolean updateVenda(Venda elem) {
        this.daoVend.update(elem);
        return true;
    }
    
    public boolean updatePedido(Pedido elem) {
        this.daoPed.update(elem);
        return true;
    }

    public boolean updateProdutoLoja(ProdutoLoja elem) {
        this.daoProdLoja.update(elem);
        return true;
    }

    public boolean updateFuncionario(Funcionario elem) {
        this.daoFunc.update(elem);
        return true;
    }

    public boolean updateProduto(Produto elem) {
        this.daoProd.update(elem);
        return true;
    }

    public boolean updateFornecedor(Fornecedor elem) {
        this.daoForn.update(elem);
        return true;
    }

    
    public List<Venda> getVendas() {
        return this.daoVend.getAll(daoVend.getTableName(Venda.class), "Venda");
    }
    
     public List<Pedido> getPedidos() {
        return this.daoPed.getAll(daoPed.getTableName(Venda.class), "Pedido");
    }

    public List<ProdutoLoja> getProdutosLoja() {
        return this.daoProdLoja.getAll(daoProdLoja.getTableName(ProdutoLoja.class), "ProdutoLoja");
    }

    public List<NotaFiscal> getNotaFiscal() {
        return this.daoNf.getAll(daoNf.getTableName(NotaFiscal.class), "");
    }

    public List<Funcionario> getFuncionarios() {
        return this.daoFunc.getAll(daoFunc.getTableName(Funcionario.class), "Funcionario");
    }

    public List<Produto> getProdutos() {
        return this.daoProd.getAll(daoProd.getTableName(Produto.class), "Produto");
    }

    public List<Fornecedor> getFornecedores() {
        return this.daoForn.getAll(daoForn.getTableName(Fornecedor.class), "Fornecedor");
    }

}
