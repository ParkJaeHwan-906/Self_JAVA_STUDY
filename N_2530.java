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
		// A는 시간 B는 분 C는 초
		int D = Integer.parseInt(br.readLine());
		// D는 걸리는 시간
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
// 24시간이 남을 경우 24를 빼주는 것이 아닌 24로 나눈 나머지를 사용!!!!!!