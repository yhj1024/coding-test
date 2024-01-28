import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int[] cnt = new int[S1*S2*S3];
        for(int i=S1; i>0; i--) {
            for(int j=S2; j>0; j--) {
                for(int k=S3; k>0; k--) {
                    cnt[i+j+k-1] += 1;
                }
            }
        }

        int max = 0;
        for(int i=0; i<cnt.length; i++)
            if(max<cnt[i])
                max = cnt[i];

        for(int i=0; i<cnt.length; i++)
            if(max == cnt[i]) {
                System.out.println(i+1);
                break;
            }

        // S1, S2, S3 입력 받음
        // max
        // FOR S1 ARR
        // FOR S2 ARR
        // FOR S3 ARR
        // for s1
        //   for s2
        //      for s3
        //          cnt 누적
        // cnt max 찾기
        // 출력


    }


}
