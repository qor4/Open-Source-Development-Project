# 예제 5-1)
Point 클래스 : x, y의 좌표를 변수로 가지고 showPoint() 함수로 좌표를 출력합니다.
ColorPoint 클래스 : Point 클래스를 상속 받은 클래스입니다. 점의 색을 변수로 가지고 showColorPoint() 함수로 점의 색을 출력합니다.
Point 객체의 좌표를 출력하고 Point 객체를 상속받은 ColorPoint 객체를 생성하여 점의 색과 좌표를 출력하는 프로그램입니다.


# 예제 5-2)
Person 클래스 : private 변수 weight와 디폴트, protected, public 변수를 가지고 weight를 설정하는 setWeight(), weight를 리턴하는 getWeight() 함수를 가진 클래스입니다.
Student 클래스 : Person 클래스를 상속 받은 클래스로 set() 함수에서 private 변수인 weight를 제외한 나머지 멤버 변수들을 수정이 가능한 클래스입니다. weight는 Person 클래스의 setWeight()를 통해 weight의 값을 수정합니다.
메인 함수에서는 Student 객체를 생성하고 set() 함수를 호출하는 프로그램입니다.

# 예제 5-3)
Point 클래스 : x, y의 좌표를 변수로 가지고 showPoint() 함수로 좌표를 출력합니다.
ColorPoint 클래스 : Point 클래스를 상속 받은 클래스입니다. 생성자에 super()를 사용하여 Point의 생성자 Point(x, y)를 호출하고 점의 색을 변수로 가지고 showColorPoint() 함수로 점의 색을 출력합니다.
super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하고 출력하는 프로그램입니다.

# 예제 5-4)

![image](https://user-images.githubusercontent.com/58421346/95018879-3f814280-069d-11eb-97da-814a674ade3a.png)

위와 같은 구조로 상속되어 있는 클래스들을 instanceof 연산자를 이용하여 레퍼런스가 가리키는 객체의 타입을 출력하는 프로그램입니다.

# 예제 5-5)

![image](https://user-images.githubusercontent.com/58421346/95018884-4314c980-069d-11eb-9993-1c642b1ff320.png)

위와 같은 구조로 상속되어 있는 클래스들이 있고 각 클래스마다 다른 출력 값을 가지는 함수 draw()를 정의합니다. 그리고 메인 함수에서 각 객체의 draw() 함수를 호출하여 다른 값들을 출력하는 프로그램입니다.

# 예제 5-6)
Weapon 클래스 : 1을 반환하는 함수 fire()을 가집니다.
Cannon 클래스 : Weapon 클래스를 상속받은 클래스로 함수 fire()을 오버라이딩하여 10을 반환합니다.
메인 함수에서 Weapon 클래스와 Cannon 클래스의 fire() 함수를 각각 출력하여 기본 무기와 대포의 살상 능력을 보여주는 프로그램입니다.

# 예제 5-7)
Calculator 클래스 : 추상클래스로 추상 메소드 add(), subtract(), average()를 가집니다.
Chapter5_7 클래스 : 추상클래스 Calculator를 상속받아 add(), subtract(), average()를 구현하고 메인 함수를 실행합니다.
Chapter5_7 객체를 생성하여 add(), subtract(), average()를 각각 실행하여 결과를 출력하는 프로그램입니다.

# 예제 5-8)
PhoneInterface 인터페이스 : 상수 필드 TIMEOUT과 추상 메소드 sendCall(), receiveCall(), default 메소드 printLogo()를 선언합니다.
SansungPhone 클래스 : PhoneInterface 인터페이스를 상속받은 클래스입니다. PhoneInterface 인터페이스의 모든 메소드를 구현하고 새로운 메소드를 추가로 작성하였습니다.
메인 함수에서 각 메소드들을 호출하여 각 메소드들이 실행되는 프로그램입니다.

# 예제 5-9)
PhoneInterface 인터페이스 : 상수 필드 TIMEOUT과 추상 메소드 sendCall(), receiveCall(), default 메소드 printLogo()를 선언합니다.
MobilePhoneInterface 클래스 : PhoneInterface 인터페이스를 상속받은 클래스로 sendSMS(), receiveSMS() 메소드를 가집니다. 
MP3Interface 인터페이스 : play(), stop() 메소드를 가집니다.
PDA 클래스 : x와 y의 합을 리턴하는 calculate() 메소드를 가집니다.
SmartPhone 클래스 : PDA, MobilePhoneInterface, MP3Interface를 상속받은 클래스로 추상 메소드를 구현하고 추가로 메소드를 작성한 클래스입니다.
메인 함수에서 SmartPhone 객체를 생성하여 메소드들을 호출하여 각 메소드들이 실행되는 프로그램입니다.
