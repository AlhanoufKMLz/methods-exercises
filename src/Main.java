//Alhanouf Allazzam

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        1 - Write a Java method to find the smallest number among three numbers.
//                Test Data:
//        Input the first number: 25
//        Input the Second number: 37
//        Input the third number: 29
//        Expected Output:
//        The smallest value is 25.0
        System.out.println("-----------------------");
        System.out.println("EXERCISE #1");
        System.out.println("-----------------------");

        System.out.print("Please enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter the 2nd number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter the 3rd number: ");
        int num3 = input.nextInt();

        System.out.println("The smallest number: " + findSmallest(num1, num2, num3));



//        2 - Write a Java method that check if the entered number is negative or
//        positive or zero.
        System.out.println("\n-----------------------");
        System.out.println("EXERCISE #2");
        System.out.println("-----------------------");

        System.out.print("Please enter number: ");
        int num = input.nextInt();

        System.out.println("The number " + num + " is " + checkNumber(num) + " number.");


//        3 - Write a Java method to check whether a string is a valid password.
//        Password rules:
//          A password must have at least ten characters.
//          A password consists of only letters and digits.
//          A password must contain at least two digits.
//        Expected Output:
//        1. A password must have at least eight characters.
//        2. A password consists of only letters and digits.
//        3. A password must contain at least two digits
//        Input a password (You are agreeing to the above Terms and Conditions.):
//        abcd1234
//        Password is valid: abcd1234
        System.out.println("\n-----------------------");
        System.out.println("EXERCISE #3");
        System.out.println("-----------------------");

        printRules();

        System.out.print("Input a password (You are agreeing to the above Terms and Conditions): ");
        input.nextLine();
        String password = input.nextLine();

        do{
            if(checkLength(password) && isOnlyLettersAndDigits(password) && isContainTwoDigits(password)){
                System.out.println("Password is valid: " + password);
                break;
            }
            else {
                System.out.println("This is NOT a valid password.\n");
                printRules();
                System.out.print("Please enter valid password: ");
                password = input.nextLine();
            }
        }while(true);

    }

    //EXERCISE #1
    public static double findSmallest(int num1, int num2, int num3){
        return Math.min(num1, Math.min(num2, num3));
    }

    //EXERCISE #2
    public static String checkNumber(int num){
        if(num == 0) return "ZERO";
        if(num > 0) return "POSITIVE";
        return "NEGATIVE";
    }

    //EXERCISE #3
    public static void printRules(){
        System.out.println("1. A password must have at least eight characters." +
                           "\n2. A password consists of only letters and digits." +
                           "\n3. A password must contain at least two digits");
    }

    public static boolean checkLength(String password) {
        return password.length() >= 10;
    }

    public static boolean isOnlyLettersAndDigits(String password){
        return password.matches("[a-zA-Z0-9]+");
    }

    public static boolean isContainTwoDigits(String password){
        int digitCount = 0;
        for(int i = 0; i < password.length() && digitCount < 2; i++){
            if(Character.isDigit(password.charAt(i)))
                digitCount++;
        }
        return digitCount == 2;
    }
}