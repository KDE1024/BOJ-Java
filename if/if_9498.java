package If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class if_9498 {
		
	public static void main(String[] args) throws IOException {
		
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C,
		//60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		System.out.println("���� ������ �Է����ּ���.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score = Integer.parseInt(br.readLine());
		
		/*
		// ���׿�����,,,,,
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
