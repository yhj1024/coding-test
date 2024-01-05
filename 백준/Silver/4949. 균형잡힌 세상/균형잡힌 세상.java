import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String result;
        String lines;
        while (true) {
            lines = bf.readLine();
            if(lines.length() == 1 && lines.charAt(0) == '.') {
                break;
            }
            stack.clear();
            result = "yes";
            for(char c : lines.toCharArray()) {
                if(c == '(') {
                    stack.add(c);
                } else if(c == ')') {
                    if(stack.empty() || '(' != stack.pop())
                        result = "no";
                } else if(c == '[') {
                    stack.add(c);
                } else if(c == ']') {
                    if(stack.empty() || '[' != stack.pop())
                        result = "no";
                }
            }
            if(!stack.empty())
                result = "no";

            System.out.println(result);
        }
    }
}