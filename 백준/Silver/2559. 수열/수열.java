import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int result = Integer.MIN_VALUE;
        int[] temperatures = new int[N+1];
        temperatures[0] = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<N+1; i++) {
            temperatures[i] = temperatures[i-1] + Integer.parseInt(st2.nextToken());
        }
        for(int i=K; i<N+1; i++) {
            int sum = temperatures[i] - temperatures[i-K];
            if(result < sum)
                result = sum;
        }
        System.out.println(result);
        // br
        // st
        // N(전체 일수), K(연속 일수)
        // int[N+1] (구간 합 계산될 배열)
        // int[0] = 0 // 밑에서 계산하기 편하도록 0
        // st 온도 입력받음
        // for N
        //  구간 합 값 할당
        // for i=K부터 N까지 ++
        //  합배열[i] - 합배열[i-K] => 이중 MAX값
        //


    }
}