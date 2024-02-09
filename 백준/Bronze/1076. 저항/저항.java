import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> color = new HashMap<>();
        int i = 0;
        color.put("black", i++);
        color.put("brown", i++);
        color.put("red", i++);
        color.put("orange", i++);
        color.put("yellow", i++);
        color.put("green", i++);
        color.put("blue", i++);
        color.put("violet", i++);
        color.put("grey", i++);
        color.put("white", i++);


        String color1 = br.readLine().trim();
        String color2 = br.readLine().trim();
        String color3 = br.readLine().trim();

        String prefix = String.valueOf(color.get(color1)) + color.get(color2);
        int val = (int) Math.pow(10, color.get(color3));
        long i1 = (long) Integer.parseInt(prefix) * val;
        System.out.println(i1);



    }

}
