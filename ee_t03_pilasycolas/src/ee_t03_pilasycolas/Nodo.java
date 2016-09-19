/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author andy
 */
public class Nodo<T> {
    private T dato;
    private Nodo sig;
    
    public Nodo(){
     dato=null;
     sig=null;
     }
    public Nodo(T dato){
     this.dato=dato;
    }
    public void setDato(T dato){
     this.dato=dato;
    }
    public T getDato(){
     return dato;
    }
    public void setSig(Nodo sig){
     this.sig=sig;
    }
    public Nodo getSig(){
     return sig;
    }
}
