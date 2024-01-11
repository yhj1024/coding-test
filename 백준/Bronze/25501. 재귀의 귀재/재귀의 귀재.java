import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static boolean isPalindrome(char[] words, int start, int end, int repeatCnt) {
        if(start>=end) {
            System.out.printf("%d %d\n", 1, repeatCnt);
            return true;
        }
        else if(words[start] != words[end]) {
            System.out.printf("%d %d\n", 0, repeatCnt);
            return false;
        } else {
            return isPalindrome(words, start+1, end-1, repeatCnt+1);
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            char[] words = br.readLine().toCharArray();
            isPalindrome(words, 0, words.length - 1, 1);
        }
    }

}