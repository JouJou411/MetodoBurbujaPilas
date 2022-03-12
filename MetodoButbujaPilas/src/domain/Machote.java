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
public interface Machote<T> {

    public boolean vacia();

    public boolean llena(int tam);

    public boolean inserta(T dato);

    public T elimina();
}
