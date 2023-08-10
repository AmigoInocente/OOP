/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import static java.util.Collections.list;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alisson_formento
 */
public class Application {

    public List<Conta> listaDeConta;

    public void init() {
        {
            Conta acc = new Conta(213, "Filipe");

//            .numeroDaConta = 213;
//            .nomeProprio = "Filipe";
            listaDeConta.add(acc);
        }

        {
            Conta acc = new Conta(214, "Thiago");

//            acc.numeroDaConta = 214;
//            acc.nomeProprio = "Thiago";
            listaDeConta.add(acc);
        }

        {
            Conta acc = new Conta("Erik", 215);

//            acc.numeroDaConta = 215;
//            acc.nomeProprio = "Erik";
            listaDeConta.add(acc);
        }
    }

    public void run() {

        for (int i = 0; i < listaDeConta.size(); i++) {

//            System.out.println(listaDeConta.get(i).getNomeProprio().equals("Thiago"));
            if (listaDeConta.get(i).getNomeProprio().equals("Thiago")) {
                
                System.out.println(listaDeConta.get(i).getNumeroDaConta() + " // " + listaDeConta.get(i).getNomeProprio());
                
                listaDeConta.get(i).deposito(1000000.0);
                System.out.println(listaDeConta.get(i).getSaldoDaConta());
                
                Double novoSaldo = listaDeConta.get(i).saqueDaConta(973000.0);
                System.out.println(listaDeConta.get(i).getSaldoDaConta());
                System.out.println(novoSaldo);
            }
        }
    }
}
