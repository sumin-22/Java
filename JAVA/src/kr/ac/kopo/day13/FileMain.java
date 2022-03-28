package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory()? "디렉토리" : "파일");
			}
		}
		
		
//		 File dirObj = new File("iotest");
//		 if(dirObj.exists()) {
//			 String[] list = dirObj.list();
//			 for(String data : list) {
//				 System.out.println(data);
//				 File fileObj = new File(dirObj.getName() + "/" + data);
//				 
//			 }
//		 }
		
		
		
		/*
		 * File dirObj = new File("iotest/그래미/라스베이거스"); System.out.println("존재 여부 : " +
		 * dirObj.exists()); System.out.println("디렉토리 여부 : " + dirObj.isDirectory());
		 * //디렉토리는 폴더 System.out.println("파일 여부 : " + dirObj.isFile());
		 * 
		 * if(!dirObj.exists()) { dirObj.mkdirs(); }
		 */
		
		
		
		/*
		 * File fileobj = new File("iotest/a.txt"); String fileName = fileobj.getName();
		 * String parent = fileobj.getParent();
		 * 
		 * System.out.println("파일명 : " + fileName); System.out.println("부모 : " +
		 * parent);
		 * 
		 * fileobj.exists(); //파일이 있으면 true System.out.println("파일 존재여부 : " +
		 * fileobj.exists(); long fileSize = fileobj.length();
		 * System.out.println("파일 크기 : " + fileSize + "bytes");
		 * System.out.println(fileobj.canRead() ? "읽기 가능" : "읽기 불가능");
		 * System.out.println(fileobj.canWrite()? "쓰기 가능" : "쓰기 불가능");
		 * 
		 * long lastTime = fileobj.lastModified(); String pattern =
		 * "yyyy-MM-dd HH:mm:ss"; SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		 * System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		 */
		 

	}

}
