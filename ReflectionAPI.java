/*
Write a program in Java to access a constructor, a private field and a private method using Reflection API.
*/
import java.lang.reflect.*;

class Parent {
   void parentMethod() {
  }
}

class Child extends Parent {
  private String message;

   Child() {
    this.message = "Hello, World!";
  }

  private void childMethod() {
    System.out.println(this.message);
  }
}

public class ReflectionAPI {
  public static void main(String args[])  {
    Child c = new Child();

    // get Class Name
    Class<?> cs = c.getClass();
    String className = cs.getName();
    System.out.println("Class (Child) Name= " + className);

    // access Private method
    Method m[] = cs.getDeclaredMethods();
    for(int i = 0; i < m.length; i++) {
      System.out.println("Method in child class:"+m[i].getName());
    }

    // access private field
   Field f[] = cs.getDeclaredFields();
    for(int i = 0; i< f.length; i++){
      System.out.println(f[i].getName());
    }
    // access private constructor
    Constructor con[] = cs.getDeclaredConstructors();
    for(int i = 0; i< con.length; i++){
      System.out.println("Constructor :"+con[i].getName());
    }

        Class superClass = cs.getSuperclass();
        System.out.println("Super class name:"+superClass.getName());
      }
        // access Private method
    // Method parentMethod = superClass.getDeclaredMethod("parentMethod");
      // System.out.println("Method in super class:" + parentMethod.invoke(c));
}

