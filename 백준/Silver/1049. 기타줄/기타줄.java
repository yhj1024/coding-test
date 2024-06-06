import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        // 패키지 판매 최소 가격
        // 낱개 판매 최소 가격
        // 구매할 기타줄 개수
        // 구매금액

        // 낱개 금액 * 6이 패키지 구매 금액보다 높은 경우 무조건 낱개 구매하는게 낫다

        // while 구매할 기타줄 개수 > 0
        //  if 패키지 판매 최소 가격 > 낱개 판매 최소가*구매할 기타줄 개수
        //   구매할 기타줄 개수 = 구매할 기타줄 개수 - 6
        //   구매금액 = 구매금액 + 패키지 판매 최소 가격
        //  else
        //   구매할 기타줄 개수 = 0
        //   구매금액 = 낱개 판매 최소가*구매할 기타줄 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int N = Integer.parseInt(strs[0]);
        int M = Integer.parseInt(strs[1]);
        int minPackagePrice = Integer.MAX_VALUE;
        int minSinglePrice = Integer.MAX_VALUE;
        int purchaseAmount = 0;

        for(int i=0; i<M; i++) {
            String[] lines = br.readLine().split(" ");
            int packagePrice = Integer.parseInt(lines[0]);
            int singlePrice = Integer.parseInt(lines[1]);
            minPackagePrice = Math.min(minPackagePrice, packagePrice);
            minSinglePrice = Math.min(minSinglePrice, singlePrice);
        }
            
        // 낱개 금액 * 6이 패키지 구매 금액보다 높은 경우 무조건 낱개 구매하는게 낫다
        if(minSinglePrice * 6 <= minPackagePrice) {
            purchaseAmount = minSinglePrice * N;
        } else {
            purchaseAmount = N/6 * minPackagePrice + Math.min(N%6 * minSinglePrice, minPackagePrice);
        }

        System.out.println(purchaseAmount);
    }
}