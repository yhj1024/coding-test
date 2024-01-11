import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();
        Map<String, Integer> freqMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Integer N = Integer.parseInt(st.nextToken());
        Integer M = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++) {
            String word = br.readLine();
            if(word.length() >= M) {
                boolean isAdd = freqMap.containsKey(word);
                if(!isAdd) {
                    words.add(word);
                }
                Integer freq = isAdd ? freqMap.get(word) + 1 : 1;
                freqMap.put(word, freq);
            }
        }
        words.sort((s1, s2) -> {
            int freqS1 = freqMap.get(s1);
            int freqS2 = freqMap.get(s2);
            if (freqS1 != freqS2) {
                return freqS2 - freqS1;
            } else if (s1.length() != s2.length()) {
                return s2.length() - s1.length();
            } else {
                return s1.compareTo(s2);
            }
        });
        StringBuffer sb = new StringBuffer();
        words.stream().forEach(word -> {
            sb.append(word).append("\n");
        });
        System.out.println(sb.deleteCharAt(sb.length()-1));
        // br
        // words List
        // 빈도수 체크용 freqMap key단어, value횟수
        // st
        // N M
        // for N
        //  m보다 긴 거만
        //  words 배열에 추가
        //  freqMap에 빈도수 추가
        // array.sort
        //  if 빈도수s1과 빈도수s2가 다른경우
        //  return 빈도수s1 - 빈도수s2
        //  else if 길이가 다르다면
        //  return s1.length - s2.length
        //  else
        //  return s1.compareTo(s2)
        // sb
        // for words
        // sb append
        // 출력 처리

    }

}