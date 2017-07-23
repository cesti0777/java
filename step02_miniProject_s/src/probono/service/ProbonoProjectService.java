/* SingleTon Pattern
 * - �ڹ� ����ȯ��� ���������� ��ü�� ���� ����
 */
package probono.service;

import probono.model.dto.Activist;
import probono.model.dto.ProbonoProject;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	
	private int index; 

	private ProbonoProjectService(){}
	
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	public ProbonoProject[] getAllProjects() {
		return projectList;
	}

	//???
	//Project �˻� - Project������ ��û�ϴ� Project ��ü �˻��ؼ� ��ȯ�ϱ�
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project  = projectList[i];
				break;
			}
		}
		return project;
	}

	//??? 
	//Project �߰� - Project�� �迭�� �߰� �����ϱ� �޼ҵ� 
	public void projectInsert(ProbonoProject project) {
		if(index != projectList.length){
			projectList[index] = project;
			index++;
		}
		else{
			System.out.println("���̻� �߰��� �� �����ϴ�.");
		}
	}
	
	
	//Project ���� - ������Ʈ ������ ��� ����� ����
	public void projectUpdate(String projectName, Activist people){
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				project.setActivist(people);
				break;
			}
		}
	}
	
	 //Project ���� - ������Ʈ������ �ش� ������Ʈ ����
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				index--;
				break;
			}
		}
	}
	
	//Project ����
	public int projectListSize(){
		return index;
	}
}
