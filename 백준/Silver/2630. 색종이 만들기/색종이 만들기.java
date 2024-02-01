import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] paper;
    static int blue = 0;
    static int white = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, N-1, 0, N-1);
        System.out.printf("%d\n%d", white, blue);
        // br
        // int N (색종이 개수)
        // int[N][N] paper (색종이 배열)
        // int blue = 0;
        // int white = 0;
        // for N 색종이 배열 초기화
        //   st
        //   for N
        //     st.next

        // divide(0, N-1, 0, N-1);
    }

    private static void divide(int x1, int x2, int y1, int y2) {
        // 현재 점이 전부 같은 색인 경우
        int start = paper[x1][y1];
        for(int i=x1; i<=x2; i++) {
            for(int j=y1; j<=y2; j++) {
                if(paper[i][j] != start) {
                    divide(x1, (x1+x2)/2, y1, (y1+y2)/2);
                    divide((x1+x2)/2+1, x2, y1, (y1+y2)/2);
                    divide(x1, (x1+x2)/2, (y1+y2)/2+1, y2);
                    divide((x1+x2)/2+1, x2, (y1+y2)/2+1, y2);
                    return;
                }
            }
        }
        if(paper[x1][y1] == 0)
            white++;
        else
            blue++;
//        boolean isAllSame = true;
//        for(int i=x1; i<=x2; i++) {
//            isAllSame = true;
//            for(int j=y1; j<=y2; j++) {
//                if(paper[i][j] != start) {
//                    isAllSame = false;
//                    break;
//                }
//            }
//            if(!isAllSame) {
//                break;
//            } else {
//                if(paper[x1][y1] == 0)
//                    white++;
//                else
//                    blue++;
//                return;
//            }
//        }
    }

    // divide 함수;
    //      현재 넘어온 좌표의 값이 모두 0 또는 1인 경우
    //      countBlue 체크 후 return 처리함
    //      divide(0, x2/2, 0, y2/2);
    //      divide(x2/2+1, x2, 0, y2/2);
    //      divide(0, half, 0 + half, half);
    //      divide(0 + half, N-1, 0 + half, N-1);
    
}