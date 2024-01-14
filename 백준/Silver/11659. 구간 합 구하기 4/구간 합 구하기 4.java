import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] prefix = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            if(i == 0) {
                prefix[i] = Integer.parseInt(st2.nextToken());
            } else {
                prefix[i] = Integer.parseInt(st2.nextToken()) + prefix[i-1];
            }
        }

        for(int k=0; k<M; k++) {
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st3.nextToken());
            int j = Integer.parseInt(st3.nextToken());
            if(i==1) {
                sb.append(prefix[j-1]);
            } else {
                sb.append(prefix[j-1]-prefix[i-2]);
            }
            sb.append("\n");
        }

        System.out.println(sb);

        // br
        // sb

        // N (수의 개수)
        // M (합을 구할 개수)
        // int[] 합 배열
        // st
        // for 수의개수
        // 합배열 값 업데이트

        // for M
        // st
        // i, j
        // i가 1이면
        // 합배열[j-1]
        // 1보다 크면 합배열[j-1] - 합배열[i]
        // sb append

        // sb 출력

    }
}