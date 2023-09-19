package ra.th3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số kiểu tra :");
        Long nb = sc.nextLong();
        if(nb%2 == 0){
            System.out.println(nb + " : Là số chẵn");
        }else {
            System.out.println(nb + " : Là số lẻ");
        }
    }
}
