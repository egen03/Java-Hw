package unitconversion;

import java.util.Scanner;

public class unitconversion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        double inches=sc.nextDouble();
        int inches = 4;

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is equivalent to " + meters + " meters");
    }
}
