package BronzeIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_2420 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// ù° �ٿ� �� �������� ���� N�� M�� �־�����. (-2,000,000,000 �� N, M �� 2,000,000,000)
		// long �� ��� 
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		System.out.println(Math.abs(N-M) );
	}

}
