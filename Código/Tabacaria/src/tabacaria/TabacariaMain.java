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
        
        try{
            tests();
        }catch(Exception e){
            System.exit(0);
        }
        
    
    }

    public static void tests() throws Exception{
        Fornecedor forn = new Fornecedor(0, "Adecleiton", "Rua dos Ipês", "123456789");
        generalDao<Fornecedor> daoFornecedor = new generalDao<Fornecedor>();
        daoFornecedor.insert(forn);
    }

}

