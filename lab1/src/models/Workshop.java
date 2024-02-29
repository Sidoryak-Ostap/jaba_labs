package models;
import java.util.ArrayList;
import java.util.List;


public class Workshop {

    private String name;
    private String address;
    private List<Shift> shifts = new ArrayList<Shift>();


    public Workshop(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void displayWorkshopInfo(){
        System.out.println("Name: "+ this.name + ", address: " + this.address);
    }

    public void setName(String name){
        this.name= name;
    }
    public void setAddress(String address){
        this.address= address;
    }

    public String getAddress(){
        return this.address;
    }


    public void addShift(){
        shifts.add(new Shift());
    }

    public void addShift(int count){
        shifts.add(new Shift(count));
    }


    public int sumCountOfComputers(){
        int sum = 0;
            for(Shift shift: shifts){
                sum+=shift.getCountOfRepairedComputers();
        }
        return  sum;
    }

    public Shift getMaxShift(){
        Shift maxShift = null;
        int maxCount = 0;

            for(Shift shift: this.shifts){
                if(shift.getCountOfRepairedComputers() > maxCount){
                    maxShift = shift;
                    maxCount = shift.getCountOfRepairedComputers();
                }
            }

        return  maxShift;
    }


}
