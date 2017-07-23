/* SingleTon Pattern
 * - 자바 실행환경상에 강제적으로 객체의 수를 제한
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
	//Project 검색 - Project명으로 요청하는 Project 객체 검색해서 반환하기
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
	//Project 추가 - Project를 배열에 추가 저장하기 메소드 
	public void projectInsert(ProbonoProject project) {
		if(index != projectList.length){
			projectList[index] = project;
			index++;
		}
		else{
			System.out.println("더이상 추가할 수 없습니다.");
		}
	}
	
	
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정
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
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				index--;
				break;
			}
		}
	}
	
	//Project 개수
	public int projectListSize(){
		return index;
	}
}
