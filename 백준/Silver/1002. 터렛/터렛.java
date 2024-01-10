import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static double distance(int x1, int x2, int y1, int y2) {
        int d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        return Math.pow(d, 1.0/2.0);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        long T = Long.parseLong(br.readLine());
        for(long i=0L; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            double d = distance(x1, x2, y1, y2);
            // 두 반지름의 합
            int sum = r1+r2;
            // 두 반지름의 차
            int diff = Math.abs(r1-r2);
            if(sum < d) {
                // 멀어서 안 만나는 경우
                sb.append(0);
            } else if(sum == d) {
                // 외접
                sb.append(1);
            } else if(diff < d && d < sum) {
                // 두 곳 겹침
                sb.append(2);
            } else if(diff == d && d != 0) {
                // 내접
                sb.append(1);
            } else if(diff > d) {
                // 안에서 만나서 안됨
                sb.append(0);
            } else if(diff == 0 && d == 0) {
                // 아예 겹치는 경우
                sb.append(-1);
            }
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length()-1);
        br.close();
        System.out.println(sb);
        // 입력 br
        // 출력 sb
        // T 테스트 개수 입력 받음
        // for 테스트 개수
        //    st next x1 y1 r1, x2 y2 r2
        //    d = 두점 사이의 거리 함수(x1 y1 x2 y2)
        // if 외접/내접 case 태움 sb.append
        // else if sb.append
        // .....
        // 반복 종료 후 sb 출력
        // r1 첫번재 원의 반지름
        // r2 두번째 원의 반지름
        // 두 점 사이의 거리 d : 루트 (x1-x2)^2 + (y1-y2)^2

        // 두 원이 서로 밖에 있어서 안 만나는 경우
        // r1+r2 < d
        // 두 원이 외접하는 경우
        // r1+r2 = d
        // 두 원이 겹쳐서 2개가 만나는 경우
        // r1-r2 < d < r1+r2
        // 내접 하는 경우
        // r1-r2 = d
        // 다른 원이 내부에 있어 안 만나는 경우
        // r1-r2 > d
        // 두 원이 아예 겹치는 경우 (-1 출력)
        // r1 == r2 && d == 0

    }



}

