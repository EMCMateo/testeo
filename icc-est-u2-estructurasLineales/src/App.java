

import Controllers.Queue;
import Controllers.QueueGenerico;
import Models.Persona;
import Controllers.Stack;
import Controllers.StackGenerico;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.size();
        stack.sizeO1();
        stack.stringStack();
        
        stack.pop();
        stack.peek();
        stack.size();
        stack.sizeO1();
        stack.stringStack();


        
        System.out.println("============================================================");
        StackGenerico<String> stackGenericoString = new StackGenerico<>();
        stackGenericoString.push("UNO");
        stackGenericoString.push("CUATRO");
        stackGenericoString.push("CINCO");
        stackGenericoString.stringStack();
        stackGenericoString.size();
        stackGenericoString.pop();
        stackGenericoString.size();
        stackGenericoString.stringStack();

        System.out.println("============================================================");
        StackGenerico<Integer> stackGenericoInt = new StackGenerico<>();
        stackGenericoInt.push(25);
        stackGenericoInt.push(36);
        stackGenericoInt.push(14);
        stackGenericoInt.size();
        stackGenericoInt.stringStack();
        stackGenericoInt.pop();
        stackGenericoInt.size();
        stackGenericoInt.stringStack();

        System.out.println("============================================================");
        Queue queue = new Queue();
        queue.add(2);
        queue.add(8);
        queue.add(15);
        queue.stringQueue();
        System.out.println(queue.size);
        queue.remove();
        queue.remove();
        queue.stringQueue();
        System.out.println(queue.size);


        Persona p1 = new Persona ("PABLO");
        Persona p2 = new Persona ("JUAN");
        Persona p3 = new Persona ("MATEO");

        QueueGenerico <Persona> queuePersonas = new QueueGenerico<Persona>();
        queuePersonas.add(p1);
        queuePersonas.add(p2);
        queuePersonas.add(p3);
        queuePersonas.size();
        queuePersonas.stringQueue();
        queuePersonas.remove();
        queuePersonas.size();
        queuePersonas.stringQueue();








        StackGenerico <Character> StackGenericoChar = new StackGenerico<Character>();
        StackGenerico <Character> StackGenericoChar2 = new StackGenerico<Character>();
        
        System.out.println("-----------------------------------------------------------");
        char var = '1';
        while(var != 0){
            System.out.println("Ingrese un caracter = '(' , ')' , '{' , '}' , '[' o ']' , Para salir ingrese '0'");
            var = scanner.next().charAt(0);
            StackGenericoChar.push(var);;
            StackGenericoChar.stringStack();
            if (var == '(' || var == '{' || var == '[') {
                StackGenericoChar.push(var);
            } else if (var == ')' || var == '}' || var == ']') {
                StackGenericoChar2.push(var);
            }
            char last = StackGenericoChar2.peek(); 
            if ( var == '(' && last == ')' ||  var == '[' && last == ']' &&  var == '{' && last == '}'){
                System.out.println("Paréntesis balanceados");
                
            } else if (var == ')' || var == '}' || var == ']') {    
                if (StackGenericoChar.isEmpty()) {
                    System.out.println("Error: Paréntesis desbalanceados");
                } else {
                    char lastChar = StackGenericoChar.pop();
                    if ((lastChar == '(' && var != ')') || (lastChar == '{' && var != '}') || (lastChar == '[' && var != ']')) {
                        System.out.println("Error: Paréntesis desbalanceados");
                    } else {
                        System.out.println("Paréntesis balanceados");
                    }

                }

                /* 
                if (!QueueGenericoChar2.isEmpty()) {
                    char last = QueueGenericoChar2.remove();
                    if ((last == '(' && var != ')') || (last == '{' && var != '}') || (last == '[' && var != ']')) {
                        System.out.println("Error: Paréntesis desbalanceados");
                    }
                } else {
                    System.out.println("Error: desbalanceado");
                }
                */
            



            if (var == '0') {
                System.out.println("Saliendo del programa...");
                for (int i = 0; i <= StackGenericoChar.size; i++) {
                    System.out.println(StackGenericoChar.pop());
                }
                break;
            }
        }
        
    }
}
