import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static long[] fibArr;

    private static long fib(int n) {
        if(n < 0) {
            return 0;
        }
        if(fibArr[n] != 0) {
            return fibArr[n];
        }
        fibArr[n] = fib(n-1) + fib(n-2);
        return fibArr[n];
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n < 2) {
            System.out.println(n);
            return;
        }

        fibArr = new long[n+1];
        fibArr[0] = 0;
        fibArr[1] = 1;

        long result = fib(n);

        System.out.println(result);
        // 전역 변수 피보나치 배열 n[90]
        // br
        // n (입력 받은 수)
        // n이 0인 경우 1인 경우 처리
        // n[0] = 0
        // n[1] = 1
        // fib(n)
        //   피보나치배열[n] != 0
        //      return 피보나치배열[n]
        //   fib[n] = fib[n-1] + fib[n-2]
        //   return fib[n]

    }


}