package collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("이효리");
		list.add("옥주현");
		list.add("이진");
		list.add("성유리");
		list.add("이진");
		
		System.out.println(list);	//Collection은 toString() 오버라이딩
		String rName = list.remove(2);
		System.out.println(rName + "님이 삭제");	//삭제한 객체 자체가 리턴됨
		
		if(list.remove("성유리"))	//객체를 직접 넣을 떄 리턴 타입이 boelean
			System.out.println("DELETE OK!!!");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.set(2, "아이유");
		System.out.println(list);
		
	}
}
