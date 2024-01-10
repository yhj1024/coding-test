import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> dancers = new HashSet<>();
        dancers.add("ChongChong");
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();
            String b = st.nextToken();
            if(dancers.contains(a) || dancers.contains(b)) {
                dancers.add(a);
                dancers.add(b);
            }
        }
        br.close();
        System.out.println(dancers.size());
    }

    // br
    // bw
    // int N 기록 수 입력 받음
    // Set<String> Dances 춤추는 명단 (ChongChong) 초기화
    //  for n
    //   st 입력받음
    //   string a = st.nexttoken
    //   String b = st.nexttoken
    //   a가 set에 있는지 확인
    //   있으면 b도 set에 추가함
    //  set 사이즈 출력

}