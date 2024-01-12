import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Integer N = Integer.parseInt(st.nextToken());
            Integer M = Integer.parseInt(st.nextToken());
            if(M.equals(N)) {
                sb.append(1).append("\n");
                continue;
            };
            int[] MS = new int[M-N];
            for (int j=M; j>N; j--)
                MS[M-j]  = j;
            int[] DS = new int[M-N-1]; // 1은 빼고 넣기 위해서
            for (int j=M-N; j>1; j--)
                DS[M-N-j] = j;

            for (int j=0; j<MS.length; j++) {
                for (int k=0; k<DS.length; k++) {
                    // 두 개의 값이 같으면 둘다 1로
                    if(MS[j] == DS[k]) {
                        MS[j] = 1;
                        DS[k] = 1;
                        continue;
                    // MS가 DS의 배수인 경우 DS로 나눔    
                    } else if(MS[j]%DS[k]==0) {
                        MS[j] = MS[j]/DS[k];
                        DS[k] = 1;
                        continue;
                    // 둘다 2의 배수이면 2의 배수로 나눔
                    } else if(MS[j]%2 == 0 && DS[k]%2 == 0) {
                        MS[j] = MS[j]/2;
                        DS[k] = DS[k]/2;
                    // 둘다 3의 배수이면 3의 배수로 나눔
                    } else if(MS[j]%3 == 0 && DS[k]%3 == 0) {
                        MS[j] = MS[j]/3;
                        DS[k] = DS[k]/3;
                    } else if(MS[j]%5 == 0 && DS[k]%5 == 0) {
                        MS[j] = MS[j]/5;
                        DS[k] = DS[k]/5;
                    }
                }
            }

            int msMutilply = 1;
            int dsMultiply = 1;

            for(int m : MS) {
                msMutilply *= m;
            }

            for(int d : DS) {
                dsMultiply *= d;
            }

            sb.append(msMutilply/dsMultiply).append("\n");
        }

        System.out.println(sb);
        // br
        // sb
        // result
        // T 케이스 입력받음
        // for T
        //  result = 0
        //  편의상 문제 변수명에 맞춰 nCr => mCn 표기
        //  mCn = m! / n!(m-n)! 5,3 예
        //  m팩토리얼의 값을 배열에 할당 (5,4,3,2,1)
        //  n팩토리얼의 값을 배열에 할당 (3,2,1)
        //  m팩토리얼에서 n팩토리에 있는 값 제외시킴 (어차피 나눌거니까)
        //  => 이 과정이 근데 배열에 할당할 때
        //  m을 5(최대값)부터 n+1까지만 반복해서 넣으면 될듯

        //  이제 m-n 팩토리얼의 값을 배열에 할당 (2,1)
        //  이중 반복문으로 나눠지는지 확인 후 나눠지는 경우
        //  m[i]%m-n[j]이면 m[i]=m[i]/m-n[j]
        //  자기 자신의 값도 1로 ㅂ녀경
        //      continue
        //  m팩토리열 배열 반복
        //  result *= 1
        //  sp.append(result)


    }
}