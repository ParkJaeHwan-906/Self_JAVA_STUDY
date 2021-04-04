package WEEK_1;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i =1; i<=N; i++){
            for(int z=1; z<=i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
