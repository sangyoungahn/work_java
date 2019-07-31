package staticexam.test;
/*U
 * 1. static한 성질을 가지는 멤버는 객체생성 과정이 필요없다.
 *    -> 객체생성하지 않아도 메모리에 올라간다
 *    -> 객체 생성 이전에 미리 메모리 올라간다...
 *       (Class file loader 과정에서 올라간다)
 *    -> static 블락 안에서는 절대로 this 사용 못한다.
 *  2. static은 static끼리 통한다
 *    -> static은 호출하자마자 메모리에 올리간다.
 *  3. static은 필드레벨로만 사용 가능하다.(로컬로 사용X)
 *  4. static변수, 클래스 변수라 불리운다.
 *  5. Math.abs();
 *     Integer.parseInt()
 *     String.format()
 *     System.in
 */
public class StaticExamTest1 {
	static String name = "홍길동";
	int age = 19;
	String address = "진평동";
	
	static void member() {
		name = "김민정";
	}
	public static void main(String[] args) {
//		static int value = 200;
		StaticExamTest1 test1 = new StaticExamTest1();
		System.out.println(StaticExamTest1.name);
		System.out.println(test1.name);
	}

}
