import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();

        System.out.printf("%.2f", Math.round(n * 100) / 100D);
    }
}