import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
public class EchoServer{
  public static void main(String []a){
    try{
      System.out.println("Waiting for client....");
      ServerSocket ss=new ServerSocket(12345);
      Socket soc=ss.accept();
      System.out.println("Connection Establish");

      // data from client 
      BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
      String str=in.readLine();

      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
      out.println("Server:"+str);
    
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}