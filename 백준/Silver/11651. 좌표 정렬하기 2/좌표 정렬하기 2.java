import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++) {
            String[] nums = bf.readLine().split(" ");
            arr[i][0] = Integer.parseInt(nums[0]);
            arr[i][1] = Integer.parseInt(nums[1]);
        }

        Arrays.sort(arr, (int[] o1, int[] o2) -> {
            return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
        });
        for(int[] ar : arr) {
            System.out.println(ar[0] + " " +ar[1]);
        }

    }
}