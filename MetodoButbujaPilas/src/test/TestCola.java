/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cola;

/**
 *
 * @author Joabp
 */
public class TestCola {
    public static void main(String[] args) {
        Cola c = new Cola(5);
        c.inserta(5);
        c.inserta(6);
        c.inserta(4);
        c.inserta(2);
        c.inserta(8);
        c.mostrar();
    }
}
