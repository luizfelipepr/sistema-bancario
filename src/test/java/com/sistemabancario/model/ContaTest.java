/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemabancario.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luizf
 */
public class ContaTest {

    public ContaTest() {
    }

    
    /**
     * Test of getSaldoTotal method, of class Conta.
     */
    @Test
    public void testGetSaldoTotal() {
        double saldo = 100.0;
        double limite = 200.0;
        Conta conta = new Conta();
        double expResult = 300.0;
        conta.setLimite(limite);
        conta.setSaldo(saldo);
        double result = conta.getSaldoTotal();
        assertEquals(expResult, result, 0.0);
        assertEquals(expResult, result, 0.0);

    }

//    /**
//     * Test of saque method, of class Conta.
//     */
//    @Test (expected = IllegalStateException.class)
//    public void testSaqueIgual() {
//        double saldo = 100.0;
//        double limite = 200.0;
//
//        double valorSaque = 300.0;
//
//        Conta conta = new Conta();
//        double expResult = 0.0;
//        conta.setLimite(limite);
//        conta.setSaldo(saldo);
//        conta.saque(valorSaque);
//
//        double result = conta.getSaldoTotal();
//        double resultLimite =  conta.getLimite();
//
//        assertEquals(expResult, result, 0.0);
//        assertEquals(limite, resultLimite, 0.0);
//    }

    @Test
    //fazer
    public void testSaqueMenor() {
        double saldo = 100.0;
        double limite = 200.0;

        double valorSaque = 300.0;

        Conta conta = new Conta();
        double expResult = 0.0;
        conta.setLimite(limite);
        conta.setSaldo(saldo);
        conta.saque(valorSaque);

        double result = conta.getSaldoTotal();
        double resultLimite =  conta.getLimite();

        assertEquals(expResult, result, 0.0);
        assertEquals(limite, resultLimite, 0.0);


    }
    
//    @Test
//    public void testSaqueMaior() {
//
//        double saldo = 100.0;
//        double limite = 200.0;
//
//        double valorSaque = 400.0;
//
//        Conta conta = new Conta();
//        double expResult = 0.0;
//        conta.setLimite(limite);
//        conta.setSaldo(saldo);
//        conta.saque(valorSaque);
//
//        double result = conta.getSaldoTotal();
//        assertEquals(expResult, result, 0.0);
//
//    }

  
}
