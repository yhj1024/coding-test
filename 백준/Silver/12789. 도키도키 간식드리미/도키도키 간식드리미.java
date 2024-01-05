import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int now = 1;
        String result = "Nice";
        br.readLine();
        String[] lines = br.readLine().split(" ");
        for(String line : lines) {
            int val = Integer.parseInt(line);
            if(now == val) {
                now++;
            } else {
                // 스택이 있고 스택의 마지막 값이 현재와 동일한 경우
                while(!stack.empty() && stack.peek() == now) {
                    now++;
                    stack.pop();
                }
                stack.add(val);
            }
        }
        while(!stack.empty()) {
            if(now == stack.pop()) {
                now++;
            } else {
                result = "Sad";
                break;
            }
        }
        System.out.println(result);
    }
}