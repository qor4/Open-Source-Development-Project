package assignment;
import java.util.Vector;
import java.util.Scanner;

class Nation {
	public String country;
	public String capital;
	Nation(String country, String capital){
		this.country = country;
		this.capital = capital;
	}
}
public class Chapter7_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Nation> nation = new Vector<Nation>();
		nation.add(new Nation("����", "������"));
		nation.add(new Nation("�߽���", "�߽��ڽ�Ƽ"));
		nation.add(new Nation("����", "����"));
		nation.add(new Nation("���þ�", "��ũ��"));
		nation.add(new Nation("�밡��", "�δ��佺Ʈ"));
		nation.add(new Nation("�ʶ���", "���Ű"));
		nation.add(new Nation("����Ʈ", "ī�̷�"));
		nation.add(new Nation("�Ϻ�", "����"));
		nation.add(new Nation("�±�", "����"));

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
					for(int i = 0; i < nation.size(); i++) {
						if(input_country.equals((nation.get(i)).country)) {
							contain = true;
						}
					}
					if(contain == true) {
						System.out.println(input_country + "�� �̹� �ֽ��ϴ�!");
						contain = false;
					}
					else {
						nation.add(new Nation(input_country, input_capital));
						
					}
					
				}
			}
			else if(menu == 2) {
				String quiz_country, quiz_capital, answer;
				int index;
				while(true) {
					index = (int)(Math.random() * nation.size());
					quiz_country = (nation.get(index)).country;
					quiz_capital = (nation.get(index)).capital;
					System.out.print(quiz_country + "�� ������? ");
					answer = sc.next();
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
