import java.util.Scanner;

public class Rev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        int reverse=0;
        while (n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
                n = n/10;
        }System.out.println("the reverse no is"+reverse);
     }
}
