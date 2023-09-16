package ra.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter width");
        float width = Float.parseFloat(sc.nextLine());
        System.out.println("enter length");
        float length = Float.parseFloat(sc.nextLine());
        float peri = (width + length) * 2;
        float acreage = width * length;
        System.out.println("perimeter of rectangle is: " + peri);
        System.out.println("acreage of rectangle is: " + acreage);


    }
}
