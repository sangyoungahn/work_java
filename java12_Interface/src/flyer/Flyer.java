package flyer;
/*
 * 기능의 Template만을 모아놓은 틀
 * 필드를 가지지 않는다★★★
 * interface의 구성요소
 * 1) 구현부가 없는( ;) 추상메소드
 */
public interface Flyer {
	int speed = 140;	//public static final이 자동적으로 생기기 때문에 상수화 되어버림
	void fly();		//자동으로 무조건 "public abstract"가 붙음
	public abstract void land();	//??
	void take_off();
}

//하나라도 구현 안 된 메소드가 있으면 추상 클래스가 된다.
abstract class Bird implements Flyer{
	String nest="숲속에서...";
	
	@Override
	public void fly() {
		System.out.println("Bird...fly..."+speed);
	}
	

	@Override
	public void take_off() {
		System.out.println("Bird...take_off...");
	}
	
	//Bird는 클래스이기 때문에 자기 자신만의 기능을 가짐
	public String layEgg() {
		return "알을 깐다";
	}
}

class Eagle extends Bird{

	@Override
	public void land() {
		System.out.println("Eagle.....land");
	}

	@Override
	public String layEgg() {
		// TODO Auto-generated method stub
		return super.layEgg();
	}
	
	
}
