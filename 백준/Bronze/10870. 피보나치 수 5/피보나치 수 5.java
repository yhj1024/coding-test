import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int prev = 0;
    static int now = 1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        int result = fibonacci(n);
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        if(n==-1) return 0;
        if(n<1) return now;
        int tmp = prev;
        prev = now;
        now = tmp + now;
        return fibonacci(n-1);
    }
}

