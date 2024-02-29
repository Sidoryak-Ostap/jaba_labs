package models;
import java.util.Random;

public class Shift {

    private int countOfRepairedComputers;
    private Random random = new Random();


    public Shift(){
        countOfRepairedComputers = random.nextInt(50);
        this.countOfRepairedComputers = countOfRepairedComputers;
    }

    public Shift(int count){
        this.countOfRepairedComputers = count;
    }


    public void setCountOfRepairedComputers(int count){
        this.countOfRepairedComputers = count;
    }

    public int getCountOfRepairedComputers() {
        return countOfRepairedComputers;
    }
}

