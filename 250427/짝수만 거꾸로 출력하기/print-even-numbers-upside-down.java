import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int v = sc.nextInt();
            if(v % 2 == 0) stack.push(v);
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}