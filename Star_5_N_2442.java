package WEEK_1;

import java.io.*;

public class Star_5_N_2442 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		for(int i=1; i<=N; i++) {
			for(int j=0; j<N-i; j++) {
				bw.write(" ");
			}
			for(int j=0; j< i*2-1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
	}

}
