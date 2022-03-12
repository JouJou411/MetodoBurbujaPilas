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
public class Cola {

    private int frente;
    private int ultimo;
    private int[] cola;

    public Cola(int n) {
        frente = 0;
        ultimo = -1;
        cola = new int[n];
    }

    public void inserta(int elemento) {
        if (!llena()) {
            cola[++ultimo] = elemento;
        }
    }

    public int elimina() {
        if (!vacia()) {
            return cola[frente++];
        }
        return frente;
    }

    public void borrarTodo() {
        frente = 0;
        ultimo = -1;
    }

    public boolean vacia() {
        return frente > ultimo;
    }

    public boolean llena() {
        return ultimo == cola.length - 1;
    }

    public void mostrar() {
        for (int i : cola) {
            System.out.println("i = " + i);
        }
    }

    public int length() {
        if (!vacia()) {
            return cola.length;
        }
        return 0;
    }

}
