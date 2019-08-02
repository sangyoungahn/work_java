package file.test;

import java.io.File;

/*
 * 파일이란?
 * "디렉토리+파일명" 이 두개를 합쳐서 파일명이라고 보면 됨
 */
public class FileExamTest1 {
	public static void main(String[] args) {
		File dir = new File("c:\\filetest\\step1\\code");
		File dir2 = new File("c:\\filetest1");
		File dir3 = new File("c:\\filetest1\\exam\\data.dat");
		
		System.out.println("파일이 생성되었는지 확인....");
		dir2.mkdir();	//하나만 만들때 사용
		dir.mkdirs();	//하위 디렉토리가 여러개 있을때 사용(하나도 가능)
//		dir3.mkdirs();
		
		//getParentFile()을 하면 ""c:\\filetest1\\exam\\"까지가 생성됨
		dir3.getParentFile().mkdir();
	}

}
