
public class Main {
	public static void main(String[] args) {
		GradeBook gradeArrayList = new GradeBook(); 
		
		// GradeBook의 Form사용해 학생 정보 입력받고 저장
		Student student1 = new Student("kim", 231111, 3.5);
		Student student2 = new Student("lee", 231112, 3.5);
		Student student3 = new Student("chung", 231113, 3.8);
		Student student4 = new Student("park", 231114, 3.9);
		Student student5 = new Student("baek", 231115, 4.2);

        // 생성된 책 객체들을 BookArrayList에 추가
        gradeArrayList.addStudent(student1);
        gradeArrayList.addStudent(student2);
        gradeArrayList.addStudent(student3);
        gradeArrayList.addStudent(student4);
        gradeArrayList.addStudent(student5);
		
		// 특정 학번 가진 학생 검색해 화면에 표시
        
        
		
		// 모든 학생들의 정보를 파일에 출력 (화면에 출력 XXX...)
        gradeArrayList.showAllStudent();
		
		// 학생의 전체 수, 전체 평균, 학생의 정보 (정렬 필요 없음)
		

	}

}
