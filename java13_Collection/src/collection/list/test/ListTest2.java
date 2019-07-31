package collection.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("이효리");
		list.add("옥주현");
		list.add("이진");
		list.add("성유리");
		list.add("이진");
		
		for(String s : list)	System.out.println(s);
		System.out.println("=================================");
		
		/*
		 * iterator()는 리스르 객체를 Iterator로 변환해서 반환
		 * Iterator는 커서를 이용해서 컬렉션의 모든 데이터를 순차적으로 접근해서 Sorting한다
		 * Collection 뷰 역할을 한다
		 */
		Iterator<String> it = list.iterator();
		if(it.hasNext()) System.out.println(it.next());
	}
}
