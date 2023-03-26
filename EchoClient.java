import java.net.Socket;
import java.io.*;
public class EchoClient{
  public static void main(String []a){
    try{
      //connection
      Socket soc=new Socket("localhost",12345);
      System.out.println("Client");

      //take input from user
      BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Somthing:");
      String str=userInput.readLine();

      //pass to Server
      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
      out.println(str);

      BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
      String str2=in.readLine();
      System.out.println(str2);

    }catch(Exception e){
      e.printStackTrace();
    }
  }
}