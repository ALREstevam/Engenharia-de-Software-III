/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria;

import dao.generalDao;
import model.fornecedores.Fornecedor;

/**
 *
 * @author andre
 */
public class TabacariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            tests();
        } catch (Exception e) {
            System.exit(0);
        }

    }

    public static void tests() throws Exception {
        Fornecedor forn0 = new Fornecedor(0, "Adecl8ei9ton", "Rua dos Ipês", 123456789);
        Fornecedor forn1 = new Fornecedor(0, "Cleito Cleito", "Adamantina", 345);
        
        
        generalDao<Fornecedor> daoFornecedor = new generalDao<>();

        daoFornecedor.insert(forn0);
        daoFornecedor.insert(forn1);
        System.exit(0);

        System.in.read();

        forn1.setNome("Cleito Cleito Cleito");
        daoFornecedor.update(forn1);

        forn0.setNome("Adecleiton");
        daoFornecedor.update(forn0);

        System.exit(0);

    }

}
