import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
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
public class BookObjectOutputTest{

	public static void main(String[] args) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		ArrayList<Book> list = new ArrayList();
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
		} // finally
	} // main end
} // class end
