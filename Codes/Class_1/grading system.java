import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      
      
      // code here
      
      if(marks > 90){
          System.out.println("excellent");
      }else if(80 < marks ){
           System.out.println("good");
      }else if(70 < marks){
           System.out.println("fair");
      }else if(60 < marks){
           System.out.println("meets expectations");
      }else{
           System.out.println("below par");
      }
   }
  }