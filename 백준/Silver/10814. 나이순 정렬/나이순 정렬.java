import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    private static class Member {
        int age;
        String name;
        int index;
        public Member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Member[] members = new Member[N];
        for(int i=0; i<N; i++) {
            String[] lines = bf.readLine().split(" ");
            members[i] = new Member(Integer.parseInt(lines[0]), lines[1], i);
        }
        Arrays.sort(members, (member1, member2) -> {
            if(member1.age == member2.age) {
                return member1.index - member2.index;
            } else {
                return member1.age - member2.age;
            }
        });
        Arrays.stream(members).forEach(member -> System.out.println(member.age + " " + member.name));
    }


}