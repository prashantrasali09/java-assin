import java.util.Scanner;
public class medica {
   


   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("Is student have medical issue");
   String med=sc.next();
   if(med.equals("Yes")){
    System.out.println("Allowed to sit in Exam");
   }else if(med.equals("No")){
    System.out.println("Not allowed");
   }

   }

}


