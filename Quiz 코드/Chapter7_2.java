package assignment;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;


public class Chapter7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nation = new HashMap<String, String>();
		nation.put("����", "������");
		nation.put("�߽���", "�߽��ڽ�Ƽ");
		nation.put("����", "����");
		nation.put("���þ�", "��ũ��");
		nation.put("�밡��", "�δ��佺Ʈ");
		nation.put("�ʶ���", "���Ű");
		nation.put("����Ʈ", "ī�̷�");
		nation.put("�Ϻ�", "����");
		nation.put("�±�", "����");

		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		int menu_exit = 0;
		int menu;
		while(menu_exit != 1) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			menu = sc.nextInt();
			if(menu == 1) {
				String input_country, input_capital;
				boolean contain = false;
				System.out.println("���� " + nation.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while(true) {
					System.out.print("����� ���� �Է�" + (nation.size() + 1) + ">> ");
					input_country = sc.next();
					if(input_country.equals("�׸�")) {
						break;
					}
					input_capital = sc.next();
					contain = nation.containsKey(input_country);
					if(contain == true) {
						System.out.println(input_country + "�� �̹� �ֽ��ϴ�!");
						contain = false;
					}
					else {
						nation.put(input_country, input_capital);
						
					}
					
				}
			}
			else if(menu == 2) {
				String quiz_country, quiz_capital, answer;
				int index;
				Set<String> keys = nation.keySet();
				Iterator<String> it = keys.iterator();
				while(true) {
					quiz_country = it.next();
					quiz_capital = nation.get(quiz_country);
					System.out.print(quiz_country + "�� ������? ");
					answer = sc.next();
					if (it.hasNext() == false)
						it = keys.iterator();
					if(answer.equals(quiz_capital)) {
						System.out.println("����!!");
					}
					else if(answer.equals("�׸�")) {
						break;
					}
					else {
						System.out.println("�ƴմϴ�!!");
					}
				}
				
			}
			else if(menu == 3) {
				System.out.println("������ �����մϴ�.");
				menu_exit = 1;
			}
		}

	}

}
