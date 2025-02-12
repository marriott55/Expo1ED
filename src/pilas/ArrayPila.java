
package pilas;

public class ArrayPila implements Pila {

    protected Object[] pila;
    private int end;

    public ArrayPila() {
        pila =  new Object[100];
        end = 0;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    
    @Override
    public void push(Object x) {
        if(!isFull()){
            pila[getEnd()] = x;
            setEnd(getEnd()+1);
        }
        else{
            System.out.println("Pila llena");
        }
    }

    @Override
    public Object pop() {
        Object x;
        if(isEmpty()){
            System.out.println("La pila está vacía");
            return null;
        }
        else{
            setEnd(getEnd()-1);
            x= pila[getEnd()];
            pila[getEnd()]=null;
        }
        return x;
        
    }

    @Override
    public Object top() {
        if(isEmpty()){
            System.out.println("La pila está vacía");
            return null;
        }
        else{
            return pila[getEnd()-1];
        }
    }

    @Override
    public int size() {
        return getEnd();
    }

    @Override
    public boolean isEmpty() {
        return getEnd()==0;
    }
    
    public boolean isFull(){
        return getEnd()==100;
    }
    
    public static void main(String[] args) {
        
        ArrayPila miPila= new ArrayPila();
        
        miPila.push("Hola mundo");
        miPila.push(":)");
        miPila.push(4.5);
        miPila.push(4);
        
        while(!miPila.isEmpty()){
            System.out.println(miPila.pop());
        }
    }
    
    
}
