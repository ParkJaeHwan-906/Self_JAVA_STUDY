package WEEK_1;

import java.io.*;

public class Star_6_N_2443 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			for(int j=1; j<i+1; j++) {
				bw.write(" ");
			}
			for(int j=0; j < 2*(N-i)-1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
