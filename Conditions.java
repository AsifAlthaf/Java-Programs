import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90 && marks <=100){
            System.out.println("Grade A received");
        }else if(marks>=75 && marks <= 89){
            System.out.println("Grade B received");
        }else if(marks >= 60 && marks <= 74){
            System.out.println("Grade C received");
        }else{
            System.out.println("Uh Oh! You are Failed");
        }
        
        
        
        //Program 2 -> Switch CharSequence
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println("Result: "+ (a+b));
                break;
            case '-':
                System.out.println("Result: "+ (a-b));
                break;
            case '*':
                System.out.println("Result: "+ (a*b));
                break;
            case '/':
                System.out.println("Result: "+ (a/b));
                break;
            default:
                System.out.println("default case");
        }
        sc.close();
    }
}