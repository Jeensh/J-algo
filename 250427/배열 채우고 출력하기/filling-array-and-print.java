import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < 10; i++){
            stack.push(sc.next());
        }

        for(int i = 0; i < 10; i++) {
            System.out.printf(stack.pop());
        }
    }
}