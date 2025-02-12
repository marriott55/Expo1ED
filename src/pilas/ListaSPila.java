
package pilas;

import listas.ListaSimple;

public class ListaSPila implements Pila{
    
    protected ListaSimple lista;
    protected int cont;
    
    public ListaSPila(){
        lista = new ListaSimple();
        cont = 0;
    }

    @Override
    public void push(Object x) {
        lista.insertaInicio(x);
        cont++;
    }

    @Override
    public Object pop() {
        if(lista.vacio()){
            System.out.println("La lista está vacía");
            return null;
        }else{
            cont--;
            return lista.eliminaInicio();
        }
    }

    @Override
    public Object top() {
        if(lista.vacio()){
            System.out.println("La lista está vacía");
            return null;
        }else{
            return lista.getInicio().getDato();
        }
    }

    @Override
    public int size() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return lista.vacio();
    }
    
    public static void main(String[] args) {
        ListaSPila miPila = new ListaSPila();
        
        miPila.push(20);
        miPila.push("Hola");
        miPila.push(32);
        miPila.push("Último");
        
        System.out.println("Pila completa: ");
        while(!miPila.isEmpty()){
            System.out.println(miPila.pop());
        }
    }
}
