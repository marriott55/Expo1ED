
package listas;

/**
 *
 * @author mapro
 */
public class NodoDoble extends Nodo{
    protected NodoDoble siguiente;
    protected NodoDoble anterior;

    public NodoDoble(Object dato, NodoDoble siguiente, NodoDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public NodoDoble(Object dato) {
        this.dato = dato;
        siguiente = anterior = null;
    }
    
    public NodoDoble(){
        
    }

    /**
     * @return the siguuiente
     */
    public NodoDoble getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguuiente the siguuiente to set
     */
    public void setSiguiente(NodoDoble siguuiente) {
        this.siguiente = siguuiente;
    }

    /**
     * @return the anterior
     */
    public NodoDoble getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
    
    
    
}
