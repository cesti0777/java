package model;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import exception.DuplicateException;
import exception.InexistentException;
import model.dto.ArchiveBoard;
import model.dto.Board;
import model.dto.PhotoBoard;

public class BoardServiceImpl implements BoardServiceIF {
	
	//?
	private HashMap<String, HashMap<String, Board>> allBoardList 
	= new HashMap<String, HashMap<String, Board>>();
	
	HashMap<String, Board> archiveList = new HashMap<String, Board>();
	HashMap<String, Board> photoList = new HashMap<String, Board>();
	
	private static BoardServiceImpl instance = new BoardServiceImpl();
	
	
	/**
	 * ���Ϸ� ���� �����͸� �ε��ؼ� Map�� �����ϴ� ������
	 * */
	private BoardServiceImpl(){
		String [] boardValue = null;
		String key=null;
		Iterator<String> allKey =null;
		try {
			
			//�ڷ�� ����
			Properties archiveInfo = new Properties();
			archiveInfo.load(new FileReader("archiveInfo.properties"));
			allKey = archiveInfo.stringPropertyNames().iterator();
			
			while(allKey.hasNext()){
				key = allKey.next();
				boardValue = archiveInfo.getProperty(key).split(",");	
				archiveList.put(key, new ArchiveBoard(Integer.parseInt(boardValue[0]),boardValue[1],boardValue[2],boardValue[3],boardValue[4],boardValue[5],Integer.parseInt(boardValue[6])));
			}
			
			//���� ����
			Properties photoInfo = new Properties();
			photoInfo.load(new FileReader("photoInfo.properties"));
			allKey = photoInfo.stringPropertyNames().iterator();
			
			while(allKey.hasNext()){
				key = allKey.next();
				boardValue = photoInfo.getProperty(key).split(",");	
				photoList.put(key, new PhotoBoard(Integer.parseInt(boardValue[0]),boardValue[1],boardValue[2],boardValue[3],boardValue[4],boardValue[5]));
			}
			allBoardList.put("archive", archiveList);
			allBoardList.put("photo", photoList);
		
       } catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * BoardServiceImpl ��ü ����
	 * */
	public static BoardServiceImpl getInstance(){
		return instance;
	}
	
	
	//?
	/**
	   * ��� �Խù� �˻�(�ڷ��, ����)
	 * @return 
	   * */
	@Override
	public HashMap<String, HashMap<String, Board>> getBoardList() {
		return allBoardList;
	}
	
	
	//?
	/**
	 *  �Խ��� ������ ���� �˻�
	 *  ��� �ڷ��  or ��� �����ڷ�� �˻�
	 * */
	@Override
	public HashMap<String, Board> getBoardByKind(String kind) {
		return allBoardList.get(kind);
	}

	//?
	/**
	 * �۹�ȣ�� �ش��ϴ� �Խù� �˻�
	 * */
	@Override
	public Board getBoardByNo(String kind, int no) throws InexistentException {
		Board  board = allBoardList.get(kind).get(Integer.toString(no));
		if(board==null){
        	throw new InexistentException(no);
        }else{
        	return board;
        }
	}

	/**
	 *  �۹�ȣ�� �ش��ϴ� �Խù� ����
	 * */
	@Override
	public void insertBoard(String kind, Board board) throws DuplicateException {
		if(existBoardBykind(kind, board.getNo())){
			throw new DuplicateException(kind+"�� �۹�ȣ " + board.getNo());
		}else{
			allBoardList.get(kind).put(Integer.toString(board.getNo()) , board);
		}
	}
	
	
	//?
	/**
	 * �۹�ȣ�� �ش��ϴ� �Խù� ����
	 * (����� ���� �� ����������.)
	 * */
	@Override
	public void updateBoard(String kind, String subject, String content, int no) throws InexistentException {
		Board  board = allBoardList.get(kind).get(Integer.toString(no));
		if(board==null){
        	throw new InexistentException(no);
        }else{
        	board.setSubject(subject);
        	board.setContent(content);
        }
	}

	/**
	 * �۹�ȣ�� �ش��ϴ� �Խù� ����
	 * */
	@Override
	public void deleteBoard(String kind, int no) throws InexistentException {
		Board  board = allBoardList.get(kind).get(Integer.toString(no));
		if(board==null){
        	throw new InexistentException(no);
        }else{
        	allBoardList.get(kind).remove(Integer.toString(no));
        }

	}

	/**
	 * �Խù� ���� ���翩�� üũ
	 * return =>  true : �Խù� ���� , false :  �Խù� ����
	 * */
	@Override
	public boolean existBoardBykind(String kind, int no) {
	     HashMap<String, Board> boardList= allBoardList.get(kind) ; 
		return boardList.containsKey(Integer.toString(no));
	}

	
}
