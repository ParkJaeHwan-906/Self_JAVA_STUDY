package WEEK_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YUN_YEAR {

	public static void main(String[] args) throws IOException{
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
	


