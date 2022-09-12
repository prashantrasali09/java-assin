import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        double a=sc.nextDouble();
        if(a<0){
            a=-(a);
            System.out.println("the given value is"+a);
        }else{
            System.out.println("the value of a is "+a);
        }
    }
}
