import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        String[] arr = new String[N];
        for(int i=0; i<N; i++) {
            arr[i] = bf.readLine();
        }
        String[] deduplicationArr = Arrays.stream(arr).distinct().toArray(String[]::new);
        Arrays.sort(deduplicationArr, (o1, o2) -> {
            if(o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });
        for(String word : deduplicationArr) {
            System.out.println(word);
        }
    }
}