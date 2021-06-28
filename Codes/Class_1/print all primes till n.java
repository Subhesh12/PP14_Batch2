import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<=high;i++){
            
            int n = i;
            
            int flag = 0;
            
            for(int fact =2;fact*fact <= n;fact++){
                if(n % fact == 0){
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0){
                //System.out.println("prime");
                System.out.println(n);
            }
            
            
        }
    }
}