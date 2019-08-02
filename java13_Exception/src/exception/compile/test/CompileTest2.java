package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileTest2 {
	public static void main(String[] args) {
		String fileName = "poem.txt";
		FileReader fr = null;
		
		try {
			System.out.println("1. FileReader Creating..");
			fr = new FileReader(fileName);
			
			System.out.println("2. FileReader Reading..");
			fr.read();
		}catch(FileNotFoundException e) {System.out.println("1. FileReader Creating..");
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
