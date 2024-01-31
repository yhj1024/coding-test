import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] fileNames = new String[N];
        for(int i=0; i<N; i++) {
            fileNames[i] = br.readLine();
        }
        char[] result = fileNames[0].toCharArray();
        int fileNameLen = result.length;

        for(int i=1; i<N; i++) {
            for(int j=0; j<fileNameLen; j++) {
                if(fileNames[i].charAt(j) != result[j]) {
                    result[j] = '?';
                }
            }
        }

        System.out.println(result);
        // 패턴 알파벳, . , ?
        // ?를 적게 써야함
        
        // br
        // N 입력받을 개수
        // fileNames String[N] 저장할 문자열 배열
        // for N
        //   fileNames[i] br.readLine 
        // result char[N] 출력할 문자 배열
        // for fileNames
        //   for fileName
            //   if 시작인 경우 charAt 으로 char 초기화
            //   아니면 char[i] 와 chartAt[i] 로 비교해서 다르면 ?로 치환 처리
        // result 출력
    }

}
