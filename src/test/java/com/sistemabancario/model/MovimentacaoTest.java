package com.sistemabancario.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Manoel Campos da Silva Filho
 */
public class MovimentacaoTest {

    @Test
    public void setTipo() {
        final Movimentacao instancia = new Movimentacao();
        final char esperado = 'C';
        instancia.setTipo(esperado);
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTipoInvalido() {
        final Movimentacao instancia = new Movimentacao();
        final char esperado = 'x';
        instancia.setTipo(esperado);

    }

    @Test
    public void setTipoMinusculo() {
        final Movimentacao instancia = new Movimentacao();
        final char esperado = 'C';
        instancia.setTipo('c');
        final char obtido = instancia.getTipo();
        assertEquals(esperado, obtido);

    }
}
