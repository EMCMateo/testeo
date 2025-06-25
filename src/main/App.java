package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        LogicaClasificacion logica = new LogicaClasificacion();
        // Probar invertirCadena
        String texto = "LOKENECESITAS";
        String invertido = logica.invertirCadena(texto);
        System.out.println("invertirCadena(\"" + texto + "\"): " + invertido);


        int numeros = 36401202;
        int invertidoNum = logica.invertirNumeros(numeros);
        System.out.println("invertirCadena(\"" + numeros + "\"): " + invertidoNum);



        // Probar validarSimbolos
        String expresion = "{[()]}";
        boolean balanceado = logica.validarSimbolos(expresion);
        System.out.println("validarSimbolos(\"" + expresion + "\"): " + balanceado);

        // Probar ordenarPila
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(1);
        pila.push(4);
        pila.push(2);
        System.out.println("ordenarPila([3, 1, 4, 2]): " + logica.ordenarPila(pila));

        // Probar clasificarPorParidad
        LinkedList<Integer> original = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("clasificarPorParidad([1, 2, 3, 4, 5, 6]): " + logica.clasificarPorParidad(original));
    
        Stack<Integer> pilaNuevo = new Stack<>();
        pilaNuevo.push(3);
        pilaNuevo.push(3);
        pilaNuevo.push(4);
        pilaNuevo.push(2);
        pilaNuevo.push(2);
        pilaNuevo.push(1);
        pilaNuevo.push(4);
        pilaNuevo.push(8);
        System.out.println("ordenarPila([3,3,4,2,2,1,4,8]): " + logica.eliminarDuplicados(pilaNuevo));

       Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        System.out.println("invertirCola([1, 2, 3]): " + logica.invertirCola(cola));

        
    }
}
