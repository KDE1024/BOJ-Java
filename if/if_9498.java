package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_9498 {
		
	public static void main(String[] args) throws IOException {
		
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C,
		//60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		
		System.out.println("시험 점수를 입력해주세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		/*
		// 삼항연산자,,,,,
		System.out.println(
		(score>=90)?"A": (score>=80)?"B": (score>=70)?"C":(score>=60)?"D":"F"		
		);
		*/
		
		if(score>89) {System.out.println("A");}
		else if(score>79) {System.out.println("B");}
		else if(score>69) {System.out.println("C");}
		else if(score>59) {System.out.println("D");}
		else {System.out.println("F");};
		
		
	}//main
		
}//class
