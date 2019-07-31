package collection.list.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("서울");
		list.add("상해");
		list.add("동경");
		list.add("뉴욕");
		list.add("부산");
		
		list.add(1, "LA");
		System.out.println(list);
		
		list.remove("동경");
		
		System.out.println(list.contains("la"));	//LA라고 하면 소문자는 안 봄\
		Object[] obj = list.toArray();	//리스트 객체를 Object타입의 일반 배열로 변환
		System.out.println(Arrays.toString(obj));	//리스트 toString() 오버라이딩
		
		String[] cities = new String[0];
		cities = list.toArray(cities);	//toArray 안에 배열 타입을 직접 지정한 것!
										//list에 있는 배열을 String타입으로 변환한다
		System.out.println(Arrays.toString(cities));
		
		list.clear();
		System.out.println(list.isEmpty());	//현재 list는 텅텅 비었다.
		
		//비어 있는 리스트에 다시 데이터를 추가
		list.add("파리");
		list.add("싱가폴");
		list.add("부다페스트");
		
		//Arrays 클래스는 배열 데이타 처리에 다양한 기능을 제공하는 클래스...
		//asList() 메소드는 인자로 전달된 데이터를 가지는 List 객체를 생성해서 반환
		List<String> list2 = Arrays.asList("전주", "경주", "진주");	//이것을 List로 반환
		
		list.addAll(list2);	//list + list2
		System.out.println(list);
		
		System.out.println(list.containsAll(list2));	//list에 list2의 내용이 있는지의 여부를 판단
		
		list.retainAll(list2);	//list에서 list2만 남기고 나머지는 다 버림
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);
	}
}
