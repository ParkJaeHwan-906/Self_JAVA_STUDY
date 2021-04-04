package WEEK_1;

import java.util.Scanner;

public class SMALLER_THAN_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X=sc.nextInt();
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			if(array[i] < X) {
				System.out.print(array[i]+" ");
			}
		}
		sc.close();
	}

}
