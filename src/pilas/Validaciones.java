
package pilas;

public class Validaciones {
    
    protected ArrayLPila pila;

    public Validaciones() {
        pila = new ArrayLPila();
    }
    
    public boolean parentesis(String cadena){
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)=='('){
                pila.push('(');
            }
            else{
                if(cadena.charAt(i)==')'&& !pila.isEmpty()){
                    pila.pop();
                }
                else{
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }
    
    public boolean palindromo(String cadena){
        
        String cadenaLimpia = cadena.replaceAll(" ", "").toLowerCase();
        int mitad = (cadenaLimpia.length()/2);
        
        for(int i=0; i<mitad; i++){
            if(cadenaLimpia.charAt(i)!=' '){
                pila.push(cadenaLimpia.charAt(i));
            } 
        }
        if(!par(cadenaLimpia)){
            mitad++;
        }
        for(int i=mitad;i<cadenaLimpia.length();i++){
            if(cadenaLimpia.charAt(i)== (Character)pila.top() && !pila.isEmpty()){
                    pila.pop();
            }
            else{
               return false; 
            }
        }
        return pila.isEmpty();
    }
    
    public boolean par(String cadena){
        return cadena.length()%2==0;
    }
    
    public static void main(String[] args) {
        Validaciones valida = new Validaciones();
        /*if(valida.parentesis("()(())(")){
            System.out.println("La cadena está equilibrada");
        }
        else{
            System.out.println("La cadena no está equilibrada");
        }*/
        if(valida.palindromo("amo la paloma")){
            System.out.println("La cadena es un palíndromo");
        }
        else{
            System.out.println("La cadena no es un palíndromo");
        }
    }

}
