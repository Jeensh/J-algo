import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sex = sc.nextInt();
        int age = sc.nextInt();

        if(sex == 0){
            if(age > 18){
                System.out.println("MAN");
            }
            else {
                System.out.println("BOY");
            }
        }
        else {
            if(age > 18){
                System.out.println("WOMAN");
            }
            else {
                System.out.println("GIRL");
            }
        }

    }
}