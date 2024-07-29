import java.util.*;

public class project {
    public static void main(String[] args) {
        System.out.println("Hello welcome to food app");
        System.out.println("Please create password");
        Scanner scan = new Scanner(System.in);
        String pass1 = scan.next();
        System.out.println("Your password is now: " + pass1);
        System.out.println("Please enter your password:");
        String pass = scan.next();
        while (!pass.equals(pass1)) {
            System.out.println("This is not your password try again!");
            pass = scan.next();
        }
        System.out.println("Access Granted");
        System.out.println("ARE YOU HUNGRY! YES OR NO?");
        String ans1 = scan.next();
        if (ans1.equalsIgnoreCase("yes")) {
            System.out.println("Choose what do you want to eat pizza, burger, fish");
            String ans2 = scan.next();
            while (!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")) {
                System.out.println("Sorry we don't have those choose between pizza, burger, fish");
                ans2 = scan.next();
            }
            if (ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")) {
                System.out.println("Do you want something to drink!");
                String ans3 = scan.next();
                while (!ans3.equalsIgnoreCase("yes") && !ans3.equalsIgnoreCase("no")) {
                    System.out.println("Wrong command try again");
                    ans3 = scan.next();
                }
                if (ans3.equalsIgnoreCase("yes")) {
                    System.out.println("What do you want to drink coke or juice");
                    String ans4 = scan.next();
                    while (!ans4.equals("coke") && !ans4.equals("juice")) {
                        System.out.println("Wrong command try again");
                        ans4 = scan.next();
                    }
                    if (ans4.equals("coke") || ans4.equals("juice")) {
                        System.out.println("Great you have ordered " + ans2 + " and " + ans4);
                    }
                } else {
                    System.out.println("You have ordered " + ans2);
                }
            }
            System.out.println("Please confirm your password");
            pass = scan.next();
            while (!pass.equals(pass1)) {
                System.out.println("This is not your password try again!");
                pass = scan.next();
            }
            System.out.println("Your order is on the way!!");
        } else {
            System.out.println("Alright have a nice day!");
        }
    }
}