package BronzeIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N_1212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 8���� �Է� 
		StringBuilder sb = new StringBuilder();
		if(str.equals("0")) {
			System.out.println(0);
		}
		else {
		for(int i=0; i<str.length(); i++) {
			int N = Integer.parseInt(str.substring(i,i+1));
			// str�� i��°���� i+1 ������ ���� �� i��° �ڸ� ����
			if(i==0) {
				if(N==1) {
				sb.append("1");	
				}
				else if(N==2) {
				sb.append("10");
				}
				else if(N==3) {
				sb.append("11");
				}
				else if(N==4) {
				sb.append("100");
				}
				else if(N==5) {
				sb.append("101");	
				}
				else if(N==6) {
				sb.append("110");
				}
				else if(N==7) {
				sb.append("111");	
				}
			}
			else {
				if(N==0) {
					sb.append("000");
				}
			    else if(N==1) {
				sb.append("001");	
				}
				else if(N==2) {
				sb.append("010");
				}
				else if(N==3) {
				sb.append("011");
				}
				else if(N==4) {
				sb.append("100");
				}
				else if(N==5) {
				sb.append("101");	
				}
				else if(N==6) {
				sb.append("110");
				}
				else if(N==7) {
				sb.append("111");	
				}
			}
		}
		}
		System.out.println(sb);
	}
}
// ��ó�� 8������ �ϳ��ϳ��� ���ڿ��� ������  ���ǹ��� Ȱ���� �� ���� �´� 2���� ���� ���� 