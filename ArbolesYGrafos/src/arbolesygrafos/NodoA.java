/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolesygrafos;

/**
 *
 * @author esau_
 */
public
        class NodoA {
        private int dato;
        private NodoA izq, der, anterior;

    public
    NodoA(int dato) {
        this.dato = dato;
        izq=der=null;
    }

    @Override
    public
    String toString() {
        return "{"+ dato + '}';
    }

    public
    int getDato() {
        return dato;
    }

    public
    void setAnterior(NodoA anterior) {
        this.anterior = anterior;
    }

    public
    NodoA getAnterior() {
        return anterior;
    }

    public
    NodoA getIzq() {
        return izq;
    }

    public
    NodoA getDer() {
        return der;
    }

    public
    void setDato(int dato) {
        this.dato = dato;
    }

    public
    void setIzq(NodoA izq) {
        this.izq = izq;
    }

    public
    void setDer(NodoA der) {
        this.der = der;
    }
        
}
