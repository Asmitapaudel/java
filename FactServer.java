import java.net.Socket;
import java.net.ServerSocket;
import java.io.*;
public class FactServer{
  public static void main(String []a){
    try{
      System.out.println("Waiting for client....");
      ServerSocket ss=new ServerSocket(12345);
      Socket soc=ss.accept();
      System.out.println("Connection Establish");

      // data from client 
      BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
      int num=Integer.parseInt(in.readLine());

      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
      out.println(" "+num+" is "+calculateFact(num) );
    
    }catch(Exception e){
      e.printStackTrace();
    }
  }
     static int calculateFact(int number){
     int fact=1;
     for(int i=1;i<=number;i++){ 
      fact*=i;
     }
    return fact;
    }
}