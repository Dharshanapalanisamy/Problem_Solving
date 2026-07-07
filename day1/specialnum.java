import java.util.Scanner;
class specialnum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n/10;
        int b = n%10;
        if ((a+b)+(a*b)==n) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
    }
}