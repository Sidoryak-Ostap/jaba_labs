import models.CompareSet;
import models.LinkedListPosition;
import models.ListOfArray;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Random random = new Random();

        //Task A

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i =0; i<10; i++){
            int randomNum = i + random.nextInt(100);
            linkedList.add(randomNum);
        }

        LinkedListPosition linkedListPosition = new LinkedListPosition(linkedList);
        linkedListPosition.displayPosition();

        System.out.println();


       //Task B

        List<List<String>> list = new ArrayList<>();
        List<String> arr1 = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
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

        HashSet<Integer> ages1 = new HashSet<Integer>();
        ages1.add(18);
        ages1.add(22);
        ages1.add(45);
        ages1.add(25);

        HashSet<Integer> ages2 = new HashSet<Integer>();
        ages2.add(16);
        ages2.add(22);
        ages2.add(32);
        ages2.add(25);

        var compareSet = new CompareSet<>(ages1, ages2);
        compareSet.showCommonValues();

        // Task D

        Map<String, Integer> daysOfWeek = new HashMap<>();
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(int i = 0; i<days.length; i++){
           daysOfWeek.put(days[i], i+1);
        }

        Set<String> keySet = daysOfWeek.keySet();
        System.out.println("Набір ключів:");
        for (String key : keySet) {
            System.out.println(key);
        }


    }
}

