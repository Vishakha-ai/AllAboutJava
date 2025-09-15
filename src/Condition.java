import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        //if Statement performs block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;


        System.out.print("Enter your name:");
        name = scanner.nextLine();

        //Group 1
        if (name.isEmpty()) {
            System.out.println("You didn't enter your name 😕");
        } else {
            System.out.println("Hello " + name + "!😊");
        }

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //Group 2
        if (age >= 65) {
            System.out.println("You are a senior ! 👴 ");
        } else if (age < 0) {
            System.out.println("You havent been born yet!! 😇");
        } else if (age == 0) {
            System.out.println("You are a baby 👼");
        } else if (age >= 18) {
            System.out.println("You are a adult 👨‍💼");
        } else {
            System.out.println("You are a child 👩‍🦱");

        }

        //Group 3
        System.out.println("Are you a student?(true/false): ");
        isStudent = scanner.nextBoolean();

        if (isStudent)//no need to write the whole condition for bool
        {
            System.out.println("You are a student +👩‍🎓 ");
        } else {
            System.out.println("Not a Student 💼 ");
            scanner.close();
        }
    }
}
