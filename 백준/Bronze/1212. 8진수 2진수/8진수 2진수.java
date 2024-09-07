import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static String[] OCTALS = {"000", "001", "010", "011", "100", "101", "110", "111"};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String octal = br.readLine();
        if(octal.equals("0")) {
            System.out.println("0");
            return;
        }
        for(int i=0; i<octal.length(); i++) {
            int o = octal.charAt(i) - '0';
            String s = OCTALS[o];
            if (i == 0) {
                // 첫 번째 숫자의 경우, 앞의 0을 제거
                s = s.substring(s.indexOf('1'));
            }
            sb.append(s);
        }
        System.out.println(sb);
    }


}
