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
			System.out.println("������� : "+ list.get(i).toString());
	}
	void searchBook(){
		int menu,i,search;
		String s123;
		Scanner s = new Scanner(System.in); 
		System.out.println("1. ���ڸ� 2. �ܰ� 3. ���ǻ� 4. isbn 5. ���ǳ⵵ 6. �α⵵");
		menu = s.nextInt();
		switch (menu)
		{
		case 1 : 
			System.out.println("���ڸ��� �Է��ϼ���");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getAuthor().contains(s123)){
					System.out.println("���� "+list.get(i).toString());
				}
			}
			
			
			break;
		case 2 :
			System.out.println("�ܰ��� �Է��ϼ���");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPrice()==(search)){
					System.out.println("���� "+list.get(i).toString());
				}
			}
			break;
		case 3 :
			System.out.println("���ǻ縦 �Է��ϼ���");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPublisher().contains(s123)){
					System.out.println("���� "+list.get(i).toString());
				}
			}
			break;
		case 4 :
			System.out.println("isbn�� �Է��ϼ���");
			s123 = s.next();
			for(i=0;i<list.size();i++){
				if(list.get(i).getIsbn().contains(s123)){
					System.out.println("���� "+list.get(i).toString());
				}
			}
		case 5 :
			System.out.println("���ǳ⵵�� �Է��ϼ���");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPubyear()==(search)){
					System.out.println("���� "+list.get(i).toString());
				}
			}
			
		case 6 :
			System.out.println("�α⵵�� �Է��ϼ���");
			search = s.nextInt();
			for(i=0;i<list.size();i++){
				if(list.get(i).getPoint()==(search)){
					System.out.println("���� "+list.get(i).toString());
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
			System.out.println("1 : ������� 2 : �����˻� 3 : ������� �����ϱ� 4 : ����");
			System.out.print("�޴����� : ");
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
						System.out.println("����Ʈ"+(i+1)+"��°"+list.get(i).toString());
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
					
					System.out.println("����Ǿ����ϴ�.");
					
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
