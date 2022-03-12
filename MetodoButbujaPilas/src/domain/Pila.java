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
public class Pila implements Machote<Integer> {

    private Integer p[] = null;
    private int tope = -1;

    public Pila(int n) {
        try {
            p = new Integer[n];
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    @Override
    public boolean vacia() {
        return tope == -1;
    }

    @Override
    public boolean llena(int tam) {
        return tam - 1 == tope;
    }

    @Override
    public boolean inserta(Integer dato) {
        if (!llena(p.length)) {
            p[++tope] = dato;
            return true;
        }
        return false;
    }

    @Override
    public Integer elimina() {
        if (!vacia()) {
            return p[tope--];
        }
        return null;
    }

}
