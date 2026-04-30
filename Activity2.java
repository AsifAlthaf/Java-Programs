public class Activity2{
    public static void main(String[] args) {
        
        //To calculate the sum, Difference, product, Remainder of two numbers
        int a = 15, b = 4;
        System.out.println("Sum: "+ (a+b));
        System.out.println("Difference: "+ (a-b));
        System.out.println("Product: "+ (a*b));
        System.out.println("Remainder: "+ (a%b));
        
        
        //To check if a student is Eligible for Placement using logical operators
        int cgpa = 8;
        Boolean backlogs = false;
        if(cgpa >= 7 && backlogs==false){
            System.out.println("Eligible for Placement");
        }else{
            System.out.println("Not Eligible for Placement");
        }
    }
}