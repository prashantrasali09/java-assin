import java.util.Scanner;

public class checksquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        if(a==b){
            System.out.println("Given Rectangle is a Square");
         }else{
            System.out.println("Given is not a Square");
         }
    }
}