
package colas;

public interface Queue {
    public void enqueue(Object dato);//Encolar, o meter a la cola
    public Object dequeue();//Desencolar o sacar
    public int size();//Verificar el tamaño de la cola
    public Object front();//Ver el próximo en salir sin quitarlo
    public boolean isEmpty();//Verificar si está vacío
}
