import models.CompareSet;
import models.LinkedListPosition;
import models.ListOfArray;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

         Task A

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i =0; i<10; i++){
            int randomNum = i + random.nextInt(100);
            linkedList.add(randomNum);
        }

        LinkedListPosition linkedListPosition = new LinkedListPosition(linkedList);
        linkedListPosition.displayPosition();

        System.out.println();
//
//        // Task B
        List<ArrayList<String>> list = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList();
        ArrayList<String> arr2 = new ArrayList();
        arr1.add("BMW");
        arr1.add("Volvo");
        arr1.add("Audi");
        arr1.add("Toyota");

        arr2.add("Lviv");
        arr2.add("Kyiv");
        arr2.add("Rivne");
        list.add(arr1);
        list.add(arr2);

        ListOfArray listOfArray = new ListOfArray(list);
        listOfArray.displayData();
        listOfArray.changeArrayElement(0, 1, "Mercedes");
        listOfArray.displayData();


        // Task C

        Set<Integer> ages1 = new HashSet<Integer>();
        ages1.add(18);
        ages1.add(22);
        ages1.add(45);
        ages1.add(25);

        Set<Integer> ages2 = new HashSet<Integer>();
        ages2.add(16);
        ages2.add(22);
        ages2.add(32);
        ages2.add(25);

        CompareSet compareSet = new CompareSet(ages1, ages2);
        compareSet.showCommonValues();

//         Task D

        Map<String, Integer> map = new HashMap<>();
        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);
        map.put("Thursday", 4);
        map.put("Friday", 5);
        map.put("Saturday", 6);
        map.put("Sunday", 7);

        Set<String> keySet = map.keySet();
        System.out.println("Набір ключів:");
        for (String key : keySet) {
            System.out.println(key);
        }




    }
}

