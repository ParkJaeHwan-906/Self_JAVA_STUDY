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
		// A�� ���� �ð��� �ð�, B�� ���� �ð��� �� C�� �����ϴµ� �ɸ��� �ð��� �� ������ 
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
