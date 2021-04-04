package BronzeIV;

import java.io.*;

public class N_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		while(true) {
		if(year%4==0) {
			// 4의 배수일때
			if(year%100==0) {
				if(year%400==0) {
					// 4 , 100, 400 의 배수
					// 윤년 
					System.out.println(1);
					break;
				}
				// 4의 배수이면서 100의 배수일때
				// 윤년 아님
				System.out.println(0);
				break;
			}
			else {
				// 4의 배수이며 100의 배수가 아닐때 
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
// 윤년
/*
 * 4의 배수이면서 100의 배수가 아닐때 또는 400의 배수일 때
 * 2012 년은 4의 배수이면서 100의 배수가 아니라 윤년
 * 1900 년은 100의 배수이고 400의 배수가 아니라 윤년이 아님 
 * 2000 년은 400의 배수라 윤년 
 * 즉 4의 배수이면 100의 배수가 아니거나
 * 4의 배수이고100의 배수이면서 400의 배수이면 윤년 
 */
