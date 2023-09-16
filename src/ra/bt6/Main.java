package ra.bt6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scN = new Scanner(System.in);
        System.out.println("enter a number want to check:");
        int ipNum = scN.nextInt();
        int surplus3 = ipNum % 3;
        int surplus5 = ipNum % 5;
        if(surplus3 == 0 && surplus5 == 0) {
            System.out.println(ipNum + " divisible by 3 and 5");
        }else if(surplus3 == 0 && surplus5 != 0) {
            System.out.println(ipNum + " divisible by 3 but not 5");
        }else if(surplus3 != 0 && surplus5 == 0) {
            System.out.println(ipNum + " divisible by 5 but not 3");
        }else {
            System.out.println(ipNum + "not divisible by 5 and 3");
        }
    }
}
