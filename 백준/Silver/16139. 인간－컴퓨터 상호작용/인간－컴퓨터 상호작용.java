import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String S = br.readLine();
        Map<Character, Integer[]> map = new HashMap<>();
        int q = Integer.parseInt(br.readLine());
        for(int i=0; i<q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            char alpha = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(!map.containsKey(alpha)) {
                Integer[] sums = new Integer[S.length()];
                for(int j=0; j<S.length(); j++) {
                    sums[j] = 0;
                    if(j>0) {
                        sums[j] += sums[j-1];
                    }
                    if(S.charAt(j) == alpha) {
                        sums[j] += 1;
                    }
                }
                map.put(alpha, sums);
            }
            Integer[] sums = map.get(alpha);
            if(start > 0) {
                int val = sums[end] - sums[start-1];
                if(val < 0) val = 0;
                sb.append(val);
            } else {
                sb.append(sums[end]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        // br, sb
        // S 문자열
        // HashMap key 알파벳 : value [누적합 배열]
        // q 문제수
        // for q
        // alphabet, start, end
        // hashmap에서 알파벳이 있는지 확인
        // 없으면 먼저 해당 알파벳으로 합배열 계산 및 map에 저장
        // 누적합 배열에서 end 값의 인덱스에서 값을꺼냄 - start가 0보다 크면 start 값의 인덱스에서 값을꺼냄
        // 누적합[end] - 누적합[start]
        // sb에 append

    }
}