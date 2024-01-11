import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int sum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<N; i++) {
            Integer num = Integer.parseInt(br.readLine());
            nums[i] = num;
            if(freqMap.containsKey(num)) {
                Integer newCnt = freqMap.get(num) + 1;
                freqMap.replace(num, newCnt);
            } else {
                freqMap.put(num, 1);
            }
        }
        Arrays.sort(nums);
        int maxFreq = 0;
        int minFreqMostVal = 4001;
        int minFreqSecondVal = 4001;

        for(Integer num : nums) {
            sum += num;
            Integer newCnt = freqMap.get(num) + 1;
            freqMap.replace(num, newCnt);
            if(maxFreq < newCnt) {
                maxFreq = newCnt;
                minFreqMostVal = num;
                minFreqSecondVal = num;
            } else if(maxFreq == newCnt) {
                if(minFreqMostVal > num) {
                    minFreqSecondVal = minFreqMostVal;
                    minFreqMostVal = num;
                } else if(minFreqSecondVal == minFreqMostVal || minFreqSecondVal > num){
                    minFreqSecondVal = num;
                }
            }
        }
        System.out.printf("%d\n%d\n%d\n%d", Math.round(sum*1.0/N), nums[N/2], minFreqSecondVal, nums[nums.length-1]-nums[0]);

        // N (수의 개수)
        // int[] nums 숫자들
        // int sum 
        // HashMap key value 빈도수 체크용
        // int maxFreq 최대 빈도수
        // int minFreqMostVal 빈도수 많은 것중 제일 작은 값2
        // int minFreqSecondVal 빈도수 많은 것중 두번 째로 작은 값
        // for N
        //  nums 채우기
        //  hashmap 채우기
        // 정렬
        // for nums
        //   sum (합계 구하기)
        //   hashmap.get(num) + 1
        //   빈도수 map 업데이트
        //   if 최대 빈도수 < 빈도수
        //      제일 큰 값 두번 째로 큰값 현재 값 으로 업데이트 처리
        //   else if 최대 빈도수 == 빈도수
        //      제일 작은 값 보다 작은 경우
        //         두번 째로 작은 값 = 제일 작은 값
        //         제일 작은 값 = 현재값(num)
        //      두번 째로 작은값 보다 작은 경우
        //          두번 째로 작은 값 = 현재값(num)
        //
        // Math.round(sum/N) // 산술평균
        // nums(N/2) // 중앙값
        // minFreqSecondVal // 최빈값
        // nums(nums.length-1)-nums(0) // 범위

    }

}