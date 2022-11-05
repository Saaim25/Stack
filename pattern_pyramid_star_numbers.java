import java.util.*;
public class pattern_pyramid_star_numbers {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
        int a = n+1;
       
       int i=1;
       while(i<=a){
           if(i==1){
                System.out.println("*");
                i++;
                
            }else{
                System.out.print("*");
                
                int j=1;
                while(j<=i-1){
                    System.out.print(j);
                    j++;
                }
                
                int k=i-2;
                while(k>0){
                    System.out.print(k);
                    k--;
                }
                
                System.out.println("*");
                i++;
            }
       }
       int l=n;
       while(l>0){
           if(l==1){
                System.out.println("*");
                l--;
                
            }else{
                System.out.print("*");
                
                int j=1;
                while(j<=l-1){
                    System.out.print(j);
                    j++;
                }
                
                int k=l-2;
                while(k>0){
                    System.out.print(k);
                    k--;
                }
                
                System.out.println("*");
                l--;
            }
       }
        
    }
}
