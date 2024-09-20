import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    // br readline
    // int[][] boards
    // int[][] visited
    // int result;

    // for n readline
    // for n [i][j]

    // for n
    // for n
    // if(!visited && [i][j] > n)
    //  result + 1
    //  bfs()

    // result

    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private static void bfs(int[][] boards, Point point, boolean[][] visited, int n) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);
        while(!queue.isEmpty()) {
            Point now = queue.poll();
            int nowX = now.getX();
            int nowY = now.getY();
            if(nowX > 0 && !visited[nowY][nowX-1] && boards[nowY][nowX-1] > n) {
                visited[nowY][nowX-1] = true;
                queue.add(new Point(nowX-1, nowY));
            }
            if(nowX < boards.length-1 && !visited[nowY][nowX+1] && boards[nowY][nowX+1] > n) {
                visited[nowY][nowX+1] = true;
                queue.add(new Point(nowX+1, nowY));
            }
            if(nowY > 0 && !visited[nowY-1][nowX] && boards[nowY-1][nowX] > n) {
                visited[nowY-1][nowX] = true;
                queue.add(new Point(nowX, nowY-1));
            }
            if(nowY < boards.length-1 && !visited[nowY+1][nowX] && boards[nowY+1][nowX] > n) {
                visited[nowY+1][nowX] = true;
                queue.add(new Point(nowX, nowY+1));
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] boards = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        int result = 0;
        for(int i=0; i<N; i++) {
            String[] line = br.readLine().split(" ");
            for(int j=0; j<N; j++) {
                int value = Integer.parseInt(line[j]);
                boards[i][j] = value;
            }
        }
        for(int k=0; k<=100; k++) {
            int temp = 0;
            // 방문정보 초기화
            for (boolean[] row : visited) {
                Arrays.fill(row, false);
            }
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    if(!visited[i][j]) {
                        visited[i][j] = true;
                        if(boards[i][j] > k) {
                            temp = temp + 1;
                            bfs(boards, new Point(j, i), visited, k);
                        }
                    }
                }
            }
            if(temp > result) {
                result = temp;
            }
        }
        System.out.println(result);
    }


}
