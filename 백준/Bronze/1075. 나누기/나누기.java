import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<100; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(N));
            if(i<10) {
                sb.delete(sb.length()-2, sb.length());
                sb.append(0);
                sb.append(i);
            } else {
                sb.delete(sb.length()-2, sb.length());
                sb.append(i);
            }
            int newN = Integer.parseInt(String.valueOf(sb));
            if(newN % K == 0) {
                String newNstr = String.valueOf(newN);
                System.out.print(newNstr.substring(newNstr.length()-2));
                break;
            }
        }
    }
    
}
