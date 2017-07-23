package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.NotExsitException;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();
	private int index;

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//��� Project ��ȯ
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	//Project �˻�
	public ProbonoProject getProbonoProject(String projectName) throws NotExsitException{
		ProbonoProject project = null;
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				break;
			}
			else{
				throw new NotExsitException("��ġ�ϴ� ������Ʈ �̸� ����.");
			}
		}
		return project;
	}

	//Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}
	
	
	//??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	//instanceof - ��ü Ÿ�� �� ������ Ȱ���Ͽ� ����ڿ� ������ ������ �����ؼ� �����غ���
		
	//Project ���� - ������Ʈ ������ ��� ����� ���� 
	public void projectUpdate(String projectName, People people) throws NotExsitException{
		if(getProbonoProject(projectName) == null){
			throw new NotExsitException("��ġ�ϴ� ������Ʈ �̸� ����. ���� �Ұ�.");
		}
		else{
			ProbonoProject project = getProbonoProject(projectName);
			if(people instanceof Activist){
				project.setActivist((Activist)people);
			}
			else if(people instanceof Recipient){
				project.setReceive((Recipient)people);
			}
		}
	}
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) throws NotExsitException{
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
			else{
				throw new NotExsitException();
			}
		}
	}
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}
