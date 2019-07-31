package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("강호동");
		set.add("강호동");
		set.add("이수근");
		set.add("서장훈");
		
		System.out.println(set);	//순서대로 안나옴, 중복 허용X
		System.out.println(set.size());	//사이즈가 3이 나오면 중복이 안되었다는 것!
		boolean find = set.contains("이수근");
		
		set.remove("서장훈");
		
		set.clear();
		System.out.println("비었나요? " + set.isEmpty());
	}
}
