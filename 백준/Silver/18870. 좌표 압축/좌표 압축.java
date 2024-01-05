import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // 중복 제거 및 sort 처리
        // 반복문 돌면서
        // 값:인덱스 형태로 map 저장
        // 원배열 반복분 돌면서
        // map 에서 인덱스 조회해서 출력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int[] origin = new int[N];
        int[] sorted = new int[N];

        for(int i=0; i<N; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> countMap = new HashMap<>();
        int idx = 0;
        for(int i=0; i<sorted.length; i++) {
            if(!countMap.containsKey(sorted[i])) {
                countMap.put(sorted[i], idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<origin.length; i++) {
            sb.append(countMap.get(origin[i]));
            if(i != origin.length -1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}