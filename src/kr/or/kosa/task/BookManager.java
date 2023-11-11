package kr.or.kosa.task;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

//도서 추가 , 도서 삭제 , 도서 검색 , 도서 목록
//book과 bookmanager는 학교와 학생 관계처럼 라이프 사이클 동일하지 않음


public class BookManager{

	private HashMap<String, Book> book_map = new HashMap<>();
	private int book_count; //도서의 수
	Scanner in = new Scanner(System.in);
	
	void Run() {
		
		while(true) {
			
			System.out.println("1:추가 2:삭제 3:검색 4:도서목록 5:ISBN 목록 0:종료");
			int menu = in.nextInt();
			
			switch (menu) {
			case 1: 
				add();
				break;
			case 2:
				remove();
				break;
			case 3:
				search();
				break;
			case 4:
				booklist();
				break;
			case 5:
				isbnlist();
				break;
			}
			if(menu==0) break;
		}
	}
	
	
	//도서 추가
	void add() {
		
		System.out.println("추가할 도서 ISBN:");
		String isbn=in.next();
		System.out.println("도서 제목:");
		String title=in.next();
		System.out.println("가격:");
		int price=in.nextInt();
		
		Book book = new Book(isbn, title, price);
		book_map.put(isbn, new Book(isbn,title,price));
		book_count++;
		
		System.out.println(book.toString()+" 생성하였습니다.");
	}
	
	//도서 삭제
	void remove() {
		
		System.out.print("삭제할 도서 ISBN:");
		String val = in.next();
		//containsKey : map에서 해당 key값을 가지고 있는지 아닌지 판단하여 true false 리턴
		if(book_map.containsKey(val)) {
			book_map.remove(val);
			book_count--;
			System.out.println("삭제하였습니다.");
		}
		else {
			System.out.println("삭제 실패");
		}
	}
	
	//도서 검색
	void search() {
		System.out.print("검색할 도서 ISBN:");
		String val = in.next();
		if(book_map.containsKey(val)) {
			System.out.print("검색결과>>"+book_map.get(val));
		}
		else {
			System.out.println("검색 실패");
		}
	}
	
	//도서 목록
	void booklist() {
		System.out.println("도서 목록\n도서 수:"+book_count);
		for(Book book_list : book_map.values()) {
			System.out.println(book_list.title);
		}
	}
	
	//ISBN 목록
	void isbnlist() {
		System.out.println("ISBN 목록\n도서 수:"+book_count);
		for(String isbn_list : book_map.keySet()) {
			System.out.println(isbn_list);
		}
	}
	
}
