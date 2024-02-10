import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] alphabets = new int[26];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            int a = str.charAt(0) - 97;
            alphabets[a] += 1;
        }
        boolean isPreDaja = true;
        for(int i=0; i<alphabets.length; i++) {
            if(alphabets[i] >= 5) {
                isPreDaja = false;
                System.out.print(Character.toChars(i+97));
            }
        }
        if(isPreDaja) {
            System.out.println("PREDAJA");
        }
    }

}
