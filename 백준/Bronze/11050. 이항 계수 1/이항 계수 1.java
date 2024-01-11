import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer N = Integer.parseInt(st.nextToken());
        Integer K = Integer.parseInt(st.nextToken());
        int[] factorials = new int[N+2];
        factorials[0] = 1;
        factorials[1] = 1;
        for(int i=2; i<N+1; i++) {
            factorials[i] = i * factorials[i-1];
        }
        // K 가 0 일때
        // K == N 일때
        //
        System.out.println(factorials[N] / (factorials[K] * factorials[N-K]));
    }
}