package service;

import java.util.HashMap;
import java.util.Iterator;

import model.EconomyClass;
import model.FirstClass;
import model.Person;
import model.PrintSeat;
import model.Seat;

public class ReservationService {
	private static ReservationService instance = new ReservationService();

	HashMap<String, Seat[]> allClassList = new HashMap<String, Seat[]>();
	Seat[] firstClassList = new FirstClass[10];
	Seat[] economyClassList = new EconomyClass[10];
	PrintSeat printSeat = new PrintSeat();

	private ReservationService() {
		allClassList.put("FirstClass", firstClassList);
		allClassList.put("EconomyClass", economyClassList);
	}

	public static ReservationService getInstance() {
		return instance;
	}

	public HashMap<String, Seat[]> getAllClassList() {
		return allClassList;
	}

	public Seat[] getFirstClassList() {
		return firstClassList;
	}

	public Seat[] getEconomyClassList() {
		return economyClassList;
	}

	public PrintSeat getPrintSeat() {
		return printSeat;
	}

	//�ڸ� ����
	public void createReservation(String kind, int seatNum, Person person, String service) {
		if (kind.equals("FirstClass")) {
			allClassList.get(kind)[seatNum] = new FirstClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		} else if (kind.equals("EconomyClass")) {
			allClassList.get(kind)[seatNum] = new EconomyClass(kind, seatNum, person, service);
			printSeat.setPrintSeat(kind, seatNum);
		}

	}

	//�̸��ϰ� �ڵ��� ��ȣ�� �¼� ã��
	public Seat readReservation(String name, String phone) throws NotExistException{
		Seat mySeat = null;
		String kind = null;
		Seat[] seat = null;
		Iterator<String> it = allClassList.keySet().iterator();
		
		while(it.hasNext()){
			kind = it.next();
			seat = allClassList.get(kind);
			
			for(int i = 0 ; i < seat.length ; i++){
				if(seat[i] == null){
					continue;
				}
				else if(seat[i].getPerson().getName().equals(name) && seat[i].getPerson().getPhone().equals(phone)){
					mySeat = seat[i];	
					break;
				}
			}	
		}
		if(mySeat == null){
			throw new NotExistException(name, phone);
		}
		return mySeat;
	}
	

	//�̸��ϰ� �ڵ��� ��ȣ�� ���� ���
	public void deleteReservation(String name, String phone) throws NotExistException {
		Seat newSeat = readReservation(name, phone);
		int seatNum=newSeat.getSeatNum();
		if (newSeat.getKind().equals("FirstClass")) {
			allClassList.get("FirstClass")[seatNum] = null;
			printSeat.deletePrintSeat("FirstClass", seatNum);
		} else if (newSeat.getKind().equals("EconomyClass")) {
			allClassList.get("EconomyClass")[seatNum] = null;
			printSeat.deletePrintSeat("EconomyClass", seatNum);
		}
	}

	//�̸��� �ڵ�����ȣ���� �������� ã�Ƽ� �¼�����(���� kind�������� �¼� �ڸ� ���� ����)
	/*
	* ������
	* ���� �̹� �����ϴ� �¼��̶�� ���� ó�� �߰�
	* ( ���ο� ����ó�� Class����� + ���� )
	* 	���� Ŭ���� �̸��� AlreadyExistException ���� ����
	*/
	public void updateReservation(String name, String phone, int seatNum) throws Exception{
		Seat newSeat = readReservation(name, phone);
		String kind = null;
		Seat[] seat = null;
		int oldSeatNum = newSeat.getSeatNum();
		Iterator<String> it = allClassList.keySet().iterator();
		
		while(it.hasNext()){
			kind = it.next();
			if(!kind.equals(newSeat.getKind())){
				continue;
			}
			else{
				seat = allClassList.get(kind);
				if(seat[seatNum] != null ){
					throw new AlreadyExistException();
				}
				else if(seat[oldSeatNum] instanceof FirstClass) {
					printSeat.deletePrintSeat("FirstClass", oldSeatNum);
					newSeat.setSeatNum(seatNum);
					seat[seatNum] = seat[oldSeatNum];
					seat[oldSeatNum] = null;	
					printSeat.setPrintSeat("FirstClass", seatNum);
					break;
				}
				else if(seat[oldSeatNum] instanceof EconomyClass){
					printSeat.deletePrintSeat("EconomyClass", oldSeatNum);
					newSeat.setSeatNum(seatNum);
					seat[seatNum] = seat[oldSeatNum];
					seat[oldSeatNum] = null;
					printSeat.setPrintSeat("EconomyClass", seatNum);
					break;
				}
			}	
		}
		
		//�¼� ���� ���
		System.out.println(newSeat);
	}

	//�¼� �˻��� �¼������� ���� ���
	public void seatRead(Seat mySeat){
		System.out.println(mySeat.toString());
	}
}