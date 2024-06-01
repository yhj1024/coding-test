import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        // 운동 분, 초기 맥박, 최대 맥박, 운동 시 증가하는 맥박, 휴식 시 감소하는 맥박

        // int 현재맥박 = 초기맥박
        // int result

        //   if(초기맥박 + 운동 시 증가하는 맥박 > 최대 맥박) {
        //      -1 출력
        //      return
        //   }
        
        // while (운동 분 === 0)
        //   운동 가능 상태 일 때
        //   if(현재맥박 + 운동 시 증가하는 맥박 > 최대맥박) {
        //      result++;
        //      현재맥박 = 현재 맥박 - 휴식 시 감소하는 맥박
        //      휴식 시 맥박이 초기 맥박보다 낮아질 수 없음 고려
        //   운동 불가능 한 상태인 경우 휴식 처리
        //   } else {
        //      result++;
        //      현재 맥박 = 현재 맥박 + 운동 시 증가하는 맥박
        //      운동 분 감소
        //   }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int m = Integer.parseInt(lines[1]);
        int M = Integer.parseInt(lines[2]);
        int T = Integer.parseInt(lines[3]);
        int R = Integer.parseInt(lines[4]);

        int now = m;
        int result = 0;

        if(m + T > M) {
            System.out.println("-1");
            return;
        }

        while (N != 0) {
            if(now + T > M) {
                result+=1;
                now = Math.max(now - R, m);
            } else {
                result+=1;
                now = now + T;
                N-=1;
            }

        }

        System.out.println(result);



    }


}
