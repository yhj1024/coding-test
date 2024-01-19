import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] lines = new int[N];
        int time = 0;
        int result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            lines[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(lines);
        for(int line : lines) {
            time = time + line;
            result += time;
        }
        System.out.println(result);
        // br
        // N (사람 수)
        // int[N] lines (걸리는 시간)
        // int temp = 0;
        // st
        // for n
        //  lines 초기화
        // line 오름차순 정렬
        // for lines
        // temp = temp + line;
        // temp 출력
    }
}
//1 2 3 4
//2 3 4
//3 4
//4=