package com.osf.sp.ioc1;

public class Student {

	private Person p;  //new로 메모리 생성하는 작업(=>의존성 주입/이게 제일 나쁨 Person이 바뀌면은 코드를 수정해햐한다.)을 이제 안 해도된다. ioc가 해줌
	public Student(Person p) {
		this.p = p;
	}
	@Override
	public String toString() {
		return "Student [p=" + p + "]";
	}
}
