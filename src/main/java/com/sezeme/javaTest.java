package com.sezeme;

public class javaTest {
    /*
    1. public > protected > default > private

    2-1. 모든 클래스에서 사용 가능 / 패키지 밖에서 import하여 사용가능
    2-2. 같은 패키지 및 다른 패키지의 자식 클래스에서 사용 가능
    2-3. 같은 패키지에서 사용 가능
    2-4. 동일 클래스의 멤버만 사용 가능

    3. 2, 4 / 리턴 타입과 접근 제어자는 다르면 안됨!!

    4. ?? final int NUM = 100;
        or
       final int NUM;
       클래스생성자() {
            NUM = 100;
       }

    5. 1 - 4 - 2 - 3 / 초기화 블럭이 앞 순서이다.

    6. 3

    7. 1

    8.
    지역변수 : 정의될 때 / 중괄호 닫힐 때(생성된 지역이 끝날 때)
    인스턴스변수 : 인스턴스가 정의될 때 / 참조하지 않을 시
    정적변수 : 프로그램 시작 시 / 프로그램 종료 시

    9. 3

    10. 2

    11. 메소드

    12. 1

    13. 3,5,6,7

    14. 4

    15. 6

    16.
    true
    true
    false
    false
    true

    17. 캡슐화, 다형성, 상속성

    18. 2

    19-1. import java.lang.*;
    기본생성자, 자동 upcasting, this, super();
    return;
    toString();
    int num = new int; -> num = 0
    19-2. class Test {
                int num;
                void f() { }
            };
          -> Test() { num = 0; }
    19-3. Test test = new Test(); test.f(); -> test.f(this);

    20. static, stack, heap, stack, static


     */
}
