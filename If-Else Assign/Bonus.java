import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the srvice year");
        double serv=sc.nextDouble();
        System.out.println("Enter the Salary");
        double sal=sc.nextDouble();
        if(serv>5){
            sal=sal+(0.05*sal);
            System.out.println("the total Salary" +sal);
        }else{
            System.out.println("the salary is "+sal);
        }
    }
    
}
