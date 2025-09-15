import java.util.Scanner;
public class Input {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: " );
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: " );
        int age =scanner.nextInt();
        System.out.println("your age is:" + age);

        System.out.printf("What is your gpa? ");
        double gpa = scanner.nextDouble();
        System.out.println("your gpa is: " + gpa );

        System.out.println("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent)
        {
            System.out.println("you are a student");
        }
        else {
            System.out.println("not a student");
        }

        scanner.close();
    }
}
