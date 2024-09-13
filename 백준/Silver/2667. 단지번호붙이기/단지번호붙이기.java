import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static class Point {
        private int x;
        private int y;

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

    public static Point getPoint(int i, int j) {
        Point point = new Point();
        point.setY(i);
        point.setX(j);
        return point;
    }

    public static Integer bfs(char[][] boards, int i, int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(getPoint(i, j));
        boards[i][j] = '0';
        Integer result = 1;
        while(!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();
            // 상 방문처리
            if(y > 0 && boards[y-1][x] == '1') {
                queue.add(getPoint(y-1, x));
                boards[y-1][x] = '0';
                result++;
            }
            // 하 방문처리
            if(y+1 < boards.length && boards[y+1][x] == '1') {
                queue.add(getPoint(y+1, x));
                boards[y+1][x] = '0';
                result++;
            }
            // 좌 방문처리
            if(x > 0 && boards[y][x-1] == '1') {
                queue.add(getPoint(y, x-1));
                boards[y][x-1] = '0';
                result++;
            }
            // 우 방문처리
            if(x+1 < boards[0].length && boards[y][x+1] == '1') {
                queue.add(getPoint(y, x+1));
                boards[y][x+1] = '0';
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> resultList = new ArrayList<>();
        int T = Integer.parseInt(br.readLine());
        int result = 0;
        char[][] boards = new char[T][T];
        for(int i=0; i<T; i++) {
            String row = br.readLine();
            for(int j=0; j<T; j++) {
                char item = row.charAt(j);
                boards[i][j] = item;
            }
        }
        for(int i=0; i<T; i++) {
            for(int j=0; j<T; j++) {
                if(boards[i][j] == '1') {
                    result = result + 1;
                    Integer res = bfs(boards, i, j);
                    resultList.add(res);
                }
            }
        }
        System.out.println(result);
        resultList.sort(Comparator.comparingInt(a -> a));
        resultList.forEach(System.out::println);
    }

}
