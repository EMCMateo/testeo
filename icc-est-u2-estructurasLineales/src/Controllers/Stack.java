
package Controllers;
import Models.Node;
public class Stack {
    private Node top;
    private int  size =0;

    public Stack ( ) {
        this.top = null;

    }

    public void push (int getValue){
        Node nodoNuevo = new Node(getValue);
        nodoNuevo.setNext(top); 
        top = nodoNuevo;    
        size++;

    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int value = top.getValue();
        top = top.getNext();
        size = size - 1;
        return value;
       
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.getValue();
        }

        public void stringStack(){
            Node current = top;
            while(current != null){
                System.out.print(current.getValue() + "|");
                current = current.getNext(); 
                
            }
            System.out.println("");
            System.out.println("-----------------");

        }
        public void size(){
            Node current = top;
            int cont = 0;
            while (current != null) {
            cont = cont +1;
            current = current.getNext();
                
            }
            System.out.println("Tam: " + cont);
        }
        public void sizeO1(){
            System.out.println("Tam: " + size);
        }


    
}
