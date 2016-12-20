import java.util.*;
import java.io.*;


class Book implements Serializable {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private int pubyear;
	private String publisher;
	private int point;
	
	public Book(String isbn, String title, String author, int price, int pubyear, String publisher, int point){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pubyear = pubyear;
		this.publisher = publisher;
		this.point = point;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}
	public String getPublisher(){
		return publisher;
	}
	public int getPubyear(){
		return pubyear;
	}
	public int getPoint(){
		return point;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	public void setpubyear(int pubyear){
		this.pubyear = pubyear;
	}
	public void setPoint(int point){
		this.point = point;
	}
	
	public String toString(){
		return getIsbn() + "," + getTitle() + "," + getAuthor() + "," + getPrice() + "," + getPubyear() + "," + getPublisher() + "," + getPoint();
	}

}

class BookManager {
	ArrayList<Book> list = new ArrayList();
	void addBook(){
		Book b1 = new Book("a0001", "자바완성1", "홍길동", 10000, 1979, "재하미", 180);
		Book b2 = new Book("a0002", "스트럿츠", "김유신", 27000, 1970, "제갸미", 179);
		Book b3 = new Book("a0003", "기초 EJB", "김성박", 68000, 1997, "내가태어난년도", 200);
		Book b4 = new Book("a0004", "자바완성2", "홍길동", 50000, 1979, "재하미", 180);
		Book b5 = new Book("a0005", "스트럿츠2", "김유신", 40000, 1971, "제갸미", 179);
		Book b6 = new Book("a0006", "기초 EJB2", "김성박", 30000, 1997, "내가태어난년도", 200);
		Book b7 = new Book("a0007", "자바완성3", "홍길동", 2000, 1972, "재하미", 80);
		Book b8 = new Book("a0008", "스트럿츠3", "김유신", 1000, 1973, "제갸미", 79);
		Book b9 = new Book("a0009", "기초 EJB3", "김성박", 9500, 1994, "내가태어난년도", 200);
		Book b10 = new Book("a0010", "자바완성4", "홍길동", 8000, 1975, "재하미", 980);
		Book b11 = new Book("a0011", "스트럿츠4", "김유신", 7000, 1976, "제갸미", 879);
		Book b12 = new Book("a0012", "기초 EJ4B", "김성박", 6500, 1997, "내가태어난년도", 700);
		Book b13 = new Book("a0013", "자바완성5", "홍길동", 50000, 1977, "재하미", 680);
		Book b14 = new Book("a0014", "스트럿츠5", "김유신", 40000, 1978, "제갸미", 579);
		Book b15 = new Book("a0015", "기초 EJ5B", "김성박", 30000, 1999, "내가태어난년도", 400);
		Book b16 = new Book("a0016", "자바완성6", "홍길동", 10000, 1922, "재하미", 380);
		Book b17 = new Book("a0017", "스트럿츠6", "김유신", 2000, 1923, "제갸미", 379);
		Book b18 = new Book("a0018", "기초 EJ6B", "김성박", 2500, 1924, "내가태어난년도", 300);
		Book b19 = new Book("a0019", "자바완성7", "홍길동", 10000, 1925, "재하미", 180);
		Book b20 = new Book("a0020", "스트럿츠7", "김유신", 2000, 1926, "제갸미", 179);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		list.add(b7);
		list.add(b8);
		list.add(b9);
		list.add(b10);
		list.add(b11);
		list.add(b12);
		list.add(b13);
		list.add(b14);
		list.add(b15);
		list.add(b16);
		list.add(b17);
		list.add(b18);
		list.add(b19);
		list.add(b20);
		for(int i=0;i<list.size();i++)
			System.out.println("도서목록 : "+ list.get(i).toString());
	}
	void searchBook(){
		int menu,i,search;
		String s123;
		Scanner s = new Scanner(System.in); 
		System.out.println("1. 저자명 2. 단가 3. 출판사 4. isbn 5. 출판년도 6. 인기도");
		menu = s.nextInt();
		switch (menu)
		{
		case 1 : 
			System.out.println("저자명을 입력하세요");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getAuthor().contains(s123)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
			
			
			break;
		case 2 :
			System.out.println("단가를 입력하세요");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPrice()==(search)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
			break;
		case 3 :
			System.out.println("출판사를 입력하세요");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPublisher().contains(s123)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
			break;
		case 4 :
			System.out.println("isbn을 입력하세요");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getIsbn().contains(s123)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
		case 5 :
			System.out.println("출판년도를 입력하세요");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPubyear()==(search)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
			
		case 6 :
			System.out.println("인기도를 입력하세요");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPoint()==(search)){
					System.out.println("도서 "+list.get(i).toString());
				}
			}
		}
		
		
	}
	
	void start()
	{
		Scanner s = new Scanner(System.in);
		int menu;
		boolean go=true;
		while(go)
		{
			System.out.println("\n===============================================================");
			System.out.println("1 : 도서목록 2 : 도서검색 3 : 도서목록 저장하기 4 : 종료");
			System.out.print("메뉴선택 : ");
			menu = s.nextInt();
			switch (menu)
			{
			case 1 : 
				addBook();	
				break;
			case 2 :
				searchBook();
				break;
			case 3 :
				FileInputStream fin = null;
				ObjectInputStream ois = null;

				try{
					fin = new FileInputStream("booklist.dat");
					ois = new ObjectInputStream(fin);
					
					ArrayList list = (ArrayList)ois.readObject();
					Book b1 = (Book)list.get(0);
					Book b2 = (Book)list.get(1);
					Book b3 = (Book)list.get(2);
					Book b4 = (Book)list.get(3);
					Book b5 = (Book)list.get(4);
					Book b6 = (Book)list.get(5);
					Book b7 = (Book)list.get(6);
					Book b8 = (Book)list.get(7);
					Book b9 = (Book)list.get(8);
					Book b10 = (Book)list.get(9);
					Book b11 = (Book)list.get(10);
					Book b12 = (Book)list.get(11);
					Book b13 = (Book)list.get(12);
					Book b14 = (Book)list.get(13);
					Book b15 = (Book)list.get(14);
					Book b16 = (Book)list.get(15);
					Book b17 = (Book)list.get(16);
					Book b18 = (Book)list.get(17);
					Book b19 = (Book)list.get(18);
					Book b20 = (Book)list.get(19);
					ArrayList list2 = (ArrayList)ois.readObject();
					for(int i=0;i<list.size();i++){
						System.out.println("리스트"+(i+1)+"번째"+list.get(i).toString());
					}
					
				}catch(Exception ex){
				}finally{
					try{
						ois.close();
						fin.close();
					}catch(IOException ioe){}
				}
				
				FileOutputStream fout = null;
				ObjectOutputStream oos = null;
				ArrayList<Book> list = new ArrayList();
				 
				try{
					fout = new FileOutputStream("booklist.dat");
					oos = new ObjectOutputStream(fout);
					
					oos.writeObject(list);
					oos.reset();
					oos.writeObject(list);
					oos.reset();
					
					System.out.println("저장되었습니다.");
					
				}catch(Exception ex){
				}finally{
					try{
						oos.close();
						fout.close();
					}catch(IOException ioe){}
				}
				break;
			case 4 :
				go=false;
				break;
			
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager a = new BookManager();
		a.start();
	}

}
