package BronzeIV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class N_5893 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		BigInteger n = new BigInteger(N,2); // 2진수 입력을 10진수로 변환 
		n = n.multiply(BigInteger.valueOf(17));
		System.out.println(n.toString(2));
	}

}
// 입력받은 2진수 N을 10진수로 변환 후 17을 곱해준다 그 후 다시 2진수로 변환한다. 
/* 함수사용
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer N = new StringBuffer(br.readLine());
		N.reverse();
		 // 이진수 입력 받음 
		long sum=0;
		for(int i=0; i<N.length(); i++) {
			long x = Long.parseLong(N.substring(i,i+1));
			sum += Math.pow(2, i)*x;
		}
		sum = sum*17;
		System.out.println(Long.toBinaryString(sum));
	}
*/

// 문자열로 계산 해야하는거 같다. 



/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuffer N = new StringBuffer(br.readLine());
N.reverse();
 // 이진수 입력 받음 
BigInteger sum= BigInteger.valueOf(0);
for(int i=0; i<N.length(); i++) {
	BigInteger x = new BigInteger(N.substring(i,i+1));
	//sum += Math.pow(2, i)*x;
	sum = sum.add(x.multiply(BigInteger.valueOf((long) Math.pow(2, i))));
}
sum = sum.multiply(BigInteger.valueOf(17));

System.out.println();
*/