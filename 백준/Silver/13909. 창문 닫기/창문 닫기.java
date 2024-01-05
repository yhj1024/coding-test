import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        // 창문을 닫기 위해서는 해당 수가 열기 -> 닫기 -> 열기 짝수 횟수 만큼 반복되어야 한다.
        // 이 말은 해당 수 약수의 값이 홀수여야 된다는 것이고
        // 주어진 수의 범위 내에서 약수의 개수가 홀수인 수들의 개수를 구해야됨
        // 약수의 개수가 홀수인 수는 어떤 수의 제곱근이 되는 수이고
        // 1*1=1 2*2=4 3*3=9 4*4=16 ... 이 있다 이 수를 카운트해서 보여주면 된다
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        for(int i=1; i*i<=N; i++) {
            result++;
        }
        System.out.println(result);
    }

}
