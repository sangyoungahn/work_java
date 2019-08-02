package file.test;

import java.io.File;

/*
 * 파일이란?
 * "디렉토리+파일명" 이 두개를 합쳐서 파일명이라고 보면 됨
 */
public class FileExamTest2 {
	public static void main(String[] args) throws Exception{
		String dirName = "c:\\"+File.separator+"Temp2"+File.separator+"mydir";
		File f1 = new File(dirName);
		
		f1.mkdirs();
		
		File f2 = new File(dirName, "filetest.dat");
		if(f2.createNewFile()) System.out.println("File 생성!!!");
		
		System.out.println(f2.getName());
		System.out.println(f2.getPath());
		System.out.println(f2.getParent());
		f2.deleteOnExit();	//종료될때 디렉토리 안에 있는 파일을 삭제
	}

}
