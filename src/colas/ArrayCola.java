
package colas;

public class ArrayCola implements Queue{

    protected Object[] cola;
    private int tamano;

    public ArrayCola() {
        cola = new Object[100];
        tamano = 0;
    }

    //Métodos get y set del tamaño de la cola
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    //Métodos del comportamiento de la cola
    
    @Override
    public void enqueue(Object dato) {
        if(!isFull()){
            cola[getTamano()]=dato;
            setTamano(getTamano()+1);
        }
        else{
            System.out.println("La cola está llena");
        }
    }

    @Override
    public Object dequeue() {
        Object x;
        if(isEmpty()){
            System.out.println("La pila está vacía");
            return null;
        }
        else{
            x= cola[0];
            recorrer();
        }
        return x;
    }

    @Override
    public int size() {
        return getTamano();
    }

    @Override
    public Object front() {
        return cola[0];
    }

    @Override
    public boolean isEmpty() {
        return getTamano()==0;
    }
    
    public boolean isFull(){
        return getTamano()==100;
    }
    
    public void recorrer(){
        for(int i=0; i<getTamano();i++){
            cola[i]=cola[i+1];
        }
        setTamano(getTamano()-1);
    }
    
    public static void main(String[] args) {
        ArrayCola miCola = new ArrayCola();
        
        miCola.enqueue("Hola mundo");
        miCola.enqueue(":)");
        miCola.enqueue(4.5);
        miCola.enqueue(4);
        
        while(!miCola.isEmpty()){
            System.out.println(miCola.dequeue());
        }
    }
    
    
}
