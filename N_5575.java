package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class N_5575 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] result = new int[3];
		for(int i=0; i<3; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken())*3600
				+Integer.parseInt(st.nextToken())*60
				+Integer.parseInt(st.nextToken());
		
		int B = Integer.parseInt(st.nextToken())*3600
				+Integer.parseInt(st.nextToken())*60
				+Integer.parseInt(st.nextToken());
		// A 는 출근시간을 초로 바꾼것 B는 퇴근시간을 초로 바꾼것 
		result[i] = B-A;
		}
		for(int i=0; i<3; i++) {
		System.out.println(result[i]/3600+" "+result[i]%3600/60+" "
		+result[i]%3600%60);
		}
	}

}
