import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        long result = 0;

        for(int i = 0; i < st[0].length(); i++) {
            for(int j = 0; j < st[1].length(); j++) {
                int num1 = st[0].charAt(i) - '0';
                int num2 = st[1].charAt(j) - '0';
                result += (long) num1 * num2;
            }
        }

        System.out.println(result);
    }
}
