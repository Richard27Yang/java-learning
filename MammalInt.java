// Java 接口
/* 文件名 : NameOfInterface.java */
import java.lang.*;
//引入包


/* 文件名 : Animal.java */
interface Animal {
   public void eat();
   public void travel();
}


/* 文件名 : MammalInt.java */
public class MammalInt implements Animal{
 
   public void eat(){
      System.out.println("Mammal eats");
   }
 
   public void travel(){
      System.out.println("Mammal travels");
   } 
 
   public int noOfLegs(){
      return 0;
   }
 
   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}