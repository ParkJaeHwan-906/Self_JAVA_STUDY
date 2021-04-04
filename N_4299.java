package BronzeIV;

import java.io.*;
import java.util.*;

public class N_4299 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int PL = Integer.parseInt(st.nextToken()); // 두 팀 점수의 합
		int MI = Integer.parseInt(st.nextToken()); // 두 팁 점수의 차 
		// 항상 음이 아닌 정수이다.
		
		if((PL+MI)<0 || (PL-MI)<0 || (PL+MI)%2 !=0) {
			System.out.println(-1);
		}
		else {
			System.out.println((PL+MI)/2+" "+(PL-MI)/2 );
		}
	}

}
// 점수 2 : 1 => 합 3 차 1  |  점수 3 : 2 => 합 5 차 1  
// 점수 5 : 2 => 합 7 차 3  | 점수 13 : 9 => 합 22 차 4

// =>> 큰 스코어는 (합 + 차)/2 하면 나옴  // 작은 스코어는 (합 - 차)/2
// 두 점수는 모두 양수이며 정수이다. 

// 연립 방정식 사용 PL = A+B / MI = A - B
// 2A = PL+MI => A = (PL+MI)/2
// 2B = PL-MI => B = (PL-MI)/2