import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int ndash = n;
      int pow = 1;
      while(ndash >= 10){
          ndash = ndash/10;
          pow = pow * 10;
      }
      
      while(pow>0){
          int firstdigit = n / pow;
          System.out.println(firstdigit);
          n = n % pow;
          
          pow = pow/10;
      }
      
     }
    }