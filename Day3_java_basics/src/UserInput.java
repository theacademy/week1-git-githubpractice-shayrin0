import java.util.Scanner;

public class UserInput {
    static public void main (String[] args) {
        int num;

        Scanner objScan = new Scanner(System.in);

        System.out.println("Enter a number:");
        num = objScan.nextInt();

        System.out.println("The number is " + num);
    }
}
