import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<N+1; i++)
            deque.addLast(i);
        int repeatCnt = 1;
        while(!deque.isEmpty()) {
            if(K == repeatCnt) {
                repeatCnt = 1;
                sb.append(deque.pollFirst());
                if(!deque.isEmpty())
                    sb.append(", ");
            } else {
                deque.addLast(deque.pollFirst());
                repeatCnt++;
            }
        }
        sb.append(">");
        System.out.println(sb);
        // 디큐 선언
        // 디큐 1부터 N까지 초기화
        // 현재 반복 카운트를 세는 변수 0을 선언
        // while 을 큐가 빌 때까지 반복
        //  if 카운트가 K번째인 경우
        //    현재값 POP 처리 및 카운트 0으로 초기화
        //  else 앞의 값을 맨 뒤로 보내기 및 카운트++
    }
}
