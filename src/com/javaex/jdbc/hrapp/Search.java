package com.javaex.jdbc.hrapp;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void searchSalary() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println(" 숫 자 입 력 ");
		String str = sc.nextLine();
		
		String[] splitStr = str.split(" ");			
		int min = Integer.parseInt(splitStr[0]); 
		int max = Integer.parseInt(splitStr[1]);
		
		System.out.println("============================================");
		
		EmployeeDAO dao = new EmployeeDAO();
		List <EmployeeVO> list = dao.getSal(min, max);
		
		if (list.size() > 0) {
			Iterator<EmployeeVO> it = list.iterator();
			while(it.hasNext()) {
				EmployeeVO vo = it.next();
				System.out.printf("%-20s%d%n", vo.getName(), vo.getSalary());
			}
		} else {
			System.out.println("찾으시는 내용이 없습니다.");
		}
//		sc.close();
	}
	
	public static void searchEmp() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.print("검색할 내용을 입력: ");
		String str = sc.nextLine();
		
		EmployeeDAO dao = new EmployeeDAO();
		List<EmployeeVO> list = dao.getEmp(str);
		
		if (list.size() > 0) {
			Iterator<EmployeeVO> it = list.iterator();
			while(it.hasNext()) {
				EmployeeVO vo = it.next();
				System.out.printf("%-20s%-10s%s\t%s%n", vo.getName(), vo.geteMail(), vo.getPh(), vo.getHd());
			}
		} else {
			System.out.println("찾으시는 내용이 없습니다.");
		}
		
//		sc.close();
	}
}
