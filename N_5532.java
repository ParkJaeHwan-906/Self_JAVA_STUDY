package BronzeIV;

import java.io.*;

public class N_5532 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int L = Integer.parseInt(br.readLine()); // ���� �� �� 
		int A = Integer.parseInt(br.readLine()); // ���� ������
		int B = Integer.parseInt(br.readLine()); // ���� ������
		int C = Integer.parseInt(br.readLine()); // �Ϸ翡 Ǯ �� �ִ� �ִ� ���� ������
		int D = Integer.parseInt(br.readLine()); // �Ϸ翡 Ǯ �� �ִ� �ִ� ���� ������ 
		
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
