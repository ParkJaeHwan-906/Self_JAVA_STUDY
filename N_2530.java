package BronzeIV;

import java.io.*;
import java.util.*;

public class N_2530 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		// A�� �ð� B�� �� C�� ��
		int D = Integer.parseInt(br.readLine());
		// D�� �ɸ��� �ð�
		B = B+(C+D)/60;
		A = A+B/60;
		C = (C+D)%60;
		B = B%60;
		if(A<24) {
			System.out.println(A+" "+B+" "+C);
		}
		else {
			System.out.println(A%24+" "+B+" "+C);
		}
	}

}
// 24�ð��� ���� ��� 24�� ���ִ� ���� �ƴ� 24�� ���� �������� ���!!!!!!