
package colas;

import listas.ListaSimple;

/**
 *
 * @author mapro
 */
public class ListaSCola implements Queue{

    protected ListaSimple lista;
    protected int cont;
    
    public ListaSCola(){
        lista = new ListaSimple();
        cont = 0;
    }
    
    @Override
    public void enqueue(Object dato) {
        lista.insertaFinal(dato);
        cont++;
    }

    @Override
    public Object dequeue() {
        if(lista.vacio()){
            System.out.println("Cola vacía");
            return null;
        }else{
            cont--;
            return lista.eliminaInicio();
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public Object front() {
        return lista.getInicio().getDato();
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
    
    
    public static void main(String[] args) {
        ListaSCola miCola = new ListaSCola();
        
        miCola.enqueue(20);
        miCola.enqueue("Hola");
        miCola.enqueue(32);
        miCola.enqueue("Último");
        
        System.out.println("Cola completa: ");
        System.out.println("\nEl tamaño es: "+ miCola.size());
        
        while(!miCola.isEmpty()){
            System.out.println(miCola.dequeue());
        }
        System.out.println("\nEl tamaño es: "+ miCola.size());
    }
}
