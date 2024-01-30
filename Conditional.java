public class Conditional {
    public static void main(String[] args){
        //if statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        //if else statement
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //nested if else statement
        int age = 18;
        if (age >= 18) {
            if (age < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

    }
}
