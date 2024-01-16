import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] temp;
    static int count;
    static int result = -1;
    static int K;


    private static void mergeSort(int[] A, int start, int end) {
        if(start<end) {
            int M = (start + end) / 2;
            mergeSort(A, start, M); // 좌측
            mergeSort(A, M+1, end); // 우측
            merge(A, start, end, M);
        }
    }
    public static void merge(int[] A, int start, int end, int mid) {
        int l = start;
        int r = mid+1;
        int t = 0;
        while(l <= mid && r <= end) {
            if(A[l] > A[r]) temp[t++] = A[r++];
            else temp[t++] = A[l++];
        }
        while(l <= mid) temp[t++] = A[l++];
        while(r <= end) temp[t++] = A[r++];

        l = start;
        t = 0;

        while(l <= end) {
            count++;
            if(count == K) {
                result = temp[t];
            }
            A[l++] = temp[t++];
        };

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        temp = new int[N];
        count = 0;
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st2.nextToken());
        }
        mergeSort(A, 0, N-1);
        System.out.println(result);
        // N (배열 크기) K(저장 횟수)
        // C (반복 횟수)
        // A (정렬 할 배열)
        // 임시저장배열
        // result = -1 (정답)
        // st
        // for N
        //  A 초기화
        // mergeSort(A)

        // mergeSort(A, S, E)
        //   if(S<=E) {
            //   int M = S+E/2
            //   mergeSort(A, S, M) 좌
            //   mergeSort(A, M+1, E) 우
            //   merge(A, S, E)
        //   }

        // merge(A, S, E)
        // i = S
        // j = E
        // while(i >= S && j<=E)
        //   if(A[i] > A[j]) TMP[T
        // 왼쪽 배열이 남은 경우 처리
        // 오른쪽 배열이 남은 경우 처리
        // C를 0으로 초기화
        // for i가 end까지
        //  IF ++C와 CNT가 같다면
        //  result = a[i]
        //  break
        // result 출력

    }
}