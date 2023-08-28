package com.kh.lo;
import java.io.*;

public class Run {
	public static void main(String[] args) {
			String filePath = "myFile.txt"; 
			
			try {
				File file = new File(filePath);
				boolean isFileCreated = file.createNewFile();
				
				if(isFileCreated) {
					System.out.println("파일생성완료 : "  +  filePath);
				} else {
					System.out.println("파일생성실패");
				}
			}catch (IOException e) {
				e.printStackTrace();
			}

			try {
			OutputStream out = new FileOutputStream(filePath);
			out.write(7);
			out.close();
			} catch(IOException e) {
				e.printStackTrace();
				
			}
			try {
			InputStream in  = new  FileInputStream(filePath);
			System.out.println(in.read());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			
			
}
}
