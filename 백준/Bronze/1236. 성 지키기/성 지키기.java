import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);
        int rows = 0;
        int cols = 0;
        boolean findX;
        char[][] map = new char[N][M];
        for(int i=0; i<N; i++) {
            String boardLine = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = boardLine.charAt(j);
            }
        }
        for(int i=0; i<N; i++) {
            findX = false;
            for(int j=0; j<M; j++) {
                if(map[i][j] == 'X') {
                    findX = true;
                    break;
                }
            }
            if(!findX) {
                rows = rows + 1;
            }
        }
        for(int i=0; i<M; i++) {
            findX = false;
            for(int j=0; j<N; j++) {
                if(map[j][i] == 'X') {
                    findX = true;
                    break;
                }
            }
            if(!findX) {
                cols = cols + 1;
            }
        }
        System.out.println(Math.max(rows, cols));
    }


}
