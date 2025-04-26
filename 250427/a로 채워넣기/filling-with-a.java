import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] chars = str.toCharArray();

        chars[1] = 'a';
        chars[chars.length - 2] = 'a';

        System.out.println(chars);
    }
}