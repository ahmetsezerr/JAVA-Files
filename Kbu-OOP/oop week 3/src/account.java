import java.util.Scanner;

public class account {
    private double balance;
    private String ownerName;


    public account(String name, double balance) {
        this.balance = balance;
        this.ownerName = name;
    }

    public void add(double amount) {

        balance = balance + amount;
    }

    public double withDraw(double amount) {
        int counter = 0;
        int password = 1234;


        System.out.println("please enter your password");


        while (counter != 4) {

            counter++;
            if (counter == 4) {
                System.out.println("your account has been blocked.Please try again later.");
                return 0;
            }

            Scanner scanner = new Scanner(System.in);
            int pass = scanner.nextInt();

            if (pass == password) {
                System.out.println("password is correct:");


                if (balance < amount) {
                    System.out.println("there is not enough money in the balance");
                } else {

                    balance = balance - amount;
                    System.out.println("the money withdraw successfully");
                }
                return 0;// şifrenin devamlı sorulmaması için. return koyduk
            } else {
                System.out.println("password is not correct try again");
            }
        }
        return 0;
    }

    public double getBalance() {
        return this.balance;// this kullanmamızn sebebi balanceın private olması bu şekilde erişebildik.
    }

    public String getOwnername() {
        return this.ownerName;

    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;

    }


}





