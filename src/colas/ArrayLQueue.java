
package colas;

import java.util.ArrayList;

public class ArrayLQueue implements Queue{

    protected ArrayList cola;

    public ArrayLQueue() {
        cola = new ArrayList();
    }
    
    @Override//Encolar o agregar un elemento
    public void enqueue(Object dato) {
        cola.add(dato);
    }

    @Override//Quitar el primer elemento
    public Object dequeue() {
        if(cola.isEmpty()){
            System.out.println("La cola está vacía");
            return null;
        }
        else
            return cola.remove(0);
    }

    @Override//Mostrar el tamaño actual de la cola
    public int size() {
        return cola.size();
    }

    @Override//Mostrar el próximo elemento en salir sin quitarlo
    public Object front() {
        if(cola.isEmpty()){
            System.out.println("La cola está vacía");
            return null;
        }
        else
            return cola.get(0);
    }

    @Override//Verificar si la cola está vacía
    public boolean isEmpty() {
        return cola.isEmpty();
    }
    
    public static void main(String[] args) {
        ArrayLQueue miCola = new ArrayLQueue();
        
        miCola.enqueue("Hola mundo");
        miCola.enqueue(":)");
        miCola.enqueue(4.5);
        miCola.enqueue(4);
        
        while(!miCola.isEmpty()){
            System.out.println(miCola.dequeue());
        }
    }
    
    
    
}
