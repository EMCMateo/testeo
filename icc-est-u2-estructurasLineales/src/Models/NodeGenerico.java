package Models;

public class NodeGenerico <T> { // EL <T> indica que es un tipo generico, se puede usar cualquier tipo de dato
    private T value;
    private NodeGenerico <T> next; // El <T> indica que el siguiente nodo es del mismo tipo generico T
    
    public NodeGenerico(T value) { //Recibe el dato generico T
        this.value = value;
        this.next = null;
    }

    
    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }


    public NodeGenerico <T > getNext() {
        return next;
    }


    public void setNext(NodeGenerico <T > next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "NodeGenerico{" +
                "value=" + value;
    }


    
}
