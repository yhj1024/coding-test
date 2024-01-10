import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> chats = new HashSet<>();
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String chat = br.readLine();
            if(chat.equals("ENTER")) {
                // 셋 초기화
                chats.clear();
            } else {
                if(!chats.contains(chat)) {
                    result += 1;
                    chats.add(chat);
                }
            }
        }
        System.out.println(result);
        // br
        // int result
        // set
        // N 채팅 라인 수
        // 반복 N
        // 한줄씩 입력받음
        // 입력값이 ENTER인 경우
        // ENTER SET을 초기화
        // SET에 없으면 +1 있으면 무시
        // 출력

    }

}

