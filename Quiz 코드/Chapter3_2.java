package assignment;
import java.util.Scanner;
import java.util.Random;

public class Chapter3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String user;
		String computer[] = {"����", "����", "��"};
		int index;
		do {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			user = scanner.next();
			index = random.nextInt(3); 
			if(user.equals("����")) {
				if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
				else if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
				else if(computer[index].equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �̰���ϴ�.");
				}
			}
			if(user.equals("����")) {
				if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �̰���ϴ�.");
				}
				else if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
				else if(computer[index].equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
			}
			if(user.equals("��")) {
				if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
				else if(computer[index].equals("����")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �̰���ϴ�.");
				}
				else if(computer[index].equals("��")) {
					System.out.println("����� = " + user + ", ��ǻ�� = " + computer[index] + ", �����ϴ�.");
				}
			}
		}while(!user.equals("�׸�"));
		System.out.print("������ �����մϴ�...");
		scanner.close();

	}

}
