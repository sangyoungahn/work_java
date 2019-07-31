package staticexam.test;
/*
 * static 변수는 생성된 객체들에서 모두 공유한다.
 * ::
 * 필드와 static한 변수의 차이점
 */

class Car{
	//필드레벨은 선언 자체만으로 초기화됨
	int serialNum;
	static int counter;
	
	Car() {
		counter++;
		serialNum = counter;
	}
}
public class StaticExamTest2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("================= no-static variable===========");
		System.out.println(car1.serialNum);
		System.out.println(car2.serialNum);
		System.out.println(car3.serialNum);
		
		System.out.println("================= static variable===========");
		System.out.println(Car.counter);
		System.out.println(car1.serialNum);
		System.out.println(car2.serialNum);
		System.out.println(car3.serialNum);
	}

}
