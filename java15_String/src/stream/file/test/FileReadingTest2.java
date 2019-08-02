package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  파일에 들어있는 데이타를 읽어서
 *  콘솔로 출력하는 로직을 작성
 *  ::
 *  1. FileReader | BufferedReader
 *  2. 읽어서...while
 */
public class FileReadingTest2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = null;
		BufferedWriter bw = null;
		File file = new File("poem.txt");
		
		try {
			br = new BufferedReader(new FileReader(file));
			bw = new BufferedWriter(new FileWriter("result.txt"));
			
			String line = null;
			while((line=br.readLine())!=null) {
//				System.out.println(line);
				bw.write(line+"\n");
//				bw.nextLine();
				bw.flush();
			}
		}finally {
			if(br!=null) br.close();
			if(bw!=null) br.close();
		}
		
	}

}
