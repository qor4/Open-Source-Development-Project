package assignment;
import java.util.Scanner;
import java.util.Random;

public class Chapter3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String user;
		String computer[] = {"가위", "바위", "보"};
		int index;
		do {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			user = scanner.next();
			index = random.nextInt(3); 
			if(user.equals("가위")) {
				if(computer[index].equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 비겼습니다.");
				}
				else if(computer[index].equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 졌습니다.");
				}
				else if(computer[index].equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 이겼습니다.");
				}
			}
			if(user.equals("바위")) {
				if(computer[index].equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 이겼습니다.");
				}
				else if(computer[index].equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 비겼습니다.");
				}
				else if(computer[index].equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 졌습니다.");
				}
			}
			if(user.equals("보")) {
				if(computer[index].equals("가위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 졌습니다.");
				}
				else if(computer[index].equals("바위")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 이겼습니다.");
				}
				else if(computer[index].equals("보")) {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + computer[index] + ", 비겼습니다.");
				}
			}
		}while(!user.equals("그만"));
		System.out.print("게임을 종료합니다...");
		scanner.close();

	}

}
