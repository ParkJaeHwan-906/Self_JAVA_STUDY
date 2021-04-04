package BronzeIV;

import java.io.*;

public class N_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		StringBuilder B = new StringBuilder(br.readLine());
		B.reverse();
		int result=0;
		// A는 불변 B를 한자리씩 나눠서 A에 곱한 수 1 10 100 을 곱해줌 
		for(int i=0; i<B.length(); i++) {
			int x = Integer.parseInt(B.substring(i,i+1));
			int y = A*x;
			System.out.println(y);
			result += y*Math.pow(10, i);
		}
		System.out.println(result);
	}

}
