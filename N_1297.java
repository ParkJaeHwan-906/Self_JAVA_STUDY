package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N_1297 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken()); // 대각선 길이
		int A = Integer.parseInt(st.nextToken()); // 높이 비율
		int B = Integer.parseInt(st.nextToken()); // 너비 비율 
		
		double c = Math.sqrt(Math.pow(A,2)+Math.pow(B, 2));
		// 대각선 비율 구하기 
		
		System.out.println((int)(A*(C/c))+" "+(int)(B*(C/c)));
				
	}

}
// 피타고라스의 정의 사용 C^2 = A^2 + B^2
// 여기서 우리에게 주어진건 대각선 길이와 높이 비율 너비 비율 
// 비율을 어떻게 사용하지? 
// => 대각선의 비율울 구한다. 
// 대각선 비율 => 피타고라스와 같은 공식 