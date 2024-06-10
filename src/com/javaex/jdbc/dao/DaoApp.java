package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DaoApp {

	public static void main(String[] args) {
		
		listAuthors();
		System.out.println();

//		insertAuthor();
//		updateAuthor();
//		getAuthor();
//		deleteAuthor();
		System.out.println();

		listAuthors();
	}

	private static void deleteAuthor() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 레코드 ID: ");
		Long authorId = Long.parseLong(sc.nextLine());
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.delete(authorId);
		
		System.out.println("Author delete: " + (success ? "성공": "실패"));
		sc.close();
		
	}

	private static void getAuthor() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("검색할 레코드 ID: ");
		Long authorId = Long.parseLong(sc.nextLine());
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		AuthorVO vo = dao.get(authorId);
		
		if (vo != null) {
			System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
		} else {
			System.out.println("찾으시는 내용이 없습니다.");
		}
		
		sc.close();
	}

	private static void updateAuthor() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 레코드 ID: ");
		Long authorId = Long.parseLong(sc.nextLine());
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("정보: ");
		String desc = sc.nextLine();
		
		AuthorVO vo = new AuthorVO(authorId, name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		boolean success = dao.update(vo);
		
		System.out.println("Author update: " + (success ? "성공": "실패"));
		sc.close();
	}

	private static void insertAuthor() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름: ");
		String name = sc.nextLine();
		
		System.out.print("정보: ");
		String desc = sc.nextLine();
		
		AuthorVO vo = new AuthorVO(name, desc);
		
		AuthorDAO dao = new AuthorDAOImplOracle();
		
		boolean success = dao.insert(vo);
		
		System.out.println("Author insert: " + (success ? "성공": "실패"));
		
		sc.close();
		
	}

	private static void listAuthors() {
		AuthorDAO dao = new AuthorDAOImplOracle();
		System.out.println("=======================Authors==================");
		
		List <AuthorVO> list = dao.getList();
		
		if(list.size() > 0) {
			//	Iterator 순회
			Iterator<AuthorVO> it = list.iterator();
			
			while(it.hasNext()) {
				AuthorVO vo = it.next();
				System.out.printf("%d\t%s\t%s%n", vo.getAuthorId(), vo.getAuthorName(), vo.getAuthorDesc());
			}
			
		} else {
			System.out.println("데이터가 없습니다.");
		}
	}
}
