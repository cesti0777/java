[1]학습목차

1. 상속
	- 클래스 간의 상속관계
	
2. 다형성
	- 상속이 전제인 상태의 구조
	
3. 주의사항
	- jdk1.5 부터 추가된 메카니즘은 정통 학습 직후에만 반영
	
[2]학습내용

1. 객체 생성 순서
	Object -> 부모객체 -> 자식객체 순으로 생성

2. 생각해보기
	1. Child.java 코드 관점에서 id와 pw 변수의 메모리가 생성되는 시점은?
		- id/pw를 실제 보유했던 Parent 객체가 생성될 때 메모리에 사용 가능하게 생성
	2. id와 pw 변수 메모리 개수 몇개?
		- 하나씩
		
3. 암기 사항
	1. java.lang.Object 최상위 root
	2. class는 단일 class만 상속 가능
		단, 수직 관계의 계층 레벨 제한 없음.
	3. ***
		상속 받는 구성 요소는 단 2가지 : 멤버 변수와 메소드
	4. 자식 생성자 호출해서 실행시 내부적으로 자상, 부모, 자식 순으로 객체 생성
		- 생성자 내부에 super([..]) 가 arguement가 일체되는 부모 생성자 호출
		- 미 코딩시 컴파일러가 자동 추가
	5. java 스펙의 협약
		- 자식 is a 부모 광계에서만 상속 형성
			(매니저 is a 직원) : 상속 가능
			(고객 is a 직원) : 성립 불가, 상속관계 비추 
	6.***
		상속 받은 메소드 {}로직 수정 가능(재정의 = override)

4. 용어 정리
	1. 동일한 클래스에서 동일한 이름의 생성들 또는 메소드들 개발 가능
		단, arguement는 다름
		- overloading(overload), 다중정의
		
	2. 상속 받은 자식 또는 자손 클래스에서 메소드 내용 수정
		- overriding(override), 재정의		
			
			
			
			
			
			
			
			
			
			
			
			
			
			