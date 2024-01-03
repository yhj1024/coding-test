import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            Map<Integer, Integer> cardCountMap = getCardCountMap();
            Map<Integer, Integer> cardMap = getCardMap();
            String[] cards = br.readLine().split(" ");
            for (String card : cards) {
                int beforeCount = cardMap.get(Integer.parseInt(card));
                cardMap.put(Integer.parseInt(card), beforeCount+1);
            }
            for (Integer key : cardMap.keySet()) {
                Integer count = cardMap.get(key);
                Integer value = cardCountMap.get(count);
                if(value != null) {
                    cardCountMap.put(count, value + 1);
                }
            }
            String result = "";
            Integer fourCount = cardCountMap.get(4);
            Integer threeCount = cardCountMap.get(3);
            Integer twoCount = cardCountMap.get(2);

            if(fourCount == 1 && twoCount == 1) {
                result = "tiki pair";
            } else if(fourCount == 1 && twoCount == 0) {
                result = "tiki";
            } else if(threeCount == 2) {
                result = "two triples";
            } else if(threeCount == 1 && twoCount == 1) {
                result = "full house";
            } else if(threeCount == 1) {
                result = "one triple";
            } else if(twoCount == 3) {
                result = "three pairs";
            } else if(twoCount == 2) {
                result = "two pairs";
            } else if(twoCount == 1) {
                result = "one pair";
            } else {
                result = "single";
            }

            System.out.println(result);
        }
    }

    private static Map<Integer, Integer> getCardMap() {
        final int cardNum = 13;
        Map<Integer, Integer> cardCountMap = new HashMap<Integer, Integer>();
        for(int i=1; i<=cardNum; i++) {
            cardCountMap.put(i, 0);
        }
        return cardCountMap;
    }

    private static Map<Integer, Integer> getCardCountMap() {
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        frequencyMap.put(2, 0);
        frequencyMap.put(3, 0);
        frequencyMap.put(4, 0);
        return frequencyMap;
    }

}