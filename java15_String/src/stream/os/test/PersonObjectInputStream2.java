package stream.os.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class PersonObjectInputStream2 {
	/*
	 * 1. 스트림 생성...FIS, OIS
	 * 2. 읽어들인다...
	 * 3. 읽어들인 정보를 콘솔로 출력
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "person.obj";
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person p = (Person)ois.readObject();
		System.out.println(p);
	}

}
