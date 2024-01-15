import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fib = new int[N-1];
        fib[0] = 1;
        fib[1] = 2;
        int repeatCnt = 1;
        for(int i=2; i<N-1; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            repeatCnt++;
        }
        System.out.printf("%d %d", fib[N-2], repeatCnt);
        // N을 입력 받음
        // fib[]피보나치 값이 담길 배열 N선언
        // repeatCnt (반복 횟수 할당할 변수)
        // fib[0] = 1, fib[1] = 2 (n은 5이상임 2미만 고려 안 해도됨)
        // for i=2 < n;
        // fib[i] = fib[i-1] + fib[i-2] 반복
        // repeatCnt++
        // fib[n] repeatCnt 출력
    }
}