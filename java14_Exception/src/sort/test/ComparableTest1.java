package sort.test;
/*
 * String, Wrapper, Date, File.. 클래스들을 기본적으로 "Comparable" 인터페이스에 의해
 * 상속받은채로 정의되어진 클래스들이다.
 * Comparabale에 의해서 구현된 클래스들은 같은 타입의 객체값은 서로 비교해서 정렬할 수 있다.
 * 기본적으로 오름차순으로 정렬된다.
 * 
 * Arrays.sort(Xxx[ ])는 Comparable에 의해서 정렬된 것
 * ArrayList는 Arrays.sort()로 정렬이 안된다. - 배열이 아니라서 안됨
 * ArrayList는 Collections.sort로 정렬한다.
 * 
 */////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Collections;

//1. Comparable을 직접 구현하는 방법...compareTo()를 구현해야한다.
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Person p) {
//		return new Integer(age).compareTo(p.getAge());	//나이 오름차순으로 정렬
//	}
	
	@Override
	public int compareTo(Person p) {
		return -(new Integer(age).compareTo(p.getAge()));	//나이 내림차순으로 정렬
	}

//	@Override
//	public int compareTo(Person p) {
//		return name.compareTo(p.getName());	//이름 오름차순으로 정렬
//	}
	
}

public class ComparableTest1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("이정재", 44));
		list.add(new Person("하정우", 43));
		list.add(new Person("조인성", 38));
		
		Collections.sort(list);
		System.out.println(list);
	}

}
