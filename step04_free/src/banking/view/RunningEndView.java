package banking.view;

import banking.model.dto.Banker;
import banking.model.dto.Customer;
import banking.model.dto.Person;

public class RunningEndView {
	//Ư�� ������Ʈ ��� 
		public static void personView(Person person){
			System.out.println(person.toString());		
		}
		
		//��� ������Ʈ ���
		public static void personListView(Person[] allPersont){
			for(int index = 0; index < allPersont.length; index++){			
				if(allPersont[index] != null){
					System.out.println("[Person " + (index+1) + "]\n" + allPersont[index].toString());
				}
			}
		}
		
		public static void whoIs(Person person){
			if(person instanceof Customer){
				System.out.println("Customer �Դϴ�.");
			}
			else if(person instanceof Banker){
				System.out.println("Banker �Դϴ�.");
			}
		}
}
