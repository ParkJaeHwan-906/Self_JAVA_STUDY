package BronzeIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N_5893 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		BigInteger n = new BigInteger(N,2); // 2���� �Է��� 10������ ��ȯ 
		n = n.multiply(BigInteger.valueOf(17));
		System.out.println(n.toString(2));
	}

}
// �Է¹��� 2���� N�� 10������ ��ȯ �� 17�� �����ش� �� �� �ٽ� 2������ ��ȯ�Ѵ�. 
/* �Լ����
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer N = new StringBuffer(br.readLine());
		N.reverse();
		 // ������ �Է� ���� 
		long sum=0;
		for(int i=0; i<N.length(); i++) {
			long x = Long.parseLong(N.substring(i,i+1));
			sum += Math.pow(2, i)*x;
		}
		sum = sum*17;
		System.out.println(Long.toBinaryString(sum));
	}
*/

// ���ڿ��� ��� �ؾ��ϴ°� ����. 



/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuffer N = new StringBuffer(br.readLine());
N.reverse();
 // ������ �Է� ���� 
BigInteger sum= BigInteger.valueOf(0);
for(int i=0; i<N.length(); i++) {
	BigInteger x = new BigInteger(N.substring(i,i+1));
	//sum += Math.pow(2, i)*x;
	sum = sum.add(x.multiply(BigInteger.valueOf((long) Math.pow(2, i))));
}
sum = sum.multiply(BigInteger.valueOf(17));

System.out.println();
*/