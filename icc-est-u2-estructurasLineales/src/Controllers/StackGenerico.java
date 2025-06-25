package Controllers;

import Models.NodeGenerico;

public class StackGenerico <T>{ // EL <T> indica que es un tipo generico, se puede usar cualquier tipo de dato
    private NodeGenerico <T> top; // El <T> indica que el nodo es del mismo tipo generico T, debe estar parametrizado
    public int size =0;


          
        public StackGenerico() {
            this.top = null;
        }

    
        public void push(T value) {
            NodeGenerico<T> newNode = new NodeGenerico<T>(value);
            newNode.setNext(top);
            top = newNode;
            size++;
        }
    
        public T pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            T value = top.getValue();
            top = top.getNext();
            size--;
            return value;
        }
    
        public boolean isEmpty() {
            return top == null;
        }
    
        public T peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return top.getValue();
        }
    
        public void size() {
            System.out.println("Tam: " + size);
        }

        public void stringStack(){
            NodeGenerico <T> current = top;
            while(current != null){
                System.out.print(current.getValue() + "|");
                current = current.getNext(); 
                
            }
            System.out.println("");
            System.out.println("----------------");
        }
}
    
    
