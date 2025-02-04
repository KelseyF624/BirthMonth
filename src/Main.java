import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the month you were born.(1-12)");
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        if (month < 1 || month > 12) { System.out.println("Invalid month. You entered "+ month); return; }
        else if (month >= 1 || month <= 12) {System.out.println("Your birth month is " + month);}
    }
}