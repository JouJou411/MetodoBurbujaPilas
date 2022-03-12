/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Joabp
 */
public class Burbuja {

    public static void metodoBubuja(Cola cola) {
        Pila pila1 = new Pila(cola.length());
        Pila pila2 = new Pila(cola.length());
        try {
            while (!cola.vacia()) {
                int p1 = cola.elimina();
                int c;
                //por si la pila 1 esta vacia y evitar el error
                if (pila1.vacia()) {
                    pila1.inserta(p1);
                } else {
                    c = pila1.elimina();
                    if (p1 > c) {
                        pila1.inserta(c);
                        pila1.inserta(p1);
                    } else {
                        //por si la pila 2 esta vacia y evitar el error
                        if (pila2.vacia()) {
                            pila2.inserta(c);
                            pila2.inserta(p1);
                            while (!pila1.vacia()) {
                                p1 = pila1.elimina();
                                c = pila2.elimina();
                                if (p1 < c) {
                                    pila2.inserta(c);
                                    pila2.inserta(p1);
                                } else {
                                    pila2.inserta(p1);
                                    pila2.inserta(c);
                                }
                            }
                            while (!pila2.vacia()) {
                                pila1.inserta(pila2.elimina());
                            }
                        }
                    }
                }
            }
            cola.borrarTodo();
            while (!pila1.vacia()) {
                cola.inserta(pila1.elimina());
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }
}
