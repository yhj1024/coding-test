import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuffer sb = new StringBuffer();
    static int N;
    static int M;
    static boolean[] visited;
    static int[] seqs;

    private static void dfs(int depth) {
        if(depth == M) {
            for(int seq : seqs) {
                sb.append(seq).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                seqs[depth] = i + 1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        seqs = new int[M];
        dfs(0);
        System.out.println(sb);


        //      1       2       3
        //    1 2 3   1 2 3   1 2 3
        // 12, 13, 21, 23, 31, 32
        // 1. dfs 로 탐색을 하는데 이미 탐색한 경우 에는 재방문 하지 않도록 해야함
        // 2. 탐색이 끝난 후에는 방문 하지 않은 것으로 처리 해서, 다음 상태에서는 방문을
        // 하도록 해야됨 (백트랙킹)

        // 다 전역변수로 선언
        // br, sb
        // N (최대수)
        // M (수열 개수)
        // boolean[N] visited (방문여부)
        // int[N] seqs (수열)

        // dfs(0);
        // System.out.print(sb);

        // dfs(depth)
        // depth == N
        //   for seqs
        //     sb.append(seq).append(" ")

        // for 0 ~ N:
        //  if(!visited[i])
        //      visitied[i] = true;
        //      seqs[depth] = i + 1
        //      dfs(depth + 1);
        //      visited[i]= false;
        //
        // 이미 탐색된 곳은 탐색하면 안됨 visited 처리
        // dfs탐색이 끝나면 visited를 다시 원복하여 재방문 할 수 있도록 처리
        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());

    }
        

}
