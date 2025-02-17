package init_Java.Lab07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab07 {
    public static void main(String[] args) {
        System.out.println("Nhap mat khau it nhat 6 ki tu: ");
        //Pattern pattern = Pattern.compile("^[0-9A-Za-z.-_+?]{1,}+@+[a-z]{2,6}+\\.[a-z]{2,6}$");
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-?]{1,}@[A-Za-z0-9.-]{3,6}\\.[A-Za-z]{2,6}$");
        Matcher matcher = pattern.matcher("123456a?@gmail.com");
        System.out.println(matcher.matches());

        SinhVienIT sv1 = new SinhVienIT(1, "Khoa", 12, 10, "java");
        SinhVienCoKhi sv2 = new SinhVienCoKhi(2, "Dang", 12, 10, "plc");
        System.out.println("ID: "+ sv1.id + " " + "Name: " + sv1.name);
        System.out.println("ID: "+ sv2.id + " " + "Name: " + sv2.name);
        
    }
}
