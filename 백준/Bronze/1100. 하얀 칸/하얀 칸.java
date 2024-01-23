import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception {


        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for(int i=0; i<8; i++) {
            String line = br.readLine();
            for(int j=0; j<8; j++) {
                char c = line.charAt(j);
                if(c != 'F') continue;
                if(i%2 == 0 && j%2 == 0) {
                    result++;
                } else if(i%2 == 1 && j%2 == 1) {
                    result++;
                }

            }
        }
        System.out.println(result);


        //  0 1
        //0 흰검흰검흰검흰검
        //1 검흰검흰검흰검흰

        // 가로가 짝수일때, 세로가 짝수이면 흰색 (이 때 현재 값이 F이면 카운트)
        // 가로가 홀수일때, 세로가 홀수이면 흰색 (이 때 현재 값이 F이면 카운트)


    }


}
