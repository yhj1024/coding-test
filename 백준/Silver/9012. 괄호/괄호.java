import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        // () 쌍이 되어야 하며
        // ( <-- 이게 먼저 오고 그 다음에 ) <-- 이게 나와야 한다
        // 즉 ( 를 stack에 넣고 ) 나올때마다 비워줬을때 마지막에 stack 이 비어있지 않으면 잘못된 case
        // 중간에 ) 나왔는데 비울게 없는 경우에도 잘못 들어간 case
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<T; i++) {
            stack.clear();
            String str = bf.readLine();
            String result = "YES";
            for(int j=0; j<str.length(); j++) {
                Character c = str.charAt(j);
                if(c == '(') {
                    stack.add(c);
                } else {
                    if(stack.empty()) {
                        result = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(!stack.empty()) {
                result = "NO";
            }
            System.out.println(result);
        }

    }
}
