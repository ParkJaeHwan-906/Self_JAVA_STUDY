package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N_1297 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // �밢�� ����
		int A = Integer.parseInt(st.nextToken()); // ���� ����
		int B = Integer.parseInt(st.nextToken()); // �ʺ� ���� 
		
		double c = Math.sqrt(Math.pow(A,2)+Math.pow(B, 2));
		// �밢�� ���� ���ϱ� 
		
		System.out.println((int)(A*(C/c))+" "+(int)(B*(C/c)));
				
	}

}
// ��Ÿ����� ���� ��� C^2 = A^2 + B^2
// ���⼭ �츮���� �־����� �밢�� ���̿� ���� ���� �ʺ� ���� 
// ������ ��� �������? 
// => �밢���� ������ ���Ѵ�. 
// �밢�� ���� => ��Ÿ��󽺿� ���� ���� 