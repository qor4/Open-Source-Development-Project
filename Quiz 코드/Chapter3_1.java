package assignment;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Chapter3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
				//nextLine() - '\n'�� �����ϴ� �� ������ �а� '\n'�� ���� ������ ���ڿ� ����
				//�� ����Ͽ� ������ �Է¹޾Ҵ� ���� ���ۿ��� ����
				continue;
			}
		}
		scanner.close();
	}

}
