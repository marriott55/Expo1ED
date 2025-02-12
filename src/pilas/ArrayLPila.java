
package pilas;

import java.util.ArrayList;

public class ArrayLPila implements Pila {

    protected ArrayList pila;
    
    public ArrayLPila(){
        pila = new ArrayList();
    }
    
    @Override//Agregar un elemento
    public void push(Object x) {
        pila.add(x);
    }

    @Override//Quitar un elemento
    public Object pop() {
        if(pila.isEmpty()){
            System.out.println("La pila está vacía");
            return null;
        }
        else
            return pila.remove(pila.size()-1);
    }

    @Override//Ver el elemento de arriba
    public Object top() {
        if(pila.isEmpty()){
            System.out.println("La pila está vacía");
            return null;
        }
        else
            return pila.get(pila.size()-1);
    }

    @Override
    public int size() {
        return pila.size();
    }

    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
    public static void main(String[] args) {
        ArrayLPila mipila = new ArrayLPila();
        
        mipila.push("Hola mundo");
        mipila.push(":)");
        mipila.push(4.5);
        mipila.push(4);
        
        while(!mipila.isEmpty()){
            System.out.println(mipila.pop());
        }
    }
    
}
