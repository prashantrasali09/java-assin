import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter theb subject Marks");
        int hindi=sc.nextInt();
        int english=sc.nextInt();
        int maths=sc.nextInt();
        int sci=sc.nextInt();
        int phe=sc.nextInt();
        if(hindi>80){
            System.out.println("the grade is A");
        }else if(hindi<80&&hindi>60){
            System.out.println("the grade is B");
        }else if(hindi<60&&hindi>50){
            System.out.println("the grade is C");
        }else if(hindi<50&&hindi>45){
            System.out.println("the grade is D");
        }else if(hindi<45&&hindi>25){
            System.out.println("the grade is E");
        }else if(hindi<25){
            System.out.println("the grade is F");
        }
        if(english>80){
            System.out.println("the grade is A");
        }else if(english<80&&english>60){
            System.out.println("the grade is B");
        }else if(english<60&&english>50){
            System.out.println("the grade is C");
        }else if(english<50&&english>45){
            System.out.println("the grade is D");
        }else if(english<45&&english>25){
            System.out.println("the grade is E");
        }else if(english<25){
            System.out.println("the grade is F");
        }
        if(maths>80){
            System.out.println("the grade is A");
        }else if(maths<80&&maths>60){
            System.out.println("the grade is B");
        }else if(maths<60&&maths>50){
            System.out.println("the grade is C");
        }else if(maths<50&&maths>45){
            System.out.println("the grade is D");
        }else if(maths<45&&maths>25){
            System.out.println("the grade is E");
        }else if(maths<25){
            System.out.println("the grade is F");
        }
        if(phe>80){
            System.out.println("the grade is A");
        }else if(phe<80&&phe>60){
            System.out.println("the grade is B");
        }else if(phe<60&&phe>50){
            System.out.println("the grade is C");
        }else if(phe<50&&phe>45){
            System.out.println("the grade is D");
        }else if(phe<45&&phe>25){
            System.out.println("the grade is E");
        }else if(phe<25){
            System.out.println("the grade is F");
        }
        if(sci>80){
            System.out.println("the grade is A");
        }else if(sci<80&&sci>60){
            System.out.println("the grade is B");
        }else if(sci<60&&sci>50){
            System.out.println("the grade is C");
        }else if(sci<50&&sci>45){
            System.out.println("the grade is D");
        }else if(sci<45&&sci>25){
            System.out.println("the grade is E");
        }else if(sci<25){
            System.out.println("the grade is F");
        }

    }
}
