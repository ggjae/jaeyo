public class InputStreamReadertest {

 public static void main(String[] args) throws IOException {
  
  InputStreamReader ir = new InputStreamReader(System.in);
  OutputStreamWriter ow = new OutputStreamWriter(System.out);
  
  ow.write("�Է��ϼ���=>");
  ow.flush();
  
  // �迭�� ������ char[] �迭�� Ȱ���ؾ� �Ѵ�.
  
  int input=0;
  while((input=ir.read())!=-1){
   
   ow.write(input);
   ow.flush();
  }
  
  ir.close(); ow.close();

 }

 }
