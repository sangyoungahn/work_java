package collection.map.test;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//key는 중복 불가능, value는 중복 가능
		map.put("강호동", 90);
		map.put("이수근", 80);
		map.put("서장훈", 100);
		map.put("이상민", 80);
		
		//1. map에서 키값만 받아옴
		Set<String> set = map.keySet();
		System.out.println(set);
		
		//★★★2. set에 담긴 key들을 하나씩 뽑아서... 키에 매핑된 value값을 받아온다
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println(key + "======" + value);
		}
		
		//3....총점 | 평균점
		Collection<Integer> col = map.values();
		Iterator<Integer> iter = col.iterator();
		int total = 0;
		while(iter.hasNext()) {
			total += iter.next();
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+total/map.size());
		System.out.println("최고점수 : "+Collections.max(col));
		System.out.println("최저점수 : "+Collections.min(col));
	}

}
