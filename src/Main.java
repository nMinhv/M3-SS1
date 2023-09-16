import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
////        System.err.println("This is Error");
//        System.out.println("\u001B[31mRed textfdfd");
//        System.out.println("\u001B[32mGreen text");
//        System.out.println("\u001B[33mYellow text");
//        System.out.println("\u001B[34mBlue text");
//        System.out.println("\u001B[35mPurple text");
//        System.out.println("\u001B[36mCyan text 😢🤦‍♂️🤦‍♀️🤦‍♀️😜🤞✌️🤷‍♂️😁👍🙌😒😍😊😂🤣❤️⚛️♾️◀️🔼");
//        System.out.println("\u001B[37mWhite text😊😂😂😂🤣🤣❤️");

        // variable and data types
//            primative
        int number = 10;
        float fl = 5.9F;
        double db = 10.0;
        char ch = 'a';
        boolean check = true;
        // if variable is string use %s , la so nguyen thi dung %d
        // neu la so thuc dung %f, neu la cac kieu khac thi mac dinh la %s
        // cac ki tu dac biet \n - xuong dong; \t tab
//        System.out.printf("\u001B[32mnumber = %5d | fl = %-5.2f | db = %5.3f | ch = %s | check = %-10s\n", number, fl, db, ch, check);
//             reference
        String name = "Hồ Xuân Hùng"; // char[] khi thay đổi giá trị của 1 chuỗi thì tạo ra 1 mảng kí tự mới
        String str = name;
        name = "nam";
        Date date = new Date();

//        System.out.println("Ngày tháng hiện tại là : " + date);
//        System.out.println("Họ Tên : " + name);
//        System.out.println("str :" + str);
//        Scanner sc = new Scanner(System.in); // đây là máy quét dùng để nhập dữ liệu từ màn hình console
        // từ màn hình console
        // nhập chuỗi, số thực, boolean, byte, ...
        // str
//        System.out.println("hãy nhập vào địa chỉ");
//        String address = sc.nextLine();
//        System.out.println("địa chỉ : " + address);
        // int
//        System.out.println("hãy nhập vào số ");
//        int a = sc.nextInt();
//        System.out.println("số :" + a);
//        khi mà nhập số xong mà chuyển qua nhập chuỗi thì sẽ bị nuốt dòng
//        System.out.println("hãy nhập vào str");
//        String str2 = sc.nextLine();
//        System.out.println("str : " + str2);
//        int b = Integer.parseInt(sc.nextLine()); // ép kiểu
//        System.out.println("số vừa nhâp: " +b);
//        float c = Float.parseFloat(sc.nextLine());
//        System.out.println("số vừa nhâp: " +c);

        // khai báo biến hằng
        final float PI = 3.14F;
        // toán tử
        // -- ++ dùng ể giảm hoặc tăng giá trị của biến 1 đơn vi
        // tiền tố : ++d hoặc --d;
        int d = 10;
//        System.out.println("giá trị ++d" + ++d);
        // hậu tó: d++ hoặc d--
        System.out.println("giá trị d++" + d--);
// toán tử 3 ngôi
        // (biểu thức logic) ? (nếu đúng): (sai);
        // kiểm tra 1 số người dùng nhập vào là chẵn 2 lẻ
        Scanner scn = new Scanner(System.in);
        System.out.println("hay nhap vao 1 so");
        int n = scn.nextInt();
//        String rst = (n%2 == 0)? "even" : "odd";
//        System.out.println("your number is: " + rst);
        // chỉ có if
        if (false) {
            System.out.println("thuc hien if");
        }
        // if ... else
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        // bậc thang
        float dtb = 7.0f;
        if (dtb < 5.0) {
            System.out.println("yếu");
        } else if (dtb < 6.5) {
            System.out.println("trung bình");
        } else if (dtb < 8) {
            System.out.println("khá");
        } else {
            System.out.println("giỏi");
        }
        int years = 2100;
        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    System.out.println("nhuận");

                } else {
                    System.out.println("không nhuân");
                }
            } else {

                System.out.println("năm nhuận");
            }
        } else {
            System.out.println("ko nhuận");
        }
        // hiển thị số dư khi chia cho 5
        int num = 1996;
        int mod = num % 5;
        switch (mod) {
            case 0:
                System.out.println("dư 0");
            case 1:
                System.out.println("dư 1");
            case 2:
                System.out.println("dư 2");
            case 3:
                System.out.println("dư 3");
            case 4:
                System.out.println("dư 4");
        }
    }

}
