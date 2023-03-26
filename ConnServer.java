import java.net.Socket;
import java.net.ServerSocket;
public class ConnServer{
  public static void main(String []a){
    try{
      System.out.println("Waiting for client....");
      ServerSocket ss=new ServerSocket(12345);
      Socket soc=ss.accept();
      System.out.println("Connection Establish");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}