import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter registration number: ");
        String regNum = scanner.nextLine();
        
        System.out.print("Enter university: ");
        String university = scanner.nextLine();
        
        System.out.print("Enter mail id: ");
        String mailId = scanner.nextLine();
        
        System.out.print("Enter year: ");
        String year = scanner.nextLine();
        
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regNum);
        System.out.println("University: " + university);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Year: " + year);
        
        scanner.close();
    }
}