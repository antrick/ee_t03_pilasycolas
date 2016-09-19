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
public class PilaL<T> {
 ListaLigada lista= new ListaLigada();
    public void push(T dato){
     lista.insertaFinal(dato);
    }
    public T peek(){
     Nodo<T> temporal=lista.getInicio();
     while(temporal.getSig()!=null){
        temporal=temporal.getSig();
        }
        return temporal.getDato();
    }
    public T pop(){
        return (T)lista.EliminaFinal().getDato();
    }
    public boolean sivacia(){
     return lista.vacia();
    }   
}
