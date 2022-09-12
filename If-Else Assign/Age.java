import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ages");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
       if(a1>a2&&a1>a3){
        System.out.println("the oldeest is a1 and age is"+a1); }
        else if(a2>a1&&a2>a3){
            System.out.println("the oldest is a2 and age is"+a2);
        }else if(a3>a2&&a3>a1){
            System.out.println("the oldest age is a3 and age is"+a3);}
       if(a1<a2&&a1<a3){
            System.out.println("the youngest is a1 and age is"+a1); }
            else if(a2<a1&&a2<a3){
                System.out.println("the youngest is a2 and age is"+a2);
            }else if(a3<a2&&a3<a1){
                System.out.println("the youngest age is a3 and age is"+a3);}
            }}