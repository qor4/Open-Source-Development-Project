package assignment;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;


public class Chapter7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> nation = new HashMap<String, String>();
		nation.put("독일", "베를린");
		nation.put("멕시코", "멕시코시티");
		nation.put("영국", "런던");
		nation.put("러시아", "모스크바");
		nation.put("헝가리", "부다페스트");
		nation.put("필란드", "헬싱키");
		nation.put("이집트", "카이로");
		nation.put("일본", "도쿄");
		nation.put("태국", "방콕");

		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		int menu_exit = 0;
		int menu;
		while(menu_exit != 1) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			menu = sc.nextInt();
			if(menu == 1) {
				String input_country, input_capital;
				boolean contain = false;
				System.out.println("현재 " + nation.size() + "개 나라와 수도가 입력되어 있습니다.");
				while(true) {
					System.out.print("나라와 수도 입력" + (nation.size() + 1) + ">> ");
					input_country = sc.next();
					if(input_country.equals("그만")) {
						break;
					}
					input_capital = sc.next();
					contain = nation.containsKey(input_country);
					if(contain == true) {
						System.out.println(input_country + "는 이미 있습니다!");
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
					System.out.print(quiz_country + "의 수도는? ");
					answer = sc.next();
					if (it.hasNext() == false)
						it = keys.iterator();
					if(answer.equals(quiz_capital)) {
						System.out.println("정답!!");
					}
					else if(answer.equals("그만")) {
						break;
					}
					else {
						System.out.println("아닙니다!!");
					}
				}
				
			}
			else if(menu == 3) {
				System.out.println("게임을 종료합니다.");
				menu_exit = 1;
			}
		}

	}

}
