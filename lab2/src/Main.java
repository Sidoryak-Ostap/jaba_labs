import models.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cube rib length: ");
        int a = scanner.nextInt();
        Solid cube = new Cube(a);

        System.out.println("Enter width, length and height of parallelepiped: ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        int height = scanner.nextInt();
        Solid reactSolid = new RectSolid(width, length, height);

        List<Solid> list = List.of(cube, reactSolid);
        for(Solid obj : list){
            System.out.println(obj.getSurfaceArea());
        }
    }
}
