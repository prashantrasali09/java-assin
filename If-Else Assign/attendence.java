import java.util.Scanner;

public class attendence {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the no of clas held");
   float ch=sc.nextFloat();
   System.out.println("enter the no of class attend");
   float ca=sc.nextFloat();
   float att=ca/ch*100;
   System.out.println("the percentage of attendece is"+att);
   if(att>75){
    System.out.println("Allowed to sit in Exam");
   }else{
    System.out.println("Not allowed");
   }

   }

}
