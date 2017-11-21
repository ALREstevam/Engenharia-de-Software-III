/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria;

import dao.FornecedorDao;
import java.sql.Driver;
import model.fornecedores.Fornecedor;

/**
 *
 * @author andre
 */
public class Tabacaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("main");
        //view.MainJFrame mainjfrm = new view.MainJFrame();
        //mainjfrm.setVisible(true);
    
        Fornecedor forn0 = new Fornecedor(0, "Adecl8ei9ton", "Rua dos Ipês", 123456789);
        Fornecedor forn1 = new Fornecedor(0, "Cleito Cleito", "Adamantina", 345);
        
        
        dao.FornecedorDao daoForn = new FornecedorDao();
        
        daoForn.insert(forn0);
        daoForn.insert(forn1);
    }
    
}
