import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        worker w1 = new worker();

        w1.name = "ahmet";
        w1.workingHours = 5;
        w1.wage = 250;
        w1.socialSecurityNumber = 27568246;


        w1.displaySalary();
        w1.displayInfo();


        worker w2 = new worker();

        Scanner input = new Scanner(System.in);

        System.out.println("enter the name:");
        String name = input.nextLine();

        System.out.println("enter workinghours:");
        int workingHours = input.nextInt();


        System.out.println("enter the social security number:");
        int socialSecurityNumber = input.nextInt();

        System.out.println("enter the wage:");
        float wage = input.nextFloat();

        System.out.println("w2 info:");
        w2.displayInfo();
        w2.displaySalary();

    }
}