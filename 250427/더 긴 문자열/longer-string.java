import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if(a.length() == b.length()) {
            System.out.println("same");
        }
        else {
            String v = a.length() > b.length() ? a : b;
            System.out.println(v + " " + v.length());
        }
    }

}