package view;

import java.util.HashMap;
import java.util.Iterator;

import model.dto.Board;

public class SuccessView {
	/**
	 * ��� �Խù� ���
	 * */
  public static void printBoard(HashMap<String, HashMap<String, Board>> board){
	  Iterator<String> allKind= board.keySet().iterator(); 
	  String kindKey = null;
	  Iterator<String> allNo = null;
	  String noKey = null;
	  HashMap<String, Board> selectedBoard = null; 
	  
	  while(allKind.hasNext()){
		 kindKey = allKind.next(); 
		 System.out.println("----- "+ kindKey +" Board�� ��� �Խù�  List ----- ");
		 
		 selectedBoard = board.get(kindKey);
		 allNo = selectedBoard.keySet().iterator();
		 
		 while(allNo.hasNext()){
			noKey = allNo.next();
			System.out.println(selectedBoard.get(noKey)+"\n");
			
		 }
	  }
  }
  
  /**
   *  �Խ��� ������ ���� ���
   * */
   public static void printBoardBykind(String kind, HashMap<String, Board> board){
	   System.out.println("------"+kind+" ���� �Խù� List -------");
	   Iterator<String> keys = board.keySet().iterator();
	   while(keys.hasNext()){
		   System.out.println(board.get(keys.next()));
	   }
   }
  
    /**
     * �Խù� ���/����/���� ���� �� �޽��� ���
     * */ 
    public static void successMessage(String message) {
		System.out.println(message);
	}
    

    public static void printBoardByno(Board board){
 		System.out.println(" �Խù� ���� - " + board);
 	}
  
  
}
