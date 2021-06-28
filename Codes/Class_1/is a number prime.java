import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       
       for(int i=1;i<=t;i++){
           
           int n = scn.nextInt();
          
          int flag = 0;
            for(int fact = 2; fact* fact <= n ; fact++){
                if(n % fact == 0){
                    flag = 1;
                    break;
                }
                
            }
           
           if(flag == 0){
               System.out.println("prime");
           }else{ // flag 1
               System.out.println("not prime");
           }
           
           
       }
  
   }
  }