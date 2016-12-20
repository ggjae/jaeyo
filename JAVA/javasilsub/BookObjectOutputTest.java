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
		Book b1 = new Book("a0001", "�ڹٿϼ�1", "ȫ�浿", 10000, 1979, "���Ϲ�", 180);
		Book b2 = new Book("a0002", "��Ʈ����", "������", 27000, 1970, "������", 179);
		Book b3 = new Book("a0003", "���� EJB", "�輺��", 68000, 1997, "�����¾�⵵", 200);
		Book b4 = new Book("a0004", "�ڹٿϼ�2", "ȫ�浿", 50000, 1979, "���Ϲ�", 180);
		Book b5 = new Book("a0005", "��Ʈ����2", "������", 40000, 1971, "������", 179);
		Book b6 = new Book("a0006", "���� EJB2", "�輺��", 30000, 1997, "�����¾�⵵", 200);
		Book b7 = new Book("a0007", "�ڹٿϼ�3", "ȫ�浿", 2000, 1972, "���Ϲ�", 80);
		Book b8 = new Book("a0008", "��Ʈ����3", "������", 1000, 1973, "������", 79);
		Book b9 = new Book("a0009", "���� EJB3", "�輺��", 9500, 1994, "�����¾�⵵", 200);
		Book b10 = new Book("a0010", "�ڹٿϼ�4", "ȫ�浿", 8000, 1975, "���Ϲ�", 980);
		Book b11 = new Book("a0011", "��Ʈ����4", "������", 7000, 1976, "������", 879);
		Book b12 = new Book("a0012", "���� EJ4B", "�輺��", 6500, 1997, "�����¾�⵵", 700);
		Book b13 = new Book("a0013", "�ڹٿϼ�5", "ȫ�浿", 50000, 1977, "���Ϲ�", 680);
		Book b14 = new Book("a0014", "��Ʈ����5", "������", 40000, 1978, "������", 579);
		Book b15 = new Book("a0015", "���� EJ5B", "�輺��", 30000, 1999, "�����¾�⵵", 400);
		Book b16 = new Book("a0016", "�ڹٿϼ�6", "ȫ�浿", 10000, 1922, "���Ϲ�", 380);
		Book b17 = new Book("a0017", "��Ʈ����6", "������", 2000, 1923, "������", 379);
		Book b18 = new Book("a0018", "���� EJ6B", "�輺��", 2500, 1924, "�����¾�⵵", 300);
		Book b19 = new Book("a0019", "�ڹٿϼ�7", "ȫ�浿", 10000, 1925, "���Ϲ�", 180);
		Book b20 = new Book("a0020", "��Ʈ����7", "������", 2000, 1926, "������", 179);
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
			
			System.out.println("����Ǿ����ϴ�.");
			
		}catch(Exception ex){
		}finally{
			try{
				oos.close();
				fout.close();
			}catch(IOException ioe){}
		} // finally
	} // main end
} // class end
