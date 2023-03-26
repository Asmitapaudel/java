import java.net.Socket;
public class ConnClient{
  public static void main(String []a){
    try{
      Socket soc=new Socket("localhost",12345);
      System.out.println("Client");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}