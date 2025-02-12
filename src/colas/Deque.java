
package colas;


public interface Deque {
    public int size();
    public boolean isEmpty();
    public void insertFirst(Object o);
    public void insertLast(Object o);
    public Object removerFirst();
    public Object removeLast();
    public Object first();
    public Object last();
}
