package main;

import java.awt.font.TextLayout;
import java.util.*;
import javax.security.auth.x500.X500Principal;

public class LogicaClasificacion {

    /**
     * Invierte una cadena de texto utilizando una pila (Stack).
     *
     * @param texto Cadena original a invertir.
     * @return Cadena invertida.
     *
     *         Ejemplo:
     *         Entrada: "Hola Mundo"
     *         Salida: "odnuM aloH"
     */
    

/*/
     public String invertirCadena(String texto) {
        Stack<String> pila = new Stack<>();
        if (texto == null){
            return "";
        }
        pila.clear();
        for (char c : texto.toCharArray()){
            pila.add(String.valueOf(c));
        }
        StringBuilder cadenaInv = new StringBuilder();
        while(pila.isEmpty() == false){
            cadenaInv.append(pila.pop());

        }
        
        return cadenaInv.toString();
    }
        */

        public String invertirCadena(String texto) {
            Stack<String> pila = new Stack<>();
            if (texto == null){
                return "";
            }

            for (char c : texto.toCharArray()){
                pila.push(String.valueOf(c));
            }
            StringBuilder cadenaInv = new StringBuilder();
            while(pila.isEmpty() == false){
                cadenaInv.append(pila.pop());
            }
            return cadenaInv.toString();
        }
            


    public int invertirNumeros(int numeros){
        Stack<Integer> pilaInvertir = new Stack<>();
        
        pilaInvertir.clear();

        

        
        return -1;
    }

    /**
     * Verifica si los símbolos de paréntesis, corchetes y llaves están bien
     * balanceados.
     *
     * @param expresion Cadena con símbolos.
     * @return true si está balanceada, false en caso contrario.
     *
     *         Ejemplo:
     *         Entrada: "{[()]}"
     *         Salida: true
     */
    

    


/*
    public boolean validarSimbolos(String expresion) {
        Stack<Character> pila = new Stack<>();
        if (expresion == null){
            return false;
        }
        pila.clear();
        for (char c : expresion.toCharArray()){
            if (c == '{' || c == '(' || c == '['  ){
                pila.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                if (pila.isEmpty()){
                    return false;
                }
                char ultimo = pila.pop();
                if (c == '}' && ultimo != '{' || 
                    c == ')' && ultimo != '(' || 
                    c == ']' && ultimo != '['){
                        return false;
                    }
            

            }
        }
        return pila.isEmpty();
    }
        */

        public boolean validarSimbolos(String expresion) {
            Stack<Character> pila = new Stack<>();
            if (expresion == null){
                return false;
            }
            for (char c : expresion.toCharArray()){
                if (c == '{' || c == '(' || c == '[' ){
                    pila.push(c);
                }else if (c == '}' || c == ')' || c == ']' ) {
                    if (pila.isEmpty()){
                        return false;
                    }
                    char ultimo = pila.pop();
                    if (c == '}' && ultimo != '{' || 
                        c == ')' && ultimo != '(' ||
                        c == ']' && ultimo != '['){
                            return false;
                        }
                    
                }
            
            }
            return pila.isEmpty();

        }





    /**
     * Ordena una pila de enteros en orden ascendente usando otra pila auxiliar.
     *
     * @return Lista ordenada.
     *
     *         Ejemplo:
     *         Entrada: [3, 1, 4, 2]
     *         Salida: [1, 2, 3, 4]
     */
    /*
    public List<Integer> ordenarPila(Stack<Integer> pila) {
        Stack<Integer> pilaOrdenar = new Stack<>(); 
        if(pila.isEmpty()){
            return new ArrayList<>();
        }
        while(pila.isEmpty() == false){
            int aux = pila.pop();
            while (pilaOrdenar.isEmpty() == false && pilaOrdenar.peek() > aux){
                pila.push(pilaOrdenar.pop());
            }
            pilaOrdenar.push(aux);
        
        
        
        }
             
        
        
        
        
        return pilaOrdenar;
    }
        */

       

        public List<Integer> ordenarPila(Stack<Integer> pila) {
            Stack<Integer> pilaOrdenada = new Stack<>();
            if(pila.isEmpty()){
                return new ArrayList<>();
            }

            while(pila.isEmpty() == false){
                int aux = pila.pop();
                while(pilaOrdenada.isEmpty() == false && pilaOrdenada.peek() > aux){
                    pila.push(pilaOrdenada.pop());
                }
                pilaOrdenada.push(aux);
            }
            return pilaOrdenada;
            
        
        }

    /**
     * Clasifica una lista de enteros separando pares e impares.
     * Usa LinkedList para mantener el orden de inserción.
     *
     * @return Lista con pares primero, luego impares.
     *
     *         Ejemplo:
     *         Entrada: [1, 2, 3, 4, 5, 6]
     *         Salida: [2, 4, 6, 1, 3, 5]
     */
    public List<Integer> clasificarPorParidad(LinkedList<Integer> original) {
        List<Integer> numPares = new LinkedList<>();
        List<Integer> numImpares = new LinkedList<>();
        if (original.isEmpty()){
            return new ArrayList<>();
        }

        while(original.isEmpty() == false){
            if (original.peek() % 2 == 0){
                numPares.add(original.pop());
            }else {
                numImpares.add(original.pop());
            }

            
            
        }
        List<Integer> res = new LinkedList<>(numPares);
            res.addAll(numImpares);
            return res;
    }

    
}
