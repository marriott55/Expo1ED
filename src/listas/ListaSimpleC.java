
package listas;

public class ListaSimpleC extends ListaCircular{

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.siguiente = inicio;
        }else{
            inicio = new Nodo(dato, inicio);
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            inicio = ultimo = new Nodo(dato);
            ultimo.setSiguiente(inicio);
        }else{
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo= temp;
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("La lista está vacía");
        }else{
            if(inicio == ultimo){
                eliminado = inicio.getDato();
                inicio=ultimo=null;
            }
            else{
                eliminado = inicio.getDato();
                inicio=inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
            }
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("La lista está vacía");
        }else{
            if(inicio==ultimo){
                eliminado = ultimo.getDato();
                inicio=ultimo=null;
            }else{
                Nodo actual=inicio;
                while(actual.getSiguiente()!=ultimo){
                    actual=actual.getSiguiente();
                }
                eliminado = ultimo.getDato();
                actual.setSiguiente(inicio);
                ultimo= actual;
            }
        }
        return eliminado;
    }
    
    public static void main(String[] args) {
        ListaSimpleC listac = new ListaSimpleC();
        listac.insertaInicio("Hola");
        listac.insertaInicio(34);
        listac.imprimir();
        
        System.out.println("\nInserta final en una lista simple Circular");
        listac.insertaFinal("Ultimo");
        listac.insertaFinal(32);
        listac.imprimir();
        
        System.out.println("\nAhora quitamos elementos del inicio");
        listac.eliminaInicio();
        listac.imprimir();
        
        System.out.println("\nAhora quitamos elementos del final");
        listac.eliminaFinal();
        listac.imprimir();
    }
    
}
