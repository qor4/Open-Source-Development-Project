package assignment;
import java.util.Scanner;

public class Chapter2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
		Scanner circle_1 = new Scanner(System.in);
		int x_1 = circle_1.nextInt();
		int y_1 = circle_1.nextInt();
		int rad_1 = circle_1.nextInt();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�>>");
		Scanner circle_2 = new Scanner(System.in);
		int x_2 = circle_1.nextInt();
		int y_2 = circle_1.nextInt();
		int rad_2 = circle_1.nextInt();
		
		if (((x_1 - x_2) * (x_1 - x_2) + (y_1 - y_2) * (y_1 - y_2)) < ((rad_1 + rad_2) * (rad_1 + rad_2)))
		{
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else
		{
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		circle_1.close();
		circle_2.close();

	}

}
