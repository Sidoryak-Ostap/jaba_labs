package models;

import java.util.HashSet;
import java.util.Set;

public class CompareSet<T>{

    private Set<T> set1;
    private  Set<T> set2;

    public  CompareSet(Set<T> set1, Set<T> set2){
        this.set1 = set1;
        this.set2 = set2;
    }

    public void showCommonValues(){
        HashSet<T> commonElements = new HashSet<T>(this.set1);
        commonElements.retainAll(this.set2);

        for(T element: commonElements){
            System.out.println(element);
        }


    }


}
