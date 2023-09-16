package ra.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of USD want to convert to VND");
        float ipUsd = Float.parseFloat(sc.nextLine());
        System.out.println(ipUsd + "USD is " + ipUsd*rate + "VND");
    }
}
