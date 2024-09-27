import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int N, K;
    static final int MAX = 100001;

    public static class Point {
        int now, count;

        public Point(int now, int count) {
            this.now = now;
            this.count = count;
        }
    }

    public static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        boolean[] visited = new boolean[MAX];

        queue.offer(new Point(N, 0));
        visited[N] = true;

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int now = p.now;
            int count = p.count;

            if (now == K) {
                System.out.println(count);
                return;
            }

            if (now * 2 < MAX && !visited[now * 2]) {
                queue.offer(new Point(now * 2, count + 1));
                visited[now * 2] = true;
            }
            if (now + 1 < MAX && !visited[now + 1]) {
                queue.offer(new Point(now + 1, count + 1));
                visited[now + 1] = true;
            }
            if (now - 1 >= 0 && !visited[now - 1]) {
                queue.offer(new Point(now - 1, count + 1));
                visited[now - 1] = true;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        N = Integer.parseInt(inputs[0]);
        K = Integer.parseInt(inputs[1]);
        bfs();
    }
}
