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
public class Test {
    static private PilaL<Integer> mipila=new PilaL<Integer>();
    static private ColaL<Integer> cola=new ColaL<Integer>();
   
    public static void main(String [] args){
        System.out.println("Pila Ligada");
     mipila.push(1);
     System.out.println(mipila.peek());
     mipila.push(2);
     System.out.println(mipila.peek());
     mipila.push(3);
     System.out.println(mipila.peek());
     mipila.pop();
     mipila.pop();
     System.out.println(mipila.peek());
     
     System.out.println("\n\n");
     
     System.out.println("Cola Ligada");
     cola.inserta(1);
     System.out.println(cola.verUltimo());
     cola.inserta(2);
     System.out.println(cola.verUltimo());
     cola.inserta(3);
     System.out.println(cola.verUltimo());
     cola.retirar();
     cola.retirar();
     System.out.println(cola.verUltimo());
    }
}
