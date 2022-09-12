import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year ");
        double yr=sc.nextDouble();
        if (( yr%400 == 0)|| (( yr%4 == 0 ) &&( yr%100 != 0))){
            System.out.println("Year is leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}

