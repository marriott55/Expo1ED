
package colas;

import java.util.ArrayList;
import java.util.Collections;

public class NodoPrioridad implements Comparable{
    protected int prioridad;
    protected Object dato;

    public NodoPrioridad(int prioridad, Object dato) {
        this.prioridad = prioridad;
        this.dato = dato;
    }
    
    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }
    
    @Override
    public String toString(){
        return prioridad + ": " + dato;
    }
    
    @Override
    public int compareTo(Object t){
        return this.prioridad - ((NodoPrioridad)t).prioridad;
    }
    
    //Función main
    public static void main(String[] args) {
        ArrayList listaObjetos = new ArrayList();
        
        listaObjetos.add(new NodoPrioridad(25,"Holaaa"));
        listaObjetos.add(new NodoPrioridad(23,"Holaaa2"));
        listaObjetos.add(new NodoPrioridad(5,"Holaaa3"));
        listaObjetos.add(new NodoPrioridad(80,"Holaaa4"));
        listaObjetos.add(new NodoPrioridad(4,"Holaaa5"));
        Collections.sort(listaObjetos, Collections.reverseOrder());
        System.out.println(listaObjetos);
    }
}
