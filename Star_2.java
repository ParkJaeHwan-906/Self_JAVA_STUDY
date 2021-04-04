package WEEK_1;

import java.util.Scanner;

public class Star_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int x=1; x<=N; x++) {
			for(int y=N; y>x; y--) {
				System.out.print(" ");
			}
			for(int z=0; z<x; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
