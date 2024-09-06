import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        int targetValue = 0;
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        while(count < 3) {
            targetValue = targetValue + 1;
            count = 0;
            for(String numStr : nums) {
                int num = Integer.parseInt(numStr);
                if(targetValue % num == 0) {
                    count = count + 1;
                }
            }
        }
        System.out.println(targetValue);
    }
}
