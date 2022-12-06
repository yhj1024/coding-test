import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isUp = false;
		int input = Integer.parseInt(br.readLine());
		int i=1;
		int j=1;
		for(int k=1; k<input; k++) {		
			if(i==1) {
				if(j%2==0) {
					i++;
					j--;
				} else {
					j++;
					isUp = false;
				}
			} else if(j==1) {
				if(i%2==0) {
					i++;
				} else {
					i--;
					j++;
					isUp = true;
				}
			} else {
				if(isUp) {
					i--;
					j++;
				} else {
					i++;
					j--;
				}
			}
		}
		System.out.println(i+"/"+j);
	}
}
