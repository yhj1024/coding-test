import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N == 1) {
            System.out.println("1 0");
            return;
        }
        int countB = 0; // -1로 초기화 하는 이유는 1이 S로 바뀌기때문
        boolean[] eratos = new boolean[N];
        Arrays.fill(eratos, true);
        eratos[0] = false;
        for(int i=1; i<N; i++) {
            if(eratos[i]) {
                for(int j=i*2+1; j<N; j=j+i+1) {
                    eratos[j] = false;
                }
            }
        }

        for(int i=1; i<N; i++) {
            if(!eratos[i]) {
                countB++;
                if(i+1 < N && eratos[i+1]) {
                    countB--;
                }
            }
        }

        System.out.printf("%d %d", countB, N-countB);

        // 1  B
        // 2  SS
        // 3  SSS
        // 4  SSSB
        // 5  SSSSS
        // 6  SSSSSB
        // 7  SSSSSSS
        // 8  SSSSSSSB
        // 9  SSSSSSSBB
        // 10 SSSSSSSBBB
        // 11 SBBSSSSSSSS
        // 다음 값이 소수인 경우 S가 B로 바뀜
        // 현재 값이 소수가 아니면서 다음 값이 소수가 아닌 경우 B 개수가 늘어남
        // 에라토스테네스의 체로 먼저 소수를 만들어놓고
        // 1인 경우는 일단 예외 케이스로 처리 (1 0) 출력
        // 입력 수 반복문 돌면서
        // 현재 값이 소수가 아니면서 다음 값이 소수인 경우 count++
        // 출력은 COUNT 입력값-COUNT

        // N br
        // int result = 0;
        // if N==1 출력 및 리턴

        // boolean[N] (에라토스테네스의 체)
        // [1] 은 소수
        // for N
        //   if(에라토스테네스[i])
        //      for(j=i; j<N; j=j+i+1)
        //          에라토스테네스의 체[j] = false

        // for N
        //  if(현재값이 소수가 아니면서 다음값도 소수가 아닌경우)
        //      countB++

        // countB N-countB 출력
    }
        

}
