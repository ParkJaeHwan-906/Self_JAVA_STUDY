package BronzeIV;

import java.io.*;

public class N_2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		StringBuilder B = new StringBuilder(br.readLine());
		B.reverse();
		int result=0;
		// A�� �Һ� B�� ���ڸ��� ������ A�� ���� �� 1 10 100 �� ������ 
		for(int i=0; i<B.length(); i++) {
			int x = Integer.parseInt(B.substring(i,i+1));
			int y = A*x;
			System.out.println(y);
			result += y*Math.pow(10, i);
		}
		System.out.println(result);
	}

}
