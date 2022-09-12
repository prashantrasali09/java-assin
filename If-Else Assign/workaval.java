import java.util.Scanner;

public class workaval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of emp ");
        int age=sc.nextInt();
        System.out.println("enter the sex");
        String sex=sc.next();
        if(sex.equals("F")){
            System.out.println("Work only in urban Area");}
            else if(sex.equals("M")&&age>20&&age<40){
                System.out.println("He work any where");}
                else if(sex.equals("M")&&age>40&&age<60){
                    System.out.println("He works in urban Area");
                }else{
                    System.out.println("Error");
                }
    
                
        }
    }

