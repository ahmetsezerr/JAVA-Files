import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        account hesap1 = new account("ahmet",1250);
        System.out.println( hesap1.getOwnername());
        System.out.println( hesap1.getBalance());
        hesap1.add(250);
        hesap1.setOwnerName("ahmet sezer");
        System.out.println( hesap1.getOwnername());
        System.out.println( hesap1.getBalance());
        hesap1.withDraw(510);
        System.out.println( hesap1.getBalance());


    }






}