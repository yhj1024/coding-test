import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int gcd = getGcd(n, m);
        int lcm = getLcm(n, m, gcd);
        System.out.printf("%d\n%d", gcd, lcm);
    }

    // 최대공약수
    private static int getGcd(int a, int b) {
        if(b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        int result;
        while(true) {
            result = a % b;
            if(result == 0)
                break;
            a = b;
            b = result;
        }
        return b;
    }

    // 최소공배수
    private static int getLcm(int a, int b, int gcd) {
        return a*b/gcd;
    }


}