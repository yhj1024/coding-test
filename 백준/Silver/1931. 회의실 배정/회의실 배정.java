import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] rooms = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            rooms[i][0] = Integer.parseInt(st.nextToken());
            rooms[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(rooms, (int[] a, int[] b) -> {
            if(a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        int result = 0;
        int nowTime = -1;
        for(int[] room : rooms) {
            if(room[0] >= nowTime) {
                result++;
                nowTime = room[1];
            }
        }
        System.out.println(result);
        // N (회의 최대 개수)
        // rooms int[N][2] (회의실 배열)
        // for N
        //  값 할당
        // Arrays.sort((int[] a, int[]b -> ))
        //   종료 시간을 기준으로 오름차순 정렬
        //   종료 시간이 같은 경우 시작 시간을 기준으로 오름차순 정렬
        // result (사용된 회의실 개수)
        // nowTime (현재시간, -1로 초기화)
        // for rooms
        //   시작 시간이 현재 시간 보다 크거나 같은 경우
        //   종료 시간을 현재 시간으로 갱신
        //   result++

    }
}