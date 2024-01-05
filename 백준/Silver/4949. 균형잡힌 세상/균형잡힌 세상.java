import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        String lines;
        boolean isNotValid;
        while (true) {
            lines = bf.readLine();
            if(lines.length() == 1 && lines.charAt(0) == '.') {
                break;
            }
            isNotValid = false;
            stack.clear();
            for(char c : lines.toCharArray()) {
                if(c == '(') {
                    stack.add(c);
                } else if(c == ')') {
                    if(stack.empty() || '(' != stack.pop()) {
                        isNotValid = true;
                        break;
                    }
                } else if(c == '[') {
                    stack.add(c);
                } else if(c == ']') {
                    if(stack.empty() || '[' != stack.pop()) {
                        isNotValid = true;
                        break;
                    }
                }
            }
            if(!stack.empty() || isNotValid) {
                sb.append("no\n");
            } else {
                sb.append("yes\n");
            }
        }
        System.out.println(sb);
    }
}