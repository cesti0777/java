package service;

public class AlreadyExistException extends Exception{

	public AlreadyExistException() {
		super();
		System.out.println("이미 예약이 완료된 좌석입니다.");
	}
}
