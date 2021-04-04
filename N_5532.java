package BronzeIV;

import java.io.*;

public class N_5532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int L = Integer.parseInt(br.readLine()); // 방학 일 수 
		int A = Integer.parseInt(br.readLine()); // 국어 페이지
		int B = Integer.parseInt(br.readLine()); // 수학 페이지
		int C = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 국어 페이지
		int D = Integer.parseInt(br.readLine()); // 하루에 풀 수 있는 최대 수학 페이지 
		
		int result1 = A/C;
		int result2 = B/D;
		if(A%C != 0) {
			result1++;
		}
		if(B%D != 0) {
			result2++;
		}
		int max = Math.max(result1, result2);
		System.out.println(L-max);
	}
}
