package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class N_5543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] Burger = new int[3];
		int[] Beverage = new int[2];
		for(int i=0; i<Burger.length; i++) {
			Burger[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<Beverage.length; i++) {
			Beverage[i] = Integer.parseInt(br.readLine());
		}
		int[] setPrice = new int[6];
		int i=0;
		for(int x=0; x<Burger.length; x++) {
			for(int y=0; y<Beverage.length; y++) {
				setPrice[i] = Burger[x]+Beverage[y]-50;
				i++;
			}
		}
		Arrays.sort(setPrice);
		System.out.println(setPrice[0]);
		
	}

}
