import java.util.*;
public class sqrt {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int s=1;
            int e=n;
            int ans=0;
            if(n==1||n==0){
                System.out.print(n);
                return;
            }
            while(s<=e){
                int mid=(s+e)/2;
                long sq=(long)mid*mid;
                if(sq==n){
                    System.out.print(mid);
                    return ;
                }else if(sq<n){
                    ans=mid;
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }

            }  
            System.out.print(ans); 
    }
}
