package ra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // khái niêm chuỗi : là 1 tập các kí tự được bọc trong dấu ""
        String str1 = "Rello world";
        String str2 = "Rikkei Academy";
        String str5 = "Rikkei Academy";
        Character str3 = 'c'; // kí tự
        // lấy ra độ đài của chuỗi
        System.out.println("Dộ dài chuỗi str2 là "+ str2.length());
        // Nối chuỗi
        String str4 = str1.concat(str2);
        System.out.println(str4);
        // hiển thị kí tự tại vị trí index (bản chất string là 1 mảng các kí tự)
        System.out.println(str1.charAt(2));

        //xóa khoảng trắng 2 đầu của chuỗi
        System.out.println(str1.trim());
        // cắt chuỗi con
        System.out.println(str2.substring(0,6));
        // so sánh chuỗi  "=="
        boolean check =  str2.equals(str5);
        System.out.println(check);
        // so sánh tưong đối
        System.out.println(str2.contains("demy"));
        // chuyển đổi chuỗi thành mảng
        String[] arrString = str2.split("\\s");
        System.out.println(Arrays.toString(arrString));
        // tìm kiếm theo vị trí của chuỗi con
        System.out.println(str2.indexOf("Academygddfbd"));
        // trả về hiệu của 2 chuỗi
        System.out.println(str1.compareTo(str2));

        // ép kiểu , chuyênnr đổi chuỗi thành 1 số
        int number = Integer.parseInt("12");
        System.out.println(number);
        // viết trực tiếp
        "\t \n helo".trim();
    }

}
