package BronzeIV;

import java.io.*;
import java.util.*;

public class N_2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		// A는 현재 시간의 시간, B는 현재 시간의 분 C는 조리하는데 걸리는 시간을 분 단위로 
		int Ph = (B+C)/60;
		int Lm = (B+C)%60;
		if(A+Ph < 24) {
			System.out.println(A+Ph+" "+Lm);
		}
		else {
			System.out.println((A+Ph)-24+" "+Lm);
		}
		
	}

}
