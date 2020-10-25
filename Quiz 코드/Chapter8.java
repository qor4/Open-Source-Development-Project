package assignment;
import java.io.*;
import java.util.Scanner;
import java.lang.String;


public class Chapter8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		String file_name, search_name;
		System.out.print("대상 파일명 입력>>");
		file_name = sc.nextLine();
		File fin = new File(file_name);
		while(true) {
			System.out.print("검색할 단어나 문장>>");
			search_name = sc.nextLine();
			if(search_name.equals("그만")) {
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
		System.out.print("프로그램을 종료합니다.");
	}
}
