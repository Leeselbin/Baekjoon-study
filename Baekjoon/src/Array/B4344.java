package Array;

import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) {
		System.out.print("테스트케이스 입력 : ");
		Scanner input = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = input.nextInt();
		
		for(int i=0; i < testcase; i++)
		{
			int N = input.nextInt(); // 학생수  
			arr = new int[N];
			
			double sum = 0; //성적 합 
			
			for(int j=0; j < N; j++)
			{
				int num  = input.nextInt();
				arr[j] = num;
				sum += num;
			}
			
			double average = (sum / N);
			double count = 0; //평균 넘는 학생 수 변수 
			
			for(int j=0; j<N; j++)
			{
				if(arr[j] > average)
				{
					count++;
				}
			}
			System.out.println(""+ (count/N)*100);
			
		}
		input.close();
	}

}
