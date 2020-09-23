package assignment;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Chapter3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n * m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();
				//nextLine() - '\n'을 포함하는 한 라인을 읽고 '\n'을 버린 나머지 문자열 리턴
				//을 사용하여 이전에 입력받았던 값을 버퍼에서 삭제
				continue;
			}
		}
		scanner.close();
	}

}
