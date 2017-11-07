/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabacaria;


import dao.*;
import model.fornecedores.*;
import model.loja.*;
import model.notasFiscais.*;
import model.pessoa.*;



/**
 *
 * @author andre
 */
public class TabacariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        tests();
        // TODO code application logic here

        
        
        /*try {
            tests();
        } catch (Exception e) {
            System.exit(0);
        }*/

    }

    public static void tests() throws Exception {
        Fornecedor forn0 = new Fornecedor(0, "Adecl8ei9ton", "Rua dos Ipês", 123456789);
        Fornecedor forn1 = new Fornecedor(0, "Cleito Cleito", "Adamantina", 345);
        
        
        dao.FornecedorDao daoForn = new FornecedorDao();
        
        daoForn.insert(forn0);
        daoForn.insert(forn1);
        
        /**/
        
        Produto p0 = new Produto(0, "Cigarretes", "sl", 25.00f);
        
        ProdutoDao prodDao = new ProdutoDao();
        
        
        



        System.exit(0);

    }

}
