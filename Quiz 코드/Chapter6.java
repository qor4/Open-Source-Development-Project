package assignment;
import java.util.Scanner;

class Person {
	private String name;
	Scanner sc = new Scanner(System.in);
	public void setname() {
		name = sc.next();
	}
	public String getname() {
		return name;
	}
}

public class Chapter6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person player1 = new Person();
		Person player2 = new Person();
		int end = 0;
		int turn = 1;
		int i;
		int num[] = {-1, -2, -3};
		System.out.print("1번째 선수 이름>>");
		player1.setname();
		System.out.print("2번째 선수 이름>>");
		player2.setname();
		while(end == 0) {
			if(turn == 1) {
				System.out.print("[" + player1.getname() + "]:<Enter>");
			}
			else {
				System.out.print("[" + player2.getname() + "]:<Enter>");
			}
			sc.nextLine();
			System.out.print("      ");
			for(i = 0; i < 3; i++) {
				num[i] = (int)(Math.random() * 3 + 1);
				System.out.print(num[i] + "  ");
			}
			if(num[0] == num[1] && num[1] == num[2]) {
				end = 1;
				if(turn == 1) {
					System.out.print(player1.getname() + "님이 이겼습니다!");
				}
				else {
					System.out.print(player2.getname() + "님이 이겼습니다!");
				}
			}
			else {
				turn *= -1;
				System.out.println("아쉽군요!");
			}
		}
	}
}
