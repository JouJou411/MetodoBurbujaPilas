/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Burbuja;
import domain.Cola;

/**
 *
 * @author Joabp
 */
public class testMetodoBurbuja {

    public static void main(String[] args) {
        Cola c = new Cola(5);
        c.inserta(6);
        c.inserta(9);
        c.inserta(8);
        c.inserta(2);
        c.inserta(10);
        Burbuja.metodoBubuja(c);
        c.mostrar();
    }
}
