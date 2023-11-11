package kr.or.kosa.task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//도서 추가 , 도서 삭제 , 도서 검색 , 도서 목록
//book과 bookmanager는 학교와 학생 관계처럼 라이프 사이클 동일하지 않음


public class Serializable_BookManager{

	private HashMap<String, Book> book_map = new HashMap<>();
	private int book_count; //도서의 수
	Scanner in = new Scanner(System.in);
	
	private String path = "Book.txt";
	
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	ObjectOutputStream out = null;
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream objin = null;
	
	
	void Run() {
		
		while(true) {
			
			System.out.println("1:추가 2:삭제 3:검색 4:도서목록 5:ISBN 목록 "
					+ "6: 직렬화 7:역직렬화 0:종료");
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
			case 6:
				saveBook();
				break;
			case 7:
				loadBook();
				break;
			}
			
			if(menu==0) break;
		}
	}
	
	//직렬화
	void saveBook() {
		
		try {
			
			fos = new FileOutputStream(path);
			bos = new BufferedOutputStream(fos);
			out = new ObjectOutputStream(bos);
			
			System.out.println("저장할 도서 ISBN:");
			String isbn=in.next();
			System.out.println("도서 제목:");
			String title=in.next();
			System.out.println("가격:");
			int price=in.nextInt();
			
			//객체 생성
			Book book = new Book(isbn, title, price);
			
			if(book_map.containsKey(isbn)) {
				out.writeObject(book);
				System.out.println("저장 성공");
			}
			else {
				System.out.println("저장 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//역직렬화
	void loadBook() {
		try {
			
			fis = new FileInputStream(path);
			bis = new BufferedInputStream(fis);
			objin = new ObjectInputStream(bis);
			
			book_map = (HashMap)objin.readObject();
			Set<String> book_keyset = book_map.keySet();
            for (String s : book_keyset) {
                System.out.println(book_keyset.size());
                String isbn = book_map.get(s).isbn;
                String bookName = book_map.get(s).title;
                int price = book_map.get(s).price;
                System.out.printf("ISBN:%s 이름:%s 가격:%d", isbn, bookName, price);
            }
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				objin.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
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
