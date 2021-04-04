package WEEK_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Star_4_N_2441 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < n - i + 1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
		bw.flush();
	}

}
