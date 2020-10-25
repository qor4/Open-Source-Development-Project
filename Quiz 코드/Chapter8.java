package assignment;
import java.io.*;
import java.util.Scanner;
import java.lang.String;


public class Chapter8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		String file_name, search_name, stop;
		System.out.print("��� ���ϸ� �Է�>>");
		file_name = sc.nextLine();
		File fin = new File(file_name);
		while(true) {
			System.out.print("�˻��� �ܾ ����>>");
			search_name = sc.nextLine();
			if(search_name.equals("�׸�")) {
				break;
			}
			int c = 0;
			try {
				FileReader fs = new FileReader(fin);
				BufferedReader in = new BufferedReader(fs);
				String str = null;
				while((str = in.readLine()) != null) {
					c += 1;
					if(str.contains(search_name)) {
						System.out.println(c + ": " + str);
					}
				}
				in.close();
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("���α׷��� �����մϴ�.");
	}
}
