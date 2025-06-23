import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        System.out.println("The values provided are");
        
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Enter the first digit");
         int a = sc.nextInt();
     
        System.out.println(" Enter the second digit");
           int b =sc.nextInt();
        int sum = a+b;

       
        System.out.println("The sum is");
         System.out.println(sum);
    }
    
}
