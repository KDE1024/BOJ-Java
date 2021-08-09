package boj_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class if_1330 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int A;
		int B;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		A = Integer.parseInt(st.nextToken()) ;
		B = Integer.parseInt(st.nextToken()) ;
		if(A>B) {
			System.out.println(">");
		}
		if(A<B) {
			System.out.println("<");
		}
		if(A==B) {
			System.out.println("==");
		}

	}

}