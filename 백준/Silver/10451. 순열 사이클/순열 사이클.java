import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static int bfs(int[] lines) {

        boolean[] visited = new boolean[lines.length];
        Queue<Integer> queue = new LinkedList<>();
        int result = 0;
        for(int i=0; i<lines.length; i++) {
            if(!visited[lines[i]-1]) {
                queue.add(lines[i]);
                visited[lines[i]-1] = true;
                result = result + 1;
                while(!queue.isEmpty()) {
                    int now = queue.poll();
                    int next = lines[now-1];
                    if(!visited[next-1]) {
                        visited[next-1] = true;
                        queue.add(next);
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            String[] lineStrings = br.readLine().split(" ");
            int[] lines = new int[N];
            for(int j=0; j<lineStrings.length; j++) {
                lines[j] = Integer.parseInt(lineStrings[j]);
            }
            int result = bfs(lines);
            System.out.println(result);
        }


    }

}
