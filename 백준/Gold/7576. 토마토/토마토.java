import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static class Point {
        private int x;
        private int y;
        private int day;
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
        public int getDay() {
            return day;
        }
        public Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int result = 0;
        int M = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int[][] boards = new int[N][M];
        Queue<Point> queue = new LinkedList<>();
        for(int i=0; i<N; i++) {
            String[] rows = br.readLine().split(" ");
            for(int j=0; j<M; j++) {
                boards[i][j] = Integer.parseInt(rows[j]);
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(boards[i][j] == 1) {
                    queue.add(new Point(j, i, 0));
                }
            }
        }
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        while(!queue.isEmpty()) {
            Point now = queue.poll();
            int nowD = now.getDay();
            int nowX = now.getX();
            int nowY = now.getY();
            result = Math.max(result, nowD);
            for(int i=0; i<4; i++) {
                int x = nowX + dx[i];
                int y = nowY + dy[i];
                if(x > -1 && y > -1 && y < boards.length && x < boards[0].length && boards[y][x] == 0) {
                    boards[y][x] = 1;
                    queue.add(new Point(x, y, nowD +1));
                }
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(boards[i][j] == 0) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(result);
        //
//            for(int j=0; j<N; j++) {
//                for(int k=0; k<M; k++) {
//                    if(!visited[j][k] && boards[j][k] == 1) {
//                        queue.add(new Point(k,j));
//                        visited[j][k] = true;
//                    }
//                }
//            }
//            if(queue.isEmpty()) {
//                break;
//            } else {
//                while(!queue.isEmpty()) {
//                    Point point = queue.poll();
//                    int nowX = point.getX();
//                    int nowY = point.getY();
//                    for(int z=0; z<4; z++) {
//                        int newX = nowX + dx[z];
//                        int newY = nowY + dy[z];
//                        if(newX >= 0 && newY >= 0 && newX < boards[0].length && newY < boards.length && !visited[newY][newX] && boards[newY][newX] == 0) {
//                            boards[newY][newX] = 1;
//                        }
//                    }
//                }
//                result = result + 1;
//            }
//        }
//        for(int i=0; i<N; i++) {
//            for(int j=0; j<M; j++) {
//                if(boards[i][j] == 0) {
//                    System.out.println("-1");
//                    return;
//                }
//            }
//        }
//        System.out.println(result-1);
    }

}
