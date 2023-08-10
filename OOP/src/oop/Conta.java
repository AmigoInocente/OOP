/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


public class Conta {

    private String nomeProprio;
    private int numeroDaConta;
    private Double saldoDaConta;
    
    public Conta(String nomeProprio, int numeroDaConta){
        
        this.nomeProprio = nomeProprio;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = 0.0;
    }

    public String getNomeProprio() {

        return this.nomeProprio;

    }

    public Integer getNumeroDaConta() {

        return this.numeroDaConta;

    }
    
    public Double getSaldoDaConta(){
        
        return this.saldoDaConta;
    }
    
    public Double saqueDaConta(Double value){
    
        if(value > saldoDaConta){
            
            return -1.0;
            
        }else{
            
            this.saldoDaConta -=value;
            
            return this.saldoDaConta;
        }
    
    }
    
    public Double deposito(Double value){
        
        this.saldoDaConta += value;
        
        return this.saldoDaConta;
    
    }
    
    
}
