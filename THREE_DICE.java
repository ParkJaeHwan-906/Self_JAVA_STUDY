package WEEK_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class THREE_DICE {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
		}
		if(arr[0]==arr[1]) {
			if(arr[0]==arr[2]) {
				// 3개가 같은 눈
				System.out.println(10000+arr[0]*1000);
			}
			else {
				// 2개만 같은 눈 
				System.out.println(1000+arr[0]*100);
			}
		}
		else if(arr[0]==arr[2]) {
			// 2개 눈 같은 경우 
			System.out.println(1000+arr[0]*100);
		}
		else if(arr[1]==arr[2]) {
			// 2개 눈 같은 경우 
			System.out.println(1000+arr[1]*100);
		}
		else {
			int max = 0;
			// 3개 눈 다 다른 경우 
			for(int i : arr) {
				max = Math.max(max, i);
			}
			System.out.println(max*100);
		}
	}

}
