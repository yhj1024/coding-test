import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        final Boolean[] primeBoolean = new Boolean[1000000];
        final List<Integer> primes = new ArrayList<>();
        Arrays.fill(primeBoolean, true);
        primeBoolean[0] = false;
        for(int i=0; i<primeBoolean.length; i++) {
            if(primeBoolean[i]) {
                primes.add(i+1);
                for(int j=i+1+i; j<primeBoolean.length; j+=i+1) {
                    primeBoolean[j] = false;
                }
            }
        }
        int testCaseCnt = Integer.parseInt(bf.readLine());
        int result = 0;
        for(int i=0; i<testCaseCnt; i++) {
            result = 0;
            // 수를 입력 받는다.
            int number = Integer.parseInt(bf.readLine());
            // 수만큼 반복문을 돈다
            for(int j=0; j<number; j++) {
                // 현재 소수값을 바라본다
                // 이 때 소수값 > 입력받은 수/2 인 경우 종료 (중복 방지)
                Integer prime = primes.get(j);
                if (prime > number/2) {
                    break;
                }
                // 입력받은 값 - 소수 = 소수이면 값을 누적한다
                if (primeBoolean[number - prime - 1]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }


}