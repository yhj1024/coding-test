import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

//    static long[] factMemo = new long[9999999];

//    public static Long fact(int n) {
//        if(n<2)
//            return 1L;
//        if(factMemo[n-1] != 0)
//            return factMemo[(n-1)];
//        factMemo[n-1] = n * fact(n-1);
//        return factMemo[n-1];
//    }
    public static Long comb(int n) {
        if(n % 2 == 0) {
            return n/2L * (n-1);
        } else {
            return n * ((n-1) / 2L);
        }
        // 10 9 8 7 6 5 4 3 2 1
        // 8 9 7 6 5 4 3 2 1 * 2
        // N * N-1 / 2
        // N이 짝수면 2로 먼저 나눔
        //        return fact(n) / (fact(n-2) * 2);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] m = new int[N];

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        long temp = Integer.parseInt(st2.nextToken());
        m[0] = (int) (temp % M);
        map.put(m[0], 1);

        for(int i=1; i<N; i++) {
            temp = temp + Integer.parseInt(st2.nextToken());
            m[i] = (int) (temp % M);
            if(map.containsKey(m[i])) {
                int val = map.get(m[i]);
                map.replace(m[i], val+1);
            } else {
                map.put(m[i], 1);
            }
        }

        Long result = Long.valueOf(map.getOrDefault(0, 0));
        for(int val : map.values()) {
            if(val > 1) {
                result += comb(val);
            }
        }

        System.out.println(result);

        // br
        // N (수의 개수)
        // M (나눌 수)
        // int[N] (값 배열)
        // int[N] (합 배열)
        // int[N] (합을 나눌수로 나눈 나머지 배열)
        // hashMap<Integer,Integer> (나머지 값을 key 개수를 value로 가질 맵)

        // FOR N
        //   값배열 초기화
        //   합배열 초기화
        //   합배열 나머지 초기화
        //   if (map.contains 합배열 나머지 값)
        //      get value +1
        //   else 추가

        // int result = map.get(0)
        // map.remove(0)
        // map을 반복
        //   result += comb 함수로 보냄 (값, 2)

        // result 출력

        // 1            X
        // 1 2          O
        // 1 2 3        O
        // 1 2 3 1      X
        // 1 2 3 1 2    O
        // 2            X
        // 2 3          X
        // 2 3 1        O
        // 2 3 1 2      X
        // 3            O
        // 3 1          X
        // 3 1 2        O
        // 1            X
        // 1 2          O
        // 2            X

        // 패턴이 구간 합을 이용한 문제이다
        // 1 3 6 7 9
        // 1+2 = 1번 인덱스
        // 1+2+3 = 2번 인덱스
        // ....
        // 3+1+2 = 4번 인덱스 - 1번 인덱스로 표현 가능
        // 근데 숫자의 개수가 1,000,000 이므로 위 방식으로 구하면 시간초과 날 것임

        // 이 때 모듈러 연산에 의해
        // (4번 인덱스 - 1번 인덱스)/N = 0 인 경우
        // 4번 인덱스/N = 1번 인덱스/N = 0 이 된다

        // 즉 구간합 배열을 먼저 N으로 나눠 놓고
        // 1 0 0 1 0
        // 먼저 0 => 3개
        // + 두개롤 골라서 뺏을때 0인 값 (동일한 값) 들에 대한 조합
        // 1번 - 2번, 1번 - 4번, 2번 - 4번 => 3개
        // 0번 - 3번 => 1개
        // 3+3+1 = 7개가 된다.
        // 그리고 두번째에 대한 내용은 조합 식으로 표현하여 아래처럼 계산할 수 있다.
        // 3c2
        // 2c2

    }


}