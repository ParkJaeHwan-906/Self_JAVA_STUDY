package BronzeIV;

import java.io.*;

public class N_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		while(true) {
		if(year%4==0) {
			// 4�� ����϶�
			if(year%100==0) {
				if(year%400==0) {
					// 4 , 100, 400 �� ���
					// ���� 
					System.out.println(1);
					break;
				}
				// 4�� ����̸鼭 100�� ����϶�
				// ���� �ƴ�
				System.out.println(0);
				break;
			}
			else {
				// 4�� ����̸� 100�� ����� �ƴҶ� 
				System.out.println(1);
				break;
			}
		}
		else {
			if(year%400==0) {
				System.out.println(1);
				break;
			}
			else {
				System.out.println(0);
				break;
			}
		}
	}
	}

}
// ����
/*
 * 4�� ����̸鼭 100�� ����� �ƴҶ� �Ǵ� 400�� ����� ��
 * 2012 ���� 4�� ����̸鼭 100�� ����� �ƴ϶� ����
 * 1900 ���� 100�� ����̰� 400�� ����� �ƴ϶� ������ �ƴ� 
 * 2000 ���� 400�� ����� ���� 
 * �� 4�� ����̸� 100�� ����� �ƴϰų�
 * 4�� ����̰�100�� ����̸鼭 400�� ����̸� ���� 
 */
