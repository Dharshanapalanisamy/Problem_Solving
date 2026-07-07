import java.util.*;
public class currency {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int amnt=sc.nextInt();
    int curr[]={500,200,100,50,20,10};
    int balance=0;
    for (int i=0;i<curr.length;i++){
        if(amnt>=curr[i]){
            int check=amnt/curr[i];
            amnt=amnt%curr[i];
            System.out.println(curr[i]+"="+check);
        }
        else{
            System.out.println(curr[i]+"="+0);
        }
    }
        
    }
}

