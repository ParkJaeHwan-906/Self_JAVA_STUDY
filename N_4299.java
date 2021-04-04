package BronzeIV;

import java.io.*;
import java.util.*;

public class N_4299 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int PL = Integer.parseInt(st.nextToken()); // �� �� ������ ��
		int MI = Integer.parseInt(st.nextToken()); // �� �� ������ �� 
		// �׻� ���� �ƴ� �����̴�.
		
		if((PL+MI)<0 || (PL-MI)<0 || (PL+MI)%2 !=0) {
			System.out.println(-1);
		}
		else {
			System.out.println((PL+MI)/2+" "+(PL-MI)/2 );
		}
	}

}
// ���� 2 : 1 => �� 3 �� 1  |  ���� 3 : 2 => �� 5 �� 1  
// ���� 5 : 2 => �� 7 �� 3  | ���� 13 : 9 => �� 22 �� 4

// =>> ū ���ھ�� (�� + ��)/2 �ϸ� ����  // ���� ���ھ�� (�� - ��)/2
// �� ������ ��� ����̸� �����̴�. 

// ���� ������ ��� PL = A+B / MI = A - B
// 2A = PL+MI => A = (PL+MI)/2
// 2B = PL-MI => B = (PL-MI)/2