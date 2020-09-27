package assignment;
import java.util.Scanner;

class Seat {
	public static String seat_s[] = new String[10];
	public static String seat_a[] = new String[10];
	public static String seat_b[] = new String[10];
	
	public Seat() {
		for(int i = 0; i < 10; i++)
		{
			seat_s[i] = "---";
			seat_a[i] = "---";
			seat_b[i] = "---";
		}
	}
}
class Reservation {
	Scanner scanner = new Scanner(System.in);
	Error err = new Error();
	Seat seat = new Seat();
	private int num_seat;
	private int input_seat() {
		do{
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			num_seat = scanner.nextInt();
			if(1 > num_seat || 3 < num_seat) {
				err.no_menu();
			}
		}while(1 > num_seat || 3 < num_seat);
		
		return num_seat;
	}
	public void inputdata() {
		num_seat = input_seat();
		int num;
		if(num_seat == 1)
		{
			System.out.print("S>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_s[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
			do{
				System.out.print("��ȣ>>");
				num = scanner.nextInt();
				if(1 > num || 10 < num) {
					err.no_num();
				}
			}while(1 > num || 10 < num);
			seat.seat_s[num - 1] = input_name;
		}
		else if(num_seat == 2)
		{
			System.out.print("A>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_a[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
			do{
				System.out.print("��ȣ>>");
				num = scanner.nextInt();
				if(1 > num || 10 < num) {
					err.no_num();
				}
			}while(1 > num || 10 < num);
			seat.seat_a[num - 1] = input_name;
		}
		else if(num_seat == 3)
		{
			System.out.print("B>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_b[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
			do{
				System.out.print("��ȣ>>");
				num = scanner.nextInt();
				if(1 > num || 10 < num) {
					err.no_num();
				}
			}while(1 > num || 10 < num);
			seat.seat_b[num - 1] = input_name;
		}

	}
}

class Inquiry {
	Seat seat = new Seat();
	
	public void print_seat() {
		System.out.print("S>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat.seat_s[i] + " ");
		}
		System.out.println("");
		System.out.print("A>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat.seat_a[i] + " ");
		}
		System.out.println("");
		System.out.print("B>> ");
		for(int i = 0; i < 10; i++) {
			System.out.print(seat.seat_b[i] + " ");
		}
		System.out.println("");
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
}

class Cancel {
	Scanner scanner = new Scanner(System.in);
	Error err = new Error();
	Seat seat = new Seat();
	private int num_seat;
	private int input_seat() {
		do{
			System.out.print("�¼����� S(1), A(2), B(3)>>");
			num_seat = scanner.nextInt();
			if(1 > num_seat || 3 < num_seat) {
				err.no_menu();
			}
		}while(1 > num_seat || 3 < num_seat);
		
		return num_seat;
	}
	public void canceldata() {
		num_seat = input_seat();
		boolean exist = false;
		
		if(num_seat == 1)
		{
			System.out.print("S>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_s[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
		
			for(int i = 0; i < 10; i++) {
				if(seat.seat_s[i].equals(input_name)) {
					exist = true;
					seat.seat_s[i] = "---";
				}
			}
		}
		else if(num_seat == 2)
		{
			System.out.print("A>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_a[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
			for(int i = 0; i < 10; i++) {
				if(seat.seat_a[i].equals(input_name)) {
					exist = true;
					seat.seat_a[i] = "---";
				}
			}
		}
		else if(num_seat == 3)
		{
			System.out.print("B>> ");
			for(int i = 0; i < 10; i++) {
				System.out.print(seat.seat_b[i] + " ");
			}
			System.out.println("");
			System.out.print("�̸�>>");
			String input_name = scanner.next();
			
			for(int i = 0; i < 10; i++) {
				if(seat.seat_b[i].equals(input_name)) {
					exist = true;
					seat.seat_b[i] = "---";
				}
			}
		}
		if(exist == false)
		{
			err.no_name();
		}

	}
}

class Error {
	void no_name() {
		System.out.println("���� �̸��Դϴ�.");
	}
	void no_num() {
		System.out.println("���� ��ȣ�Դϴ�.");
	}
	void no_menu() {
		System.out.println("���� �޴��Դϴ�.");
	}
	void no_cencel() {
		System.out.println("�߸��� ����Դϴ�.");
	}
}
public class Chapter4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Seat seat = new Seat();
		Reservation res = new Reservation();
		Inquiry inq = new Inquiry();
		Cancel canc = new Cancel();
		Error err = new Error();
		int num_menu;
		
		while(true) {
			System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			
			num_menu = scanner.nextInt();
			
			if(num_menu == 1)
			{
				res.inputdata();
				
			}
			else if(num_menu == 2)
			{
				inq.print_seat();
			}
			else if(num_menu == 3)
			{
				canc.canceldata();
			}
			else if(num_menu == 4)
			{
				System.exit(0);
			}
			else
			{
				err.no_menu();
			}
		}
		


	}

}

