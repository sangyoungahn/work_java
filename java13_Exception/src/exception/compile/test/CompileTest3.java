package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTest3 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String fileName = "src/poem.txt";
		FileReader fr = null;

		try {
			System.out.println("1. FileReader Creating..");
			fr = new FileReader(fileName);

			System.out.println("2. FileReader Reading..");
			fr.read();
		}catch(FileNotFoundException e) {
		System.out.println("파일을 못찾았습니다..");
		}catch(IOException e) {
			System.out.println("파일을 읽어들이는데 실패했습니다..");
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				System.out.println("실패..");
			}
		}
	}
}
