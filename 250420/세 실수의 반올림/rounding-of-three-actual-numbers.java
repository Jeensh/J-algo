import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        System.out.printf("%.3f\n", Math.round(a * 1000) / 1000.0);
        System.out.printf("%.3f\n", Math.round(b * 1000) / 1000.0);
        System.out.printf("%.3f\n", Math.round(c * 1000) / 1000.0);
    }
}