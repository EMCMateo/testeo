package Controllers;
import Models.Node;
public class Queue {
    
    private Node primero;
    private Node ultimo;
    public int size = 0;

    public Queue(){
        this.primero = null;
        this.ultimo = null;
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public void add (int value){
        Node newNode = new Node(value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode); // Enlaza el nodo nuevo al final de la cola
            ultimo = newNode;
        }
        size++;

    }

    public void remove (){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        int value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) { // Si la cola queda vacía, actualiza el último nodo
            ultimo = null;
        }
        System.out.println("Eliminado: " + value);
        size--;
    }

    public void peek(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        System.out.println(primero.getValue());
    }

    //Pregunta: El primero puede apuntar al ultimo,  Si, el ultimo no puede apuntar al primero


    public void stringQueue(){
        Node current = primero;
        while(current != null){
            System.out.print(current.getValue() + "|");
            current = current.getNext(); 
            
        }
        System.out.println("");
        System.out.println("-----------------");

    }
    



}
