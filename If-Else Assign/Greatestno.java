import java.util.Scanner;

public class Greatestno {
    public static void main(String[] args) {
        Scanner no=new Scanner(System.in);
        System.out.println("enter the no");
        int a=no.nextInt();
        int b=no.nextInt();
        if(a>b){
            System.out.println("The Greatest no is"+a);
        }else{
            System.out.println("The Greatest no is"+b);
        }
    }
    
}
