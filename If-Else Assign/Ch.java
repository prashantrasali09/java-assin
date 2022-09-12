import java.util.Scanner;
public class Ch{
    public static void main(String []args) {
       System.out.println("Checking for Uppercase character...");
       Scanner sc=new Scanner(System.in);
       char val = sc.next().charAt(0);
       System.out.println("Character: "+val);
       if (Character.isUpperCase(val)) {
          System.out.println("Character is in Uppercase!");
       }else {
          System.out.println("Character is in Lowercase!");
       }
    }
 }
  
    

