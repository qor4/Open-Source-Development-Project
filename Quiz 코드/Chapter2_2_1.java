package assignment;
import java.util.Scanner;

public class Chapter2_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����>>");
		Scanner operation = new Scanner(System.in);
		double num_1 = operation.nextDouble();
		String operator = operation.next();
		double num_2 = operation.nextDouble();
		
		
		//���ڿ��� ���� �� ���ڿ�����.equals("���� ���ڿ�")
		if (operator.equals("+"))
		{
			System.out.println(num_1 + operator + num_2 + "�� ��� ����� " + (num_1 + num_2));
		}
		else if (operator.equals("-"))
		{
			System.out.println(num_1 + operator + num_2 + "�� ��� ����� " + (num_1 - num_2));
		}
		else if (operator.equals("*"))
		{
			System.out.println(num_1 + operator + num_2 + "�� ��� ����� " + (num_1 * num_2));
		}
		else if (operator.equals("/"))
		{
			if (num_2 == 0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else
			{
				System.out.println(num_1 + operator + num_2 + "�� ��� ����� " + (num_1 / num_2));
			}
		}



	}

}
