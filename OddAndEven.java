import java.util.Scanner;
public class OddAndEven{
  public static void main(String []args){
    int [] array=new int[10];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 10 number");
    for(int i=0;i<array.length;i++){
      array[i]=s.nextInt();
    }
    System.out.println("Even numbers are;");
    for(int i=0;i<array.length;i++){
      if(array[i]%2==0){
        System.out.println(array[i]);
      }
    }
     System.out.println("odd numbers are;");
    for(int i=0;i<array.length;i++){
      if(array[i]%2==1){
        System.out.println(array[i]);
      }
    }
  }
}