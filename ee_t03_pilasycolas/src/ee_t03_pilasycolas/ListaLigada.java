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
public class ListaLigada<T> {
    private Nodo inicio;
    
    public Nodo getInicio(){
     return inicio;
    }
    public void insertaInicio(T dato){
     Nodo nodo= new Nodo(dato);
     nodo.setSig(inicio);
     inicio=nodo;
    }
    public void insertaFinal(T dato){
     Nodo aux;
     if(inicio!=null){
        aux=inicio;
        while(aux.getSig()!=null){
         aux=aux.getSig();
        }
        aux.setSig(new Nodo(dato));
        }else{
         insertaInicio(dato);
        }
    }
    public void recorre(){
     Nodo aux=inicio;
     if(aux==null){
        System.out.println("La lista esta vacia!");
        }else{
        while(aux!=null){
         System.out.print("["+aux.getDato()+"]->");
         aux=aux.getSig();
        }
        }
    }
    public void muestraFinal(){
       
     Nodo aux=inicio;
     if(aux==null){
        System.out.println("La lista esta vacia!");
        }else{
        while(aux!=null){
         if(aux.getSig()==null)
          System.out.print(aux.getDato()+"\n");
         
          aux=aux.getSig();
        }
        }
    }
    public Nodo EliminaFinal(){
     Nodo<T> temporal,anterior=null;
     Nodo aux=null;
     temporal=inicio;
      
      if(inicio.getSig()==null){
        inicio=null;
        return aux;
        }else{
         while(temporal.getSig()!=null){
            anterior=temporal;
            temporal=temporal.getSig();
            }
            aux= anterior;
            anterior.setSig(null);
        }
     
        return aux;
    }
    public Nodo EliminaInicio(){
     Nodo<T> temporal=inicio;
         Nodo<T> aux=null;
         if(temporal.getSig()!=null){
             if(inicio!=null){
                 aux=inicio;
                 inicio=inicio.getSig();
            }
             else{
              aux=inicio;
              inicio=null;
             }
            }
           return aux; 
    }
    public boolean vacia(){
      return inicio==null;
    }
}
