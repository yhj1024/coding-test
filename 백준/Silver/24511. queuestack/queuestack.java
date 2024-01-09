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
        int[] A = new int[N];
        StringTokenizer as = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++)
            A[i] = Integer.parseInt(as.nextToken());
        StringTokenizer bs = new StringTokenizer(br.readLine(), " ");
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(bs.nextToken());
            if(A[i] == 0)
                deque.addLast(num);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            deque.addFirst(num);
            sb.append(deque.pollLast());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
        // 시도 1 - 시간 초과
        // 입력받을 변수 BufferedReader
        // 출력할 변수 StringBuffer
        // N 자료 개수 입력 받음
        // 자료 구조 확인 할 배열 N개 초기화 (0=큐, 1=스택)
        // 실제 값을 담고 있을 배열 N개 초기화

        // M 테스트 케이스 개수 입력 받음
        // 테스트 케이스 값 배열 초기화 M개
        // for(int i=0; i<M; i++;) {
        //      C 시작값 = 테스트케이스값[i]
        //      for(int j=0; j<N; j++) {
        //          j번째 자료구조가 큐인 경우
        //              시작값을 tmp 변수를 선언하여 저장
        //              시작값을 실제값[j] 로 변경
        //              실제값[j]를 tmp 값으로 변경
        //          j번째 자료구조가 스택인 경우
        //      }
        //      sb.append(값)
        //      sb.append(구분자)
        // }
        // sb 마지막 인덱스 제거
        // 출력

        // 시도 2
        // 추가 아이디어
        // 1. stack은 어차피 들어온 값 그대로 넘겨주니 계산할 필요가 없다
        // queue끼리만 연결시켜 봐도 결과는 똑같음
        // + 큐니까 들어온 값이 한 칸씩 밀어내는 형태인거고
        // 하나의 큐를 만들어놓고 신규값을 addFirst 하고 pollLast 하는 거랑 같은 형태
        // 입력받을 변수 BufferedReader
        // 출력할 변수 StringBuffer
        // N 자료 개수 입력 받음
        // 실제 값을 담고 있을 배열 A N개 초기화
        // 자료 구조 확인 할 배열 B N개 초기화 (0=큐, 1=스택)
        // 입력받을 변수 StringTokenizer
        // 실제 값을 담고 디큐 초기화
        // 이 때 stack 인 경우는 제외하고 값을 삽입

        // M 테스트 개수 입력 받음
        // C StringTokenizer 입력받음
        // 반복문 돌면서 토큰에서 값 꺼내서
        // 맨 왼쪽에 삽입 마지막 값 pollLast sb에 추가







    }
}

