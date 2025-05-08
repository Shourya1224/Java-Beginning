import java.util.Scanner;

public  class Demo1{

    public static void main(String[] args) {
        int age ;
        System.out.println("(Enter your Age )");
        Scanner sc = new Scanner (System.in);
        age = sc.nextInt();

        switch (age) {
            case 18:
            System.out.println(" You are going to be an adult ");
            break;

            case 22:
            System.out.println("You are going to get a job");
            break;

            case 60:
            System.out.println("you are going to get retired ");
            break;

            default:
            System.out.println(" Enjoy your life ");
            break;

        }
        //System.out.println("Be Happy");


    
        }
        

    

}

