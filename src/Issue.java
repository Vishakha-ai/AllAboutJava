import java.util.Scanner;
public class Issue {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("your age is: " + age);
        scanner.nextLine();
        //put the above command in order to not mix up the fav color and int age together


        System.out.println("your fav color? ");
        String color = scanner.nextLine();
        System.out.println(color + " Is your fav color");

    }
}
