package ra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        // Biểu thức chính qui là 1 khuôn mẫu,hay là 1 định dạng để xác thưc 1 chuỗi
        // Các lớp làm việc với xác thưc thông ua Regex
        Pattern pattern = Pattern.compile("[0-9]{3,7}");
        Matcher matcher = pattern.matcher("00");
        System.out.println(matcher.matches());

        // bài tập : tạo 1 phương thức kiểm tra chuỗi người dùng nhập vào
        // có phải là số điện thoại hợp lệ không (10, 11 số và phải bắt đầu bằng số 0)

        System.out.println(validatePhoneFast("0368878189"));
        System.out.println(validateEmail("hung.hx@gmail.com.vn"));
    }
    public static boolean validatePhone(String phone){
        // code logic
//        Pattern pattern = Pattern.compile("^0[0-9]{9,10}$");
//        Matcher matcher = pattern.matcher(phone);
        return Pattern.matches("^0[0-9]{9,10}$",phone);
    }
    public static boolean validatePhoneFast(String phone){
        // code logic
        return phone.matches("^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$");
    }
    public static boolean validateEmail(String email){
        // code logic
        return email.matches("^[^\\.\\s@:](?:[^\\s@:]*[^\\s@:\\.])?@[^\\.\\s@]+(?:\\.[^\\.\\s@]+)*$");
    }
}
