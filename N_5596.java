package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N_5596 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[2];
		for(int i=0; i<2; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		result[i] = Max_Score(Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()));
		}
		if(result[0]==result[1]) {
			System.out.println(result[0]);
		}
		else {
			System.out.println(Math.max(result[0], result[1]));
		}
	}
	public static int Max_Score(int...score) {
		int sum=0;
		for(int i : score) {
			sum += i;
		}
		return sum;
	}

}
