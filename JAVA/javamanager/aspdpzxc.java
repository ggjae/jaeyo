public class InputStreamReadertest {

 public static void main(String[] args) throws IOException {
  
  InputStreamReader ir = new InputStreamReader(System.in);
  OutputStreamWriter ow = new OutputStreamWriter(System.out);
  
  ow.write("입력하세요=>");
  ow.flush();
  
  // 배열을 쓰려면 char[] 배열을 활용해야 한다.
  
  int input=0;
  while((input=ir.read())!=-1){
   
   ow.write(input);
   ow.flush();
  }
  
  ir.close(); ow.close();

 }

 }
