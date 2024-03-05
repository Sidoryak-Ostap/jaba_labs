package models;

import java.util.ArrayList;
import java.util.List;

public class ListOfArray<T> {

    private List<ArrayList<T>> listOfArrays;

    public ListOfArray(List<ArrayList<T>> listOfArrays){
        this.listOfArrays = listOfArrays;
    }
    public void changeArrayElement(int arrayPosition, int elementPosition, T value){
      if(this.listOfArrays.size()-1 <= arrayPosition){
          System.out.println("Index is out of the list range");
      } else if(this.listOfArrays.get(arrayPosition).size()-1 <= elementPosition ) {
          System.out.println("Index is out of the range of the list");
      } else {
          this.listOfArrays.get(arrayPosition).set(elementPosition, value);
      }

    }

    public void displayData(){
        for(ArrayList<T> array: this.listOfArrays){
            for(T element: array){
                System.out.println(element + "\t");
            }
            System.out.println();
        }
    }
}
