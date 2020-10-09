# 6장 갬블링 게임
---
Chapter6의 문제를 해결하기 위해 Person 클래스를 선언하고 기본 클래스 Chapter6 클래스에서 main 함수를 실행하였습니다.

 Person 클래스 : private 멤버 변수 String name을 선언하였습니다. 다른 클래스에서 변수 name에 접근하기 위해서는 public 메소드 setname()과 getname()을 이용하여야 합니다. 
 setname()은 사용자에게 문자열을 입력받아 변수 name에 저장합니다. getname()은 main 함수에서 Person 객체의 name을 얻기 위해서 name을 return 합니다.

 게임이 시작되면 두 player의 이름을 번갈아 출력하며 사용자가 Enter 키를 입력했을 때, 랜덤으로 1-3까지의 세 개의 숫자가 생성됩니다. 
 또한 세 개의 숫자가 모두 일치하는 player가 나오면 게임을 종료합니다. 
 
 이러한 겜블링 게임을 구현하기 위해서 main 함수를 실행했을 때, Person 객체 player1과 player2가 생성이 되고 두 player의 이름을 setname() 메소드를 통해 입력받습니다.
 그 후 변수 게임의 종료를 결정하는 변수 end, player 순서를 결정하는 turn, 랜덤의 수를 저장할 배열 num을 선언합니다. 
 
 while문을 사용하여 변수 end의 값이 0일 때 반복문을 실행합니다. 이 반복문에서는 turn의 값이 1일 때는 player1, -1일 때 player2의 이름을 출력하고 Scanner의 nextLine() 메소드를 통해 Enter키를 입력받으면 난수가 생성되어 변수 num에 저장됩니다. 
 그 후 num 배열의 모든 원소를 비교하여 모두 일치한다면 player의 이름과 이겼다는 문구가 출력되고 게임이 종료됩니다. 
 만약 일치하지 않는다면 아쉽다는 문구가 출력되고 게임이 계속 진행됩니다.
