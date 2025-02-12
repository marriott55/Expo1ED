package listas;

/**
 *
 * @author mapro
 */
public class ListaDobleC extends ListaCircD{

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio = ultimo = new NodoDoble(dato);
            inicio.setSiguiente(inicio);
            inicio.setAnterior(inicio);
        }else{
            NodoDoble temp = new NodoDoble(dato, inicio, ultimo);
            temp.getSiguiente().setAnterior(temp);
            inicio=temp;
            ultimo.setSiguiente(inicio);
        }
    }

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            inicio=ultimo = new NodoDoble(dato);
            ultimo.setSiguiente(ultimo);
            ultimo.setAnterior(ultimo);
        }else{
            NodoDoble temp = new NodoDoble(dato, inicio, ultimo);
            temp.getAnterior().setSiguiente(temp);
            ultimo=temp;
            inicio.setAnterior(ultimo);
        }
    }

    @Override
    public Object eliminaInicio() {
        Object eliminado = null;
        if(vacio()){
            System.out.println("La lista está vacía");
        }else{
            if(inicio==ultimo){
                eliminado=inicio.getDato();
                inicio=ultimo=null;
            }else{
                eliminado = inicio.getDato();
                inicio=inicio.getSiguiente();
                ultimo.setSiguiente(inicio);
                inicio.setAnterior(ultimo);
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
                eliminado=ultimo.getDato();
                inicio=ultimo=null;
            }else{
                eliminado = ultimo.getDato();
                ultimo= ultimo.getAnterior();
                ultimo.setSiguiente(inicio);
                inicio.setAnterior(ultimo);
            }
        }
        return eliminado;
    }
    
    
    
    public static void main(String[] args) {
        ListaDobleC miLista = new ListaDobleC();
        
        miLista.insertaInicio("hola");
        miLista.insertaInicio("El primero");
        miLista.insertaFinal(32);
        miLista.insertaFinal("último");
        miLista.imprimir();
        System.out.println("\n");
        miLista.imprimirAlReves();
        
        System.out.println("\nProbando las eliminaciones");
        System.out.println("Objeto eliminado al inicio: "+miLista.eliminaInicio());
        System.out.println("Objeto eliminado al final: " + miLista.eliminaFinal());
        miLista.imprimir();
    }
    
}
