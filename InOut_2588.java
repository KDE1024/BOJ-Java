package in_and_out;

import java.io.IOException;
import java.util.Scanner;

public class InOut_2588 {

	public static void main(String[] args) throws IOException {
		/*
			476   A��
		  x 385   B��
		    ----
		    2380
		   3808
		  1428
		  ------
		  183260   
		*/
		
		System.out.println("�ڿ��� ���ڸ��� �Է����ּ���.");
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //A���� int��
		String B = in.next(); //B���� String����
		
		in.close();
		
		System.out.println(A * (B.charAt(2)-'0'));
		System.out.println(A * (B.charAt(1)-'0'));
		System.out.println(A * (B.charAt(0)-'0'));
		System.out.println(A * Integer.parseInt(B));
	}//main

}//class
