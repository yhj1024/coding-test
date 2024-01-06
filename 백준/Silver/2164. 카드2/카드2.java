import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {

        // 입력받을 N
        // 양쪽으로 입력받아야 하므로 DEQUE 선언
        // 1 부터 N = 1까지 반복하며 DEQUE 초기화
        // WHILE TRUE
        //   첫번째 값을 버린다
        //   Q SIZE 가 2이상 이면
        //    첫번째 값을 맨 뒤로 옮긴다
        //    아니면 종료
        // 큐에 남은 값 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> cards = new ArrayDeque<Integer>();
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i < N+1; i++)
            cards.addLast(i);
        while (cards.size() != 1) {
            cards.pollFirst();
            if(cards.size() == 1)
                break;
            Integer card = cards.pollFirst();
            cards.addLast(card);
        }
        System.out.println(cards.pollFirst());
    }
}

