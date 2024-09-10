import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public static int bfs(char[][] map, int N, int M) {

        Queue<Point> queue = new LinkedList<>();
        Point startPoint = new Point(0,0);
        boolean[][] visited = new boolean[N][M];
        int[][] distance = new int[N][M];

        queue.add(startPoint);
        visited[0][0] = true;
        distance[0][0] = 1;

        while(!queue.isEmpty()) {
            Point current = queue.poll();
            int x = current.getX();
            int y = current.getY();
            if(x == M-1 && y == N-1) {
                return distance[N-1][M-1];
            }
            // 상으로 이동
            if(y-1 > -1) {
                if(!visited[y-1][x] && map[y-1][x] !=  '0') {
                    Point point = new Point(x,y-1);
                    queue.add(point);
                    visited[y-1][x] = true;
                    distance[y-1][x] = distance[y][x] + 1;
                }
            } //
            // 하로 이동
            if(y+1 < N) {
                if(!visited[y+1][x] && map[y+1][x] != '0') {
                    Point point = new Point(x,y+1);
                    queue.add(point);
                    visited[y+1][x] = true;
                    distance[y+1][x] = distance[y][x] + 1;
                }
            }
            // 좌로 이동
            if(x-1> -1) {
                if(!visited[y][x-1] && map[y][x-1] != '0') {
                    Point point = new Point(x-1,y);
                    queue.add(point);
                    visited[y][x-1] = true;
                    distance[y][x-1] = distance[y][x] + 1;
                }
            }
            // 우로 이동
            if(x+1 < M) {
                if(!visited[y][x+1] && map[y][x+1] != '0') {
                    Point point = new Point(x+1,y);
                    queue.add(point);
                    visited[y][x+1] = true;
                    distance[y][x+1] = distance[y][x] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");

        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);

        char[][] map = new char[N][M];

        for(int i=0; i<N; i++) {
            String line = br.readLine();
            for(int j=0; j<M; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        int result = bfs(map, N, M);
        System.out.println(result);

    }

}
