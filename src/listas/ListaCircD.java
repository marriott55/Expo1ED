
package listas;

/**
 *
 * @author mapro
 */
public abstract class ListaCircD extends ListaD{
    
    @Override
    public void imprimir(){
        if(vacio()){
            System.out.println("Lista vacía");
        }else{
            NodoDoble actual= inicio;
            do{
                System.out.print(actual.getDato());
                actual=actual.getSiguiente();
                if(actual!=inicio){
                    System.out.print("->");
                }
            }while(actual!=inicio);
        }
    }
    
    @Override
    public void imprimirAlReves(){
        if(vacio()){
            System.out.println("Lista vacía");
        }else{
            NodoDoble actual = ultimo;
            do{
                System.out.print(actual.getDato());
                actual = actual.getAnterior();
                if(actual!=ultimo){
                    System.out.print("->");
                }
            }while(actual!=ultimo);
        }
    }
    
}
