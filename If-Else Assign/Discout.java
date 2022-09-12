import java.util.Scanner;

public class Discout {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the unit");
        double unit=sc.nextDouble();
        double cost=unit*100;
        if(cost==1000){
            cost=1000-(0.1*1000);
            System.out.println("the actual cost is "+cost);
        }else{
            System.out.println("the actual cost is "+cost);
        }
    }
    
}
