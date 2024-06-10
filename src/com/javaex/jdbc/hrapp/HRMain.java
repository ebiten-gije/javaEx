package com.javaex.jdbc.hrapp;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class HRMain {

	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Scanner sca = new Scanner (System.in);
		boolean a = true;
		
		while(a) {
			System.out.println("원하시는 서비스를 선택하세요\n 1.직원 정보 검색\n 2.급여 범위 검색\n 99.종료");
			String sel = null;
/*			try {
				sel = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		sel = sca.nextLine();
				
			switch (sel) {
		
			case "1":
				Search.searchEmp();
				break;
		
			case "2":
				Search.searchSalary();
				break;
				
			case "99":
				System.out.println("종료합니다^^");
				a = false;
				break;
			
			default :
				System.out.println("굿초이스");
				System.out.println("----------------------------------------");
				break;
			}
		}
		sca.close();
		
/*		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	*/

	}

/*	private static void searchSalary() {
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
		sc.close();
	}

	private static void searchEmp() {
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
		
		sc.close();
	}
*/
}
