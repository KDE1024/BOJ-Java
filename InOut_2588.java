package in_and_out;

import java.io.IOException;
import java.util.Scanner;

public class InOut_2588 {

	public static void main(String[] args) throws IOException {
		/*
			476   A줄
		  x 385   B줄
		    ----
		    2380
		   3808
		  1428
		  ------
		  183260   
		*/
		
		System.out.println("자연수 세자리를 입력해주세요.");
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //A줄은 int로
		String B = in.next(); //B줄은 String으로
		
		in.close();
		
		System.out.println(A * (B.charAt(2)-'0'));
		System.out.println(A * (B.charAt(1)-'0'));
		System.out.println(A * (B.charAt(0)-'0'));
		System.out.println(A * Integer.parseInt(B));
	}//main

}//class
