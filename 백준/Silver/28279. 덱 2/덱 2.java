import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++) {
            String[] cmds = br.readLine().split(" ");
            int cmd = Integer.parseInt(cmds[0]);
            switch (cmd) {
                case 1:
                    deque.addFirst(Integer.parseInt(cmds[1]));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(cmds[1]));
                    break;
                case 3:
                    if(!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 4:
                    if(!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(deque.size());
                    sb.append("\n");
                    break;
                case 6:
                    if(deque.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case 7:
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 8:
                    if(!deque.isEmpty()) {
                        sb.append(deque.peekLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
//        1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
//        2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
//        3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//        4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//        5: 덱에 들어있는 정수의 개수를 출력한다.
//        6: 덱이 비어있으면 1, 아니면 0을 출력한다.
//        7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
//        8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.

    }
}
