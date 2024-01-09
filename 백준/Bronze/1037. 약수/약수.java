import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // 값을 입력받을 N
        // 배열 입력 받음
        // N이 1이면 제곱해서 보여줌
        // 배열 MIN * MAX
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] inputs = br.readLine().split(" ");
        int max = 2;
        int min = 1000000;
        for(String input : inputs) {
            int num = Integer.parseInt(input);
            if(num > max) max = num;
            if(num < min) min = num;
        }
        System.out.println(max*min);
    }
}