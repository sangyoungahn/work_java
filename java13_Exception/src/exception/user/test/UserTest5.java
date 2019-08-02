package exception.user.test;

class ZeroBoom extends Exception{
	ZeroBoom() {
		this("ZeroBoom Exception....");
	}
	ZeroBoom(String message){
		super(message);
	}
	
}

class User{
	public void solv (int i, int j) throws ArithmeticException{
		System.out.println("slov() call...");
		
		//예외 강제 발생
		if(j==0) throw new ZeroBook("분모가  0이 되면 안됩니다..");	//ArithmeticException을 여기서 발생시켜라.\
		//연산....i/j;
		System.out.println("연산을 진행합니다...");
		System.out.println("i/j :: " + i/j);
	}
}
public class UserTest5 {
	public static void main(String[] args) {
		User user = new User();
		
		//예외는 호출한 곳으로 날라온다(4번째 줄에서 여기로 옴)
		try {
			user.solv(10, 0);
		}catch(ZeroBook e) {
			System.out.println(e.getMessage());		//getMessage() : 예외 생성할 떄 주입된 값
		}
		
	}

}
