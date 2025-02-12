
package listas;

public class ListaSimple extends Lista{

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio= ultimo = new Nodo(dato);
        }
        else{
            inicio= new Nodo(dato, inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio()) {
            inicio = ultimo = new Nodo(dato);
        } else {
            Nodo temp = new Nodo(dato);
            ultimo.setSiguiente(temp);
            ultimo = temp;
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("La lista está vacía");
        }
        else{
            if(inicio==ultimo){
                eliminado = inicio.getDato();
                inicio = ultimo = null;
            }
            else{
                eliminado = inicio.getDato();
                inicio = inicio.getSiguiente();
            }
        }
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("La lista está vacía");
        }
        else{
            if(inicio==ultimo){
                eliminado = ultimo.getDato();
                inicio = ultimo = null;
            }
            else{
                eliminado = ultimo.getDato();
                Nodo actual = inicio;
                while(actual.getSiguiente()!=ultimo){
                    actual = actual.getSiguiente();
                }
                actual.setSiguiente(null);
                ultimo = actual;
            }
        }
        return eliminado;
    }
    
    //Tarea
    //Todos los datos a insertar deben ser enteros
    //Se deben posicionar en un orden ascendente
    //Números enteros
    //Subir el proyecto completo con la función implementada y las llamadas en el main
    //No olvidar quitar las llamadas a los otros métodos
    
    public void insertaEnOrden(Object dato){
        if(vacio()){
            insertaInicio(dato);
        }else{
            Nodo actual = inicio;
            if(((Integer)dato)<=((Integer)inicio.getDato())){
                insertaInicio(dato);
            }else{
                while(true){
                    if(((Integer)dato)<=((Integer)actual.getSiguiente().getDato())&&
                            actual.getSiguiente()!=null){
                        Nodo temp = new Nodo(dato);
                        temp.setSiguiente(actual.getSiguiente());
                        actual.setSiguiente(temp);
                        break;
                    }else{
                        if(actual!=ultimo){
                            insertaFinal(dato);
                            break;
                        }else{
                            actual.setSiguiente(actual.getSiguiente());
                        }
                    }
                }
            }
        }
    }
    
    /*
    Función del profe
    public void insertaEnOrden(){
        
    }*/
    
    
    
    public static void main(String[] args) {
        ListaSimple miLista = new ListaSimple();
        /*
        miLista.insertaInicio("Hola 1");
        miLista.insertaInicio("Hola 2");
        miLista.insertaInicio(3);
        miLista.insertaInicio(4.52);
        miLista.insertaFinal("Último");
        
        miLista.imprimir();
        
        System.out.println("\nProbando eliminación al inicio");
        System.out.println("El elimento eliminado es: " + miLista.eliminaInicio());
        miLista.imprimir();
        
        System.out.println("\nProbando eliminación al final");
        System.out.println("El elemento eliminado es: " + miLista.eliminaFinal());
        miLista.imprimir();*/
        
        miLista.insertaEnOrden(5);
        miLista.insertaEnOrden(1);
        miLista.insertaEnOrden(44);
        miLista.insertaEnOrden(5);
        miLista.insertaEnOrden(0);
        
        miLista.imprimir();
    }
    
}
