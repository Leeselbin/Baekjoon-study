package Array;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		System.out.print(" 테스트케이스 입력하시오 : ");
		Scanner input = new Scanner(System.in);	
		
		int testcase = input.nextInt();
		double sum = 0;
		
		for(int i=0; i < testcase; i++)
		{
			int num = input.nextInt();
			sum += num;
		}
		
		System.out.println("평균 : " + (sum/testcase));
		
			
		}

}
