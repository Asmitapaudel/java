import java.net.Socket;
import java.io.*;
public class FactClient{
  public static void main(String []a){
    try{
      //connection
      Socket soc=new Socket("localhost",12345);
      System.out.println("Client");

      //take input from user
      BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter Number:");
      int str=Integer.parseInt(userInput.readLine());

      //pass to Server
      PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
      out.println(str);

      BufferedReader in =new BufferedReader(new InputStreamReader(soc.getInputStream()));
      // int num2=Integer.parseInt(in.readLine());
      System.out.println("Factorial is:"+in.readLine());

    }catch(Exception e){
      e.printStackTrace();
    }
  }
}