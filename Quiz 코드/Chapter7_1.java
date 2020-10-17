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
		nation.add(new Nation("독일", "베를린"));
		nation.add(new Nation("멕시코", "멕시코시티"));
		nation.add(new Nation("영국", "런던"));
		nation.add(new Nation("러시아", "모스크바"));
		nation.add(new Nation("헝가리", "부다페스트"));
		nation.add(new Nation("필란드", "헬싱키"));
		nation.add(new Nation("이집트", "카이로"));
		nation.add(new Nation("일본", "도쿄"));
		nation.add(new Nation("태국", "방콕"));

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
					for(int i = 0; i < nation.size(); i++) {
						if(input_country.equals((nation.get(i)).country)) {
							contain = true;
						}
					}
					if(contain == true) {
						System.out.println(input_country + "는 이미 있습니다!");
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
					System.out.print(quiz_country + "의 수도는? ");
					answer = sc.next();
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
