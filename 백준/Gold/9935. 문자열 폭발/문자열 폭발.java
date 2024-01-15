import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        String bom = br.readLine();
        int bomLen = bom.length();
        Stack<Character> stack = new Stack<>();
        boolean hasBom;
        for(char c : str.toCharArray()) {
            hasBom = true;
            stack.add(c);
            int stackLen = stack.size();
            if(stackLen >= bomLen) {
                for(int i=0; i<bomLen; i++) {
                    if(stack.get(stackLen - bomLen + i) != bom.charAt(i)) {
                        hasBom = false;
                        break;
                    }
                }
                if(hasBom) {
                    for(int i=0; i<bomLen; i++)
                        stack.pop();
                }
            }
        }
        for(char c : stack) {
            sb.append(c);
        }
        System.out.println(sb.length() == 0 ? "FRULA" : sb);
        // br
        // sb
        // str (문자열)
        // bom (폭발문자열)
        // bomLen (폭발문자열길이)
        // stack (문자열 쌓을 스택)
        // for str c
        // isSame = true
        // 스택에 c add
        // stack size >= bomLen (폭발문자열길이)
        //    for 폭발문자열의길이
        //      stack[스택사이즈-폭발문자열의길이+i] 폭발문자열[i]
        //      한 글자씩 비교
        //      다른경우 isSame = false
        //      break
        //    if(isSame)
        //      for 폭팔문자열길이
        //          stack.pop()


    }
}