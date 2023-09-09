package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khái niêm chuỗi : là 1 tập các kí tự được bọc trong dấu ""
//        String str1 = "Rello world";
//        str1+="hh";
//        String str2 = "Rikkei Academy";
//        String str5 = "Rikkei Academy";
//        Character str3 = 'c'; // kí tự
        // lấy ra độ đài của chuỗi
//        System.out.println("Dộ dài chuỗi str2 là "+ str2.length());
        // Nối chuỗi
//        String str4 = str1.concat(str2);
//        System.out.println(str4);
        // hiển thị kí tự tại vị trí index (bản chất string là 1 mảng các kí tự)
//        System.out.println(str1.charAt(2));

        //xóa khoảng trắng 2 đầu của chuỗi
//        System.out.println(str1.trim());
        // cắt chuỗi con
//        System.out.println(str2.substring(0,6));
        // so sánh chuỗi  "=="
//        boolean check =  str2.equals(str5);
//        System.out.println(check);
        // so sánh tưong đối
//        System.out.println(str2.contains("demy"));
        // chuyển đổi chuỗi thành mảng
//        String[] arrString = str2.split("\\s");
//        System.out.println(Arrays.toString(arrString));
        // tìm kiếm theo vị trí của chuỗi con
//        System.out.println(str2.indexOf("Academygddfbd"));
        // trả về hiệu của 2 chuỗi
//        System.out.println(str1.compareTo(str2));

        // ép kiểu , chuyênnr đổi chuỗi thành 1 số
        int number = Integer.parseInt("12");
        System.out.println(number);
        // viết trực tiếp
        "\t \n helo".trim();


        // Làm viẹc với String Builder
       String string = new String("hung");  // Heap  tạo vùng nhớ lưu trữ "hùng"  trả về tham chiếu gán cho biến string
//        String string = "hung";
//        String string1 = "hung"; // jvm sẽ kiểm tra xem giá trị "hung" đã tồn tại trong pool , nếu đã tồn tại thì nó chỉ trả về instance (tham chiếu)
        String string1 = new String("hung");
        System.out.println(string1);
        //Tạo đối tượng thông qua  từ kháo new
        StringBuilder str1 = new StringBuilder("hung");
        StringBuilder str2 = new StringBuilder("hung");


        // thay đổi độ dài chuỗi
        str1.setLength(100);
//        StringBuilder str2 = new StringBuilder();
        // các phương thức làm việc với chuỗi StringBuilder
        //  chèn - append
        str1.append(" hx");
        System.out.println(str1);
        // chèn theo vij trí
        // str1.insert(3,"char");
        str1.insert(3,"char",1,2);
        System.out.println(str1);
        //Xóa chuỗi theo vị trí từ vị trí bắt đầu đến kết thúc
        str1.delete(6,8);
        System.out.println(str1);
        // xóa theo index chỉ định
        str1.deleteCharAt(4);
//        1836019240   // 1836019240//1836019240
        str1.deleteCharAt(3);
        System.out.println(str1);
        // đảo ngược chuỗi
        str1.reverse();
        System.out.println(str1);
        // tìm kiếm và thay thế theo vị trí
        str1.replace(0,3,"Rikkei");
        System.out.println(str1);
        // kiểm tra chuỗi rỗng
        String empty ="";
        Scanner sc = new Scanner(System.in);
        System.out.println(empty.isEmpty());
        String h1 = "HUng";
        String h2 = "HUng";
        System.out.println(str2.hashCode());
        System.out.println(str1.hashCode());
        int[] arr = {1,2,3,4,5,6,7,8};



    }
}
