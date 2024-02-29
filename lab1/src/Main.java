import models.Workshop;

public class Main {

    public static void main(String[] args){

        Workshop workshop = new Workshop("Creative Innovations Hub", "123 Main Street");
        workshop.addShift(100);
        workshop.addShift(30);
        workshop.addShift(20);

        System.out.println("Кількість відремонтованих комп'ютерів: " + workshop.sumCountOfComputers());
        System.out.println("Зміна з максимальною кілкістю відремонтованих комп'ютерів: " + workshop.getMaxShift().getCountOfRepairedComputers());
        System.out.println("Довжина вулиці: " + workshop.getAddress().length());








    }
}
