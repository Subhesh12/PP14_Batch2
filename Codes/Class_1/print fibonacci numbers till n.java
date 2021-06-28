import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int prev = 0;
      int curr = 1;
      
      int i =1;
      while(i<=n){
          System.out.println(prev);
          
          int nextfib = prev + curr;
          prev = curr;
          curr = nextfib;
         
         i++; 
      }
   }
  }