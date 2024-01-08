import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        if(N == 0)
            N = 1L;
        System.out.println(factorial(N));
    }

    private static Long factorial(Long n) {
        if(n < 2) {
            return n;
        }
        return n * factorial(n-1);
    }
}