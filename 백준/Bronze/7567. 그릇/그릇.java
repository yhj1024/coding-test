import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char now = ' ';
        char[] ds = br.readLine().toCharArray();
        int result = 10;
        now = ds[0];
        for(int i=1; i<ds.length; i++) {
            if(now == ds[i]) {
                result += 5;
            } else {
                result += 10;
            }
            now = ds[i];
        }
        System.out.println(result);

    }

}
