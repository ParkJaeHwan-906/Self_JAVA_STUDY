package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N_3004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(((N/2)+1)*((N-N/2)+1));
	}

}
// ������ ���ذ� �ȵǴµ�?
// ü������ �ִ� N�� �ڸ��� �ִ�. ���⼭ N�� �츮�� �Է� �޴� �� �̴�. 
// ���� �����ϰԸ� �ڸ��� ������ �ڸ� ���� ü������ �� ���� ���� ������ �ٸ��� ������ �߶���Ѵ�.
// �־��� N�� 2�� ���� ��+1 �� ���η� �����ϰ� ������ ��
// N - ���η� ���� �� +1 �� ���η� ������ �� 