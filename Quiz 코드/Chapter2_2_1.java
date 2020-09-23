package assignment;
import java.util.Scanner;

public class Chapter2_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연산>>");
		Scanner operation = new Scanner(System.in);
		double num_1 = operation.nextDouble();
		String operator = operation.next();
		double num_2 = operation.nextDouble();
		
		
		//문자열을 비교할 땐 문자열변수.equals("비교할 문자열")
		if (operator.equals("+"))
		{
			System.out.println(num_1 + operator + num_2 + "의 계산 결과는 " + (num_1 + num_2));
		}
		else if (operator.equals("-"))
		{
			System.out.println(num_1 + operator + num_2 + "의 계산 결과는 " + (num_1 - num_2));
		}
		else if (operator.equals("*"))
		{
			System.out.println(num_1 + operator + num_2 + "의 계산 결과는 " + (num_1 * num_2));
		}
		else if (operator.equals("/"))
		{
			if (num_2 == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.println(num_1 + operator + num_2 + "의 계산 결과는 " + (num_1 / num_2));
			}
		}



	}

}
