package ra.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // phân tích yêu cầu, đọc 1 số từ 0 đến 999
        // thuật toán đọc số có 1 chữ số
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer < 999: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Invalid Number");
        } else {
            String result = readNumber(number);
            System.out.println(result);
        }
    }

    public static String readNumber(int number) {
        if (number == 0) {
            return "zero";
        }

        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String words = "";

        int hundreds = number / 100;
        int tensAndOnes = number % 100;
        int onesDigit = tensAndOnes % 10;
        int tensDigit = tensAndOnes / 10;

        if (hundreds > 0) {
            words += ones[hundreds] + " hundred";
            if (tensAndOnes > 0) {
                words += " and ";
            }
        }

        if (tensAndOnes >= 11 && tensAndOnes <= 19) {
            words += teens[tensAndOnes - 10];
        } else {
            words += tens[tensDigit];
            if (onesDigit > 0) {
                words += " " + ones[onesDigit];
            }
        }

        return words;
    }


}
