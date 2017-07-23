package probono.service;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	private int index;

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//��� Project ��ȯ
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	//Project �˻�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				break;
			}
		}
		return project;
	}

	//Project �߰�
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}
	
	
	//??? ������ ���� �޼ҵ�� Ȯ���ϱ�
	//instanceof - ��ü Ÿ�� �� ������ Ȱ���Ͽ� ����ڿ� ������ ������ �����ؼ� �����غ���
		
	//Project ���� - ������Ʈ ������ ��� ����� ���� 
	public void projectUpdate(String projectName, People people){
		ProbonoProject project = getProbonoProject(projectName);
		if(people instanceof Activist){
			project.setActivist((Activist)people);
		}
		else if(people instanceof Recipient){
			project.setReceive((Recipient)people);
		}
	}
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				break;
			}
		}
	}
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}