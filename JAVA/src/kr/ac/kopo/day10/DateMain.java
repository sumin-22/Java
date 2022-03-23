package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yy년 MM월 dd일 hh시 mm분 ss초 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) +1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); 	//1~7
		String[] week = {"","일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 " + year +"년 " +month+"월 " +date +"일 " + "(" + week[day] + ")");
		
		
		//2013년 6월 13일
		c.set(2013, 6-1, 13);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2013.06.13 (" + week[day] + ")");
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_WEEK);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		
		
	
		
//		Date d = new Date();
//		System.out.println(d.toString());
//		
//		// 오늘은 2022년 3월 23일 (수)입니다
//		
//		int year = d.getYear() + 1900;	// deprecation 됨.
//		int month =d.getMonth()+ 1;
//		int date = d.getDate();
//		int day =d.getDay();	0~6
//		String[] week = {"일","월","화","수","목","금","토"};
//		
//		System.out.println("오늘은 "+ year +"년 "+ month + "월 " + date +"일 " + "("+ week[day] + ")" );
//
	}

}
