package models;
import java.util.LinkedList;

public class LinkedListPosition<T> {

    private LinkedList<T> linkedList;

    public LinkedListPosition(LinkedList<T> linkedList){
        this.linkedList = linkedList;
    }
    public void displayPosition(){
        for(int i=0; i<linkedList.size(); i++){
            T element = this.linkedList.get(i);
            System.out.println("Element at position " + i + ": " + element);
        }
    }

}
