import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Deque<String> deque = new ArrayDeque<>();
        String word;
        int N = Integer.parseInt(br.readLine());
        String[] command;

        for(int i=0; i<N; i++) {
            command = br.readLine().split(" ");
            word = "";
            switch (command[0]){
                case "push":
                    deque.add(command[1]);
                    break;
                case "pop":
                    if(deque.isEmpty()) {
                        word =  "-1";
                    } else {
                        word = deque.pollFirst();
                    }
                    break;
                case "size":
                    word = String.valueOf(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()) {
                        word = "1";
                    } else {
                        word = "0";
                    }
                    break;
                case "front":
                    if(!deque.isEmpty()) {
                        word = deque.peekFirst();
                    } else {
                        word = "-1";
                    }
                    break;
                case "back":
                    if(!deque.isEmpty()) {
                        word = deque.peekLast();
                    } else {
                        word = "-1";
                    }
                    break;
            }
            if(!word.isEmpty())
                sb.append(word).append("\n");
        }
        if(sb.length() > 1) {
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb);
    }
}