import java.util.Arrays;
import java.util.Scanner;
public class missing_positive_int {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target=1;
        for(int i=0;i<n;i++){
        if(arr[i]==target){
            target++;

        }else if(arr[i]>target){
            System.out.println(target);
            return;
        }

    }
    System.out.println(target);
}
}