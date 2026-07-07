import java.util.Scanner;
public class parking{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int hrs=sc.nextInt();
        int price=0;
        if(hrs<=2){
            price=hrs*20;
        }else if(hrs<=5){
            price=40+(hrs-2)*15;

        }else{
            price=40+45+(hrs-5)*10;
        }
        System.out.println(price);


    }
}