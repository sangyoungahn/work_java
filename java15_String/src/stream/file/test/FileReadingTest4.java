package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 *  파일에 들어있는 데이타를 읽어서
 *  result.txt 파일로 해당 데이타를 출력하는 로직을 작성
 *  ::
 *  1. FileReader | BufferedReader
 *     FileWriter | BufferedWriter
 *  2. 읽어서...while
 *  3. 콘솔로 출력
 */
public class FileReadingTest4 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		PrintWriter pw = null;
		File file = new File("poem.txt");
		
		try {
			br = new BufferedReader(new FileReader(file));
			pw = new PrintWriter(new FileWriter("result.txt"), true);	//이어쓰기(시험!!!)
			
			String line = null;
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				pw.write(line+""+ "n");	//한글자씩 읽음
//				bw.newLine();
				pw.flush();
			}
		}finally {
//			if(br!=null) br.close();
//			if(pw!=null) pw.close();
		}
		
	}

}
