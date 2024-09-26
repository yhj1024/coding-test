import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static boolean[] visited;

    public static void bfs(int key) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(key);
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for(int i : graph.get(now)) {
                if(!visited[i-1]) {
                    visited[i-1] = true;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        visited = new boolean[N];
        int result = 0;
        for(int i=0; i<M; i++) {
            String[] rows = br.readLine().split(" ");
            int key = Integer.parseInt(rows[0]);
            int item = Integer.parseInt(rows[1]);
            if(!graph.containsKey(key)) {
                graph.put(key, new ArrayList<>());
            }
            if(!graph.containsKey(item)) {
                graph.put(item, new ArrayList<>());
            }
            graph.get(key).add(item);
            graph.get(item).add(key);
        }
        for(int i=1; i<=N; i++) {
            if(!visited[i-1]) {
                result = result + 1;
                visited[i-1] = true;
                if(graph.containsKey(i)) {
                    bfs(i);
                }
            }
        }
        System.out.println(result);
    }

}
