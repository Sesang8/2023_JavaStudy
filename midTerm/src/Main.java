
public class Main {
	public static void main(String[] args) {
		GradeBook gradeArrayList = new GradeBook(); 
		
		// GradeBook�� Form����� �л� ���� �Է¹ް� ����
		Student student1 = new Student("kim", 231111, 3.5);
		Student student2 = new Student("lee", 231112, 3.5);
		Student student3 = new Student("chung", 231113, 3.8);
		Student student4 = new Student("park", 231114, 3.9);
		Student student5 = new Student("baek", 231115, 4.2);

        // ������ å ��ü���� BookArrayList�� �߰�
        gradeArrayList.addStudent(student1);
        gradeArrayList.addStudent(student2);
        gradeArrayList.addStudent(student3);
        gradeArrayList.addStudent(student4);
        gradeArrayList.addStudent(student5);
		
		// Ư�� �й� ���� �л� �˻��� ȭ�鿡 ǥ��
        
        
		
		// ��� �л����� ������ ���Ͽ� ��� (ȭ�鿡 ��� XXX...)
        gradeArrayList.showAllStudent();
		
		// �л��� ��ü ��, ��ü ���, �л��� ���� (���� �ʿ� ����)
		

	}

}
