import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int factorial(int num) {
        if(num < 2) {
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));

    }

}