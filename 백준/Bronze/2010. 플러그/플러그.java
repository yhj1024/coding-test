import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int counts = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<counts; i++) {
            int tab = Integer.parseInt(br.readLine());
            if(i != counts-1) {
                sum = sum + tab - 1;
            } else {
                sum = sum + tab;
            }
        }
        System.out.println(sum);
    }


}
