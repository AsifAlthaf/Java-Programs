import java.util.*;

public class Activity3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        //Program 1
        
        int n = sc.nextInt();
        for(int i=10;i>0;i--){
            System.out.println(n+"x"+i+" = "+(n*i));
        }
        
        // Program 2 
        int i = 1;
        System.out.println("Hello!");
        do{
            System.out.print(i+ " ");
            i++;
        }while(i<=5);
        System.out.println("\nProgram Exited");
        
        sc.close();
    }
}