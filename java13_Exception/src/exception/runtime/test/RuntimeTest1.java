package exception.runtime.test;

public class RuntimeTest1 {
	public static void main(String[] args) {
		String[] message = {
				"Hello java",
				"No, I mean it",
				"Good Morning"
		};

		int i = 0;
		while(i<=3) {
			//message[3]일 때 예외가 발생 -> 예외가 잡혔으므로 17행으로 감
			try {
				System.out.println(message[i]);
			}/*catch(Exception e) {
				System.out.println("Nice Catch2!!");
			}*/
			catch(ArithmeticException e) {
				System.out.println("Nice Catch0!!");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Nice Catch!!");
			}finally {
				System.out.println("Always...print...");
			}
			i++;
		}
	}
}
