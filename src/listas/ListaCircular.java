
package listas;

/**
 *
 * @author mapro
 */
public abstract class ListaCircular extends Lista{
    
    @Override
    public void imprimir(){
       Nodo actual=inicio;
       if(!vacio()){
           if(inicio== ultimo){
               System.out.println(actual.getDato());
           }else{
               do{
                   System.out.print(actual.getDato()+"->");
                   actual = actual.getSiguiente();
               }while(actual!=inicio);
           }
       }
    }
    
    
}
