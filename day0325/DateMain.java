package kr.ac.kopo.day0325;

import java.util.Calendar;
import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)

		while (true) {
			System.out.print("1. 특정년도 2.특정월 3.종료 =>");
			int inputSelect = sc.nextInt();
			if (inputSelect == 1) {
				System.out.print("년도를 입력하세요 =>");
				int inputYear = sc.nextInt();
				for (int i = 0; i < 12; i++) {
					c.set(inputYear, i+1, 1);
					System.out.println("<< "+inputYear+ "년 "+i +"월"+" >>");
					
					for(int j=0; j<6; j++) {
						for(int k=0; k<7; k++ ) {
							
						}
					}
				}
			} else if (inputSelect == 2) {
				System.out.print("월을 입력하세요 =>");
				int inputMonth = sc.nextInt();

			}

			if (inputSelect == 1) {
				// 특정 년도

			}

		}

	}

}
