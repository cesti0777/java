package banking.view;

import banking.model.dto.Banker;
import banking.model.dto.Customer;
import banking.model.dto.Person;

public class RunningEndView {
	//특정 프로젝트 출력 
		public static void personView(Person person){
			System.out.println(person.toString());		
		}
		
		//모든 프로젝트 출력
		public static void personListView(Person[] allPersont){
			for(int index = 0; index < allPersont.length; index++){			
				if(allPersont[index] != null){
					System.out.println("[Person " + (index+1) + "]\n" + allPersont[index].toString());
				}
			}
		}
		
		public static void whoIs(Person person){
			if(person instanceof Customer){
				System.out.println("Customer 입니다.");
			}
			else if(person instanceof Banker){
				System.out.println("Banker 입니다.");
			}
		}
}
