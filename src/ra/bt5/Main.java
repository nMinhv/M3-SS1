package ra.bt5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scS = new Scanner(System.in);
        System.out.println("Enter Your math Score:");
        float mathS = Float.parseFloat(scS.nextLine());
        System.out.println("Enter Your Physics Score:");
        float physicsS = Float.parseFloat(scS.nextLine());
        System.out.println("Enter Your Chemist Score:");
        float chemistS = Float.parseFloat(scS.nextLine());
        System.out.println("Enter Your English Score:");
        float EngS = Float.parseFloat(scS.nextLine());
        float avgS = (mathS + physicsS + chemistS + EngS) / 4;
        System.out.println("Your Average score is:" );
        System.out.printf("avgs = %-2.1f", avgS);
        if(avgS < 5) {
            System.out.println(" Weak learning capacity");
        }else if (avgS < 6.5) {
            System.out.println(" Average learning capacity");
        }else if(avgS < 8.0) {
            System.out.println(" Good learning capacity");

        }else {
            System.out.println(" Excellent learning capacity");
        }
    }
}
