import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {

		private ArrayList<Student> arrayList;
		public int sum = 0;
		
		public GradeBook() {
			arrayList = new ArrayList<Student>();
		}
		
		public void addStudent(Student student) {
			arrayList.add(student);
		}
		
		
		
		// 1. ��� ������ ��� 
		for( int num : arrayList[2]) {
			sum += num;
		}
		public double getAvg() {
			return (double)sum / arrayList.size();
		}
		
		
		// 2. Ư�� �й� ���� �л��� ������ "�˻�"
		public void searchNum(int num) {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
			System.out.println(list.contains(num));
			System.out.println(list.indexOf(num)); //1�� �ִ� index��ȯ ������ -1
	    }
		
		// 3. ����� ��� �л��� ����(�̸�, �й�, ����)�� ����ϴ� �޼��� �ۼ�
		public void showAllStudent() {
			for(Student student : arrayList) { 
				System.out.println(student);
			}
		}
		
}
}
