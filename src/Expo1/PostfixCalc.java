
package Expo1;

import pilas.ListaSPila;

/**
 *
 * @author mapro
 */
public class PostfixCalc {

    public static int evaluatePostfix(String exp) {
        ListaSPila pila = new ListaSPila();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            // Si es dígito, lo empuja a la pila
            if (Character.isDigit(c)) {
                pila.push(c - '0'); // Convierte el carácter a su valor entero
            } 
            else {
                // Verificar que haya al menos dos operandos en la pila
                if (pila.size() < 2) {
                    throw new IllegalArgumentException("Expresión inválida: no hay suficientes operandos para el operador '" + c + "' en la posición " + i);
                }

                // Extraer operandos; el primero extraído es el segundo operando
                Integer op2 = (Integer) pila.pop();
                Integer op1 = (Integer) pila.pop();
                int resultado;

                switch (c) {
                    case '+':
                        resultado = op1 + op2;
                        break;
                    case '-':
                        resultado = op1 - op2;
                        break;
                    case '*':
                        resultado = op1 * op2;
                        break;
                    case '/':
                        if (op2 == 0) {
                            throw new ArithmeticException("División por cero en la posición " + i);
                        }
                        resultado = op1 / op2;
                        break;
                    default:
                        throw new IllegalArgumentException("Operador no soportado: '" + c + "' en la posición " + i);
                }
                pila.push(resultado);
            }
        }

        // Tras procesar la expresión, la pila debe contener exactamente un elemento
        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión inválida: al finalizar, la pila contiene " + pila.size() + " elementos en lugar de 1.");
        }
        return (Integer) pila.pop();
    }

    public static void main(String[] args) {
        // Expresión válida: "12+4*5-" equivale a ((1+2)*4)-5 = 7
        String validExp = "12+4*5-";     
        try {
            System.out.println("Resultado de la expresión válida '" + validExp + "': " + evaluatePostfix(validExp));
        } catch (Exception e) {
            System.out.println("Error evaluando expresión '" + validExp + "': " + e.getMessage());
        }
        
        // Caso 4: Operador no soportado (por ejemplo, '^')
        String unsupportedOperator = "23^";
        try {
            System.out.println("Resultado de la expresión con operador no soportado '" + unsupportedOperator + "': " + evaluatePostfix(unsupportedOperator));
        } catch (Exception e) {
            System.out.println("Error evaluando expresión '" + unsupportedOperator + "': " + e.getMessage());
        }
        /*
        // Caso 1: Sólo operadores
        String onlyOperators = "+-/*";
        try {
            System.out.println("Resultado de la expresión solo operadores '" + onlyOperators + "': " + evaluatePostfix(onlyOperators));
        } catch (Exception e) {
            System.out.println("Error evaluando expresión '" + onlyOperators + "': " + e.getMessage());
        }
        
        // Caso 2: Sólo números
        String onlyNumbers = "1234";
        try {
            System.out.println("Resultado de la expresión solo números '" + onlyNumbers + "': " + evaluatePostfix(onlyNumbers));
        } catch (Exception e) {
            System.out.println("Error evaluando expresión '" + onlyNumbers + "': " + e.getMessage());
        }
        
        // Caso 3: Un solo número seguido de un operador
        String numberThenOperator = "2+";
        try {
            System.out.println("Resultado de la expresión '" + numberThenOperator + "': " + evaluatePostfix(numberThenOperator));
        } catch (Exception e) {
            System.out.println("Error evaluando expresión '" + numberThenOperator + "': " + e.getMessage());
        }
        */
        
    }
}