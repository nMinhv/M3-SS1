package ra.bt7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scT = new Scanner(System.in);
        System.out.println("Enter number 0-9 want to convert ot string:");
        int numI =  scT.nextInt();
        String readInt = "" ;
        switch (numI) {
            case 0: readInt = "Zero";break;
            case 1: readInt = "One";break;
            case 2: readInt = "Two";break;
            case 3: readInt = "Three";break;
            case 4: readInt = "Four";break;
            case 5: readInt = "Five";break;
            case 6: readInt = "Six";break;
            case 7: readInt = "Seven";break;
            case 8: readInt = "Eight";break;
            case 9: readInt = "Nine";break;
            default:
                System.out.println("invalid number");
        }
        System.out.println(readInt);

    }
}
