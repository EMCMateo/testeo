package Controllers;

import Models.NodeGenerico;
import Models.Persona;

public class QueueGenerico <G> {

    private NodeGenerico <G> primero;
    private NodeGenerico <G> ultimo;
    public int size = 0;

    public QueueGenerico () {
        this.primero = null;
        this.ultimo = null;
    }


    public boolean isEmpty(){
        return primero == null;
    }

    public void add (G value){
        NodeGenerico <G> newNode = new NodeGenerico<G>(value);
        if (isEmpty()){
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode); // Enlaza el nodo nuevo al final de la cola
            ultimo = newNode;
        }
        size++;

    }

    public G remove(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        G value = primero.getValue();
        primero = primero.getNext();
        if (primero == null) { // Si la cola queda vacía, actualiza el último nodo
            ultimo = null;
        }
        //System.out.println("Eliminado: " + value);
        size--;
        return value;
    }

    public void peek(){
        if (isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        System.out.println(primero.getValue());
    }

    //Pregunta: El primero puede apuntar al ultimo,  Si, el ultimo no puede apuntar al primero


    public void stringQueue(){
        NodeGenerico<G> current = primero;
        while(current != null){
            System.out.print(current.getValue() + " ");
            current = current.getNext(); 
            
        }
        System.out.println("");
        System.out.println("-----------------");

    }

    public void size() {
        System.out.println("Tam: " + size);
    }


    public G buscarPersona(String nombre) {
        if (isEmpty()) return null;
        
        NodeGenerico<G> actual = primero;
        while (actual != null) {
            G valor = actual.getValue();
            // Verificamos si es una instancia de Persona y si el nombre coincide
            if (valor instanceof Persona) {
                Persona persona = (Persona) valor;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    return valor;
                }
            }
            actual = actual.getNext();
        }
        return null; // No encontrado
    }

    /**
     * Elimina una persona específica de la cola por nombre
     * @param nombre El nombre de la persona a eliminar
     * @return true si se eliminó, false si no se encontró
     */
    public boolean eliminarPersona(String nombre) {
        if (isEmpty()) return false;
        
        if (primero.getValue() instanceof Persona) {
            Persona personaPrimero = (Persona) primero.getValue();
            if (personaPrimero.getNombre().equalsIgnoreCase(nombre)) {
                primero = primero.getNext();
                if (primero == null) { // Si era el único elemento
                    ultimo = null;
                }
                size--;
                return true;
            }
        }
        
        NodeGenerico<G> actual = primero;
        while (actual.getNext() != null) {
            G valorSiguiente = actual.getNext().getValue();
            if (valorSiguiente instanceof Persona) {
                Persona persona = (Persona) valorSiguiente;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    NodeGenerico<G> nodoAEliminar = actual.getNext();
                    actual.setNext(nodoAEliminar.getNext());
                    
                    if (nodoAEliminar == ultimo) {
                        ultimo = actual;
                    }
                    
                    size--;
                    return true;
                }
            }
            actual = actual.getNext();
        }
        
        return false;
    }


    public boolean existePersona(String nombre) {
        return buscarPersona(nombre) != null;
    }

    public int obtenerPosicionPersona(String nombre) {
        if (isEmpty()) return -1;
        
        NodeGenerico<G> actual = primero;
        int posicion = 0;
        
        while (actual != null) {
            G valor = actual.getValue();
            if (valor instanceof Persona) {
                Persona persona = (Persona) valor;
                if (persona.getNombre().equalsIgnoreCase(nombre)) {
                    return posicion;
                }
            }
            actual = actual.getNext();
            posicion++;
        }
        
        return -1;
    }


        
}
