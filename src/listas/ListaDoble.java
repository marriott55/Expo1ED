package listas;

/**
 *
 * @author mapro
 */
public class ListaDoble extends ListaD{

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio=ultimo = new NodoDoble(dato);
        }else{
            NodoDoble nuevo = new NodoDoble(dato, inicio, null);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            inicio=ultimo=new NodoDoble(dato);
        }else{
            NodoDoble nuevo = new NodoDoble(dato, null, ultimo);
            ultimo.setSiguiente(nuevo);
            ultimo=nuevo;
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("Lista vacía");
        }else{
            if(inicio==ultimo){
                eliminado=inicio.getDato();
                inicio=ultimo=null;
            }else{
                eliminado=inicio.getDato();
                inicio=inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
        
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
        Object eliminado=null;
        if(vacio()){
            System.out.println("Lista vacía");
        }else{
            if(inicio==ultimo){
                eliminado = ultimo.getDato();
                inicio=ultimo=null;
            }else{
                eliminado = ultimo.getDato();
                ultimo=ultimo.getAnterior();
                ultimo.setSiguiente(null);
            }
        }
        
        return eliminado;
    }
    
    //Cuando la lista es´ta vacía, el elemento se coloca en la lista vacía
    //En caso de no estar vacía, su posicion será después del inicio.
    public void insertaDeSegundo(Object dato){
        if(vacio()){
            insertaInicio(dato);
        }else{
            if(inicio==ultimo){
                insertaFinal(dato);
            }else{
                NodoDoble temp = new NodoDoble(dato, inicio.getSiguiente(),inicio);
                temp.getSiguiente().setAnterior(temp);
                inicio.setSiguiente(temp);
            }
        }
    }
    
    
    public static void main(String[] args) {
        ListaDoble miListaD = new ListaDoble();
        
        miListaD.insertaInicio("z");
        miListaD.insertaInicio("h");
        miListaD.insertaInicio(20);
        miListaD.insertaFinal("Ultimo");
        miListaD.insertaFinal(32);
        
        
        System.out.println("Impresión en orden");
        miListaD.imprimir();
        
        System.out.println("\nImpresión al revés");
        miListaD.imprimirAlReves();
        
        System.out.println("\nEliminando al inicio...");
        System.out.println("El eliminado es: "+miListaD.eliminaInicio());
        
        System.out.println("\nImpresión en orden");
        miListaD.imprimir();
        
        System.out.println("\nImpresión al revés");
        miListaD.imprimirAlReves();
        
        System.out.println("\nEliminando al final...");
        System.out.println("\nEl elemento eliminado es: "+miListaD.eliminaFinal());
        
        System.out.println("\nImpresión en orden");
        miListaD.imprimir();
        
        System.out.println("\nImpresión al revés");
        miListaD.imprimirAlReves();
        
        miListaD.insertaDeSegundo("Dato insertado");
        System.out.println("\nImpresión final");
        miListaD.imprimir();
        
        miListaD.insertaDeSegundo("Dato insertado final");
        System.out.println("\nImpresión final final");
        miListaD.imprimir();
        
        
        
    }
}
