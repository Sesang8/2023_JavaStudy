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
		
		
		
		// 1. 평균 점수를 계산 
		for( int num : arrayList[2]) {
			sum += num;
		}
		public double getAvg() {
			return (double)sum / arrayList.size();
		}
		
		
		// 2. 특정 학번 가진 학생의 정보를 "검색"
		public void searchNum(int num) {
			ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
			System.out.println(list.contains(num));
			System.out.println(list.indexOf(num)); //1이 있는 index반환 없으면 -1
	    }
		
		// 3. 등록한 모든 학생의 정보(이름, 학번, 점수)를 출력하는 메서드 작성
		public void showAllStudent() {
			for(Student student : arrayList) { 
				System.out.println(student);
			}
		}
		
}
}
