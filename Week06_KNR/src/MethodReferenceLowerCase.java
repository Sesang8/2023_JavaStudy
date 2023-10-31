import java.util.Arrays; // Arrays 클래스를 사용하기 위한 import 문
import java.util.List; // List 인터페이스를 사용하기 위한 import 문
import java.util.stream.Collectors; // 스트림 연산을 사용하기 위한 import 문

// MethodReferenceLowerCase 클래스 정의
public class MethodReferenceLowerCase {
    public static void main(String[] args) {
        // 문자열 목록을 생성하고 초기화
        List<String> listOfNames = Arrays.asList(new String[]
                {"Apple", "Banana", "Cherry"});

        System.out.println(listOfNames); // 초기 문자열 목록 출력

        // 스트림을 사용하여 문자열을 소문자로 변환하고 정렬하여 새로운 목록으로 수집
        List<String> sublist = listOfNames.stream()
                .map(s -> Character.toLowerCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
        
        // 변환 후의 목록 출력
        System.out.println("변환 후: " + sublist);
    }
}
