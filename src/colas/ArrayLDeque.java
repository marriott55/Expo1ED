
package colas;

import java.util.ArrayList;

public class ArrayLDeque implements Deque{

    protected ArrayList deque;

    public ArrayLDeque() {
        deque = new ArrayList();
    }
    
    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public void insertFirst(Object o) {
        deque.add(0,o);
    }

    @Override
    public void insertLast(Object o) {
        deque.add(o);
    }

    @Override
    public Object removerFirst() {
        if(!deque.isEmpty()){
            return deque.remove(0);
        }
        else{
            System.out.println("El deque está vacío");
            return null;
        }
    }

    @Override
    public Object removeLast() {
        if(!deque.isEmpty()){
            return deque.remove(deque.size()-1);
        }
        else{
            System.out.println("El deque está vacío");
            return null;
        }
    }

    @Override
    public Object first() {
        return deque.get(0);
    }

    @Override
    public Object last() {
        return deque.get(deque.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayLDeque deque = new ArrayLDeque();
        
        deque.insertFirst("Hola1");
        deque.insertFirst("Hola2");
        deque.insertLast("último");
        deque.insertLast("último último");
        System.out.println(deque.removerFirst());
        System.out.println(deque.removeLast());
    }
    
}
