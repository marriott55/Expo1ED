
package colas;

import java.util.ArrayList;
import java.util.Collections;

public class ColaPrioridadA implements Queue{

    protected ArrayList cola;

    //Constrcutor
    public ColaPrioridadA() {
        cola = new ArrayList();
    }
    
    @Override
    public void enqueue(Object dato) {
        cola.add(dato);
        //Ordenar de menor a mayor
        Collections.sort(cola);
        //Ordenar de mayor a menor
        //Collections.sort(cola, Collections.reverseOrder());
    }

    @Override
    public Object dequeue() {
        return cola.remove(0);
    }

    @Override
    public int size() {
        return cola.size();
    }

    @Override
    public Object front() {
        return cola.get(0);
    }

    @Override
    public boolean isEmpty() {
        return cola.isEmpty();
    }
    
    //main
    
    public static void main(String[] args) {
        ColaPrioridadA colaPrioridad = new ColaPrioridadA();
        
        colaPrioridad.enqueue(new NodoPrioridad(25,"Holaaa"));
        colaPrioridad.enqueue(new NodoPrioridad(23,"Holaaa2"));
        colaPrioridad.enqueue(new NodoPrioridad(5,"Holaaa3"));
        colaPrioridad.enqueue(new NodoPrioridad(80,"Holaaa4"));
        colaPrioridad.enqueue(new NodoPrioridad(4,"Holaaa5"));
        
        while(!colaPrioridad.isEmpty()){
            System.out.println(colaPrioridad.dequeue());
        }
    }
    
    
    
}
