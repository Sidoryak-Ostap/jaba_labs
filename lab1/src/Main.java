//import models.Workshop;
//
//public class Main {
//
//    public static void main(String[] args){
//
//        Workshop workshop = new Workshop("Creative Innovations Hub", "123 Main Street");
//        workshop.addShift(100);
//        workshop.addShift(30);
//        workshop.addShift(20);
//
//        System.out.println("Кількість відремонтованих комп'ютерів: " + workshop.sumCountOfComputers());
//        System.out.println("Зміна з максимальною кілкістю відремонтованих комп'ютерів: " + workshop.getMaxShift().getCountOfRepairedComputers());
//        System.out.println("Довжина вулиці: " + workshop.getAddress().length());
//
//
//
//    }
//}

import java.math.BigInteger;

public class Main {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if (n1.compareTo(BigInteger.ZERO) < 0 || n2.compareTo(BigInteger.ZERO) < 0)
            throw new IllegalArgumentException("Input numbers must be non-negative");

        BigInteger result = n1.modPow(n2, BigInteger.TEN); // Use modPow to get the last digit
        return result.intValue(); // Return the last digit as an integer
    }
}


