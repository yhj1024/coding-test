import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] lines;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);
            lines = new char[(int) Math.pow(3, n)];
            Arrays.fill(lines, '-');
            cantor(0, lines.length-1);
            System.out.println(lines);
        }
        // 탈출 조건은 길이가 시작점이 끝점보다 크거나 같은 경우
        // 시작과 끝을 입력 받는다
        // 가운데를 구해서 공백으로 변경
        // 1. 좌측처리 (재귀)
        // 2. 우측처리 (재귀)

    }

    private static void cantor(int s, int e) {

        if(s>=e)
            return;

        int step = (e+1-s) / 3;
        for(int i=s + step; i<s + step + step; i++) {
            lines[i] = ' ';
        }
        cantor(s, s+step-1);
        cantor(e-step+1, e);

    }

}
//--------- 0,8
//---   --- 0,2 | 6,8
//- -   - - 