import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        String[] steps = br.readLine().split(" ");
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=2; i<N+1; i++)
            deque.addLast(i);
        sb.append(1);
        sb.append(" ");
        int step = Integer.parseInt(steps[0]);
        while(!deque.isEmpty()) {
            if(step < 0) {
                for(int i=step; i<0; i++) {
                    deque.addFirst(deque.pollLast());
                }
                int num = deque.pollFirst();
                step = Integer.parseInt(steps[num - 1]);
                sb.append(num);
                sb.append(" ");
            } else {
                for(int i=1; i<step; i++) {
                    deque.addLast(deque.pollFirst());
                }
                int num = deque.pollFirst();
                step = Integer.parseInt(steps[num - 1]);
                sb.append(num);
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}