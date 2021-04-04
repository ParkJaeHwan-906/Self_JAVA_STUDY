package BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class N_3004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(((N/2)+1)*((N-N/2)+1));
	}

}
// 문제가 이해가 안되는데?
// 체스판을 최대 N번 자를수 있다. 여기서 N은 우리가 입력 받는 수 이다. 
// 변에 평행하게만 자를수 있으며 자를 때는 체스판의 그 변의 한쪽 끝에서 다른쪽 끝까지 잘라야한다.
// 주어진 N을 2로 나눈 값+1 을 가로로 평행하게 나누는 변
// N - 가로로 나눈 변 +1 은 세로로 나누는 변 