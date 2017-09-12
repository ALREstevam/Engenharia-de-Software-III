package tabacariaControllers;

import dao.FuncionarioDao;
import dao.VendaDao;
import dao.FornecedorDao;
import dao.ProdutoDao;
import dao.ProdutoLojaDao;
import dao.RelatorioDao;
import dao.NotaFiscalDao;
import model.loja.Venda;
import model.notasFiscais.Relatorio;
import model.notasFiscais.NotaFiscal;
import model.pessoa.Funcionario;
import model.fornecedores.Produto;
import model.fornecedores.Fornecedor;

public class Tabacaria {

	private Database db;

	private FuncionarioDao daoFunc;

	private VendaDao daoVend;

	private FornecedorDao daoForn;

	private ProdutoDao daoProd;

	private ProdutoLojaDao daoProdLoja;

	private RelatorioDao daoRelat;

	private NotaFiscalDao daoNf;

	public boolean addVenda() {
		return false;
	}

	public boolean addProdutoLoja() {
		return false;
	}

	public boolean addRelatorio() {
		return false;
	}

	public boolean addNotaFiscal() {
		return false;
	}

	public boolean addFuncionario() {
		return false;
	}

	public boolean addProduto() {
		return false;
	}

	public boolean addFornecedor() {
		return false;
	}

	public boolean removeVenda() {
		return false;
	}

	public boolean removeProdutoLoja() {
		return false;
	}

	public boolean removeFuncionario() {
		return false;
	}

	public boolean removeProduto() {
		return false;
	}

	public boolean removeFornecedor() {
		return false;
	}

	public boolean updateVenda() {
		return false;
	}

	public boolean updateProdutoLoja() {
		return false;
	}

	public boolean updateRelatorio() {
		return false;
	}

	public boolean updateFuncionario() {
		return false;
	}

	public boolean updateProduto() {
		return false;
	}

	public boolean updateFornecedor() {
		return false;
	}

	public Venda[] getVendas() {
		return null;
	}

	public ProdutoLojaDao[] getProdutosLoja() {
		return null;
	}

	public Relatorio[] getRelatorios() {
		return null;
	}

	public NotaFiscal[] getNotaFiscal() {
		return null;
	}

	public Funcionario[] getFuncionarios() {
		return null;
	}

	public Produto getProdutos() {
		return null;
	}

	public Fornecedor[] getFornecedores() {
		return null;
	}

}
