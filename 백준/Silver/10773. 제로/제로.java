import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<K; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int result = stack.stream()
                            .mapToInt(i -> i)
                            .sum();

        System.out.println(result);

    }
}