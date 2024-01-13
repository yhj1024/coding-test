import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N];
        for(int i=0; i<N; i++) {
            visited[i] = false;
        }

        int[][] graph = new int[N][N];
        for(int i=0; i<M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a-1][b-1] = 1;
            graph[b-1][a-1] = 1;
            // 간선이 양방향이므로 둘다 넣어준다
        }

        DFS(V, visited, graph);
        for(int i=0; i<N; i++) {
            visited[i] = false;
        }
        sb.append("\n");
        BFS(V, visited, graph);

        System.out.println(sb);
        // N 정점의 개수
        // M 간선의 개수
        // V 정점
        // 방문 여부 배열
        // 그래프 배열
        // DFS(V)
        // BFS(V)
    }

    private static void DFS(int val, boolean[] visited, int[][] graph) {
        sb.append(val).append(" ");
        visited[val-1] = true;
        int[] nodes = graph[val-1];
        for(int i=0; i<nodes.length; i++) {
            if(nodes[i] == 1 && !visited[i])
                DFS(i+1, visited, graph);
        }
    }

    private static void BFS(int val, boolean[] visited, int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(val);
        visited[val-1] = true;
        while(!queue.isEmpty()) {
            int before = queue.poll();
            sb.append(before).append(" ");
            int[] nodes = graph[before-1];
            for(int i=0; i<nodes.length; i++) {
                if(nodes[i] == 1 && !visited[i]) {
                    queue.add(i+1);
                    visited[i] = true;
                }
            }
        }
    }
        // 큐 선언
        // 큐에 val 집어넣음
        // val 출력
        // val방문처리
        // while 큐가 빌 때까지
        //   int num = pop left;
    //        System.out.printf(num+" ");
    //        visited[num-1] = true;

}