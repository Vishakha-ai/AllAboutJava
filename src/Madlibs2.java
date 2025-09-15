import java.util.Scanner;
public class Madlibs2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String adjective4;
        String verb1;
        String verb2;
        String verb3;
        String noun1;
        String noun2;

        System.out.print("Enter an Adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter another Adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter another Adjective: ");
        adjective3 = scanner.nextLine();

        System.out.print("Enter another Adjective: ");
        adjective4 = scanner.nextLine();

        System.out.print("Enter a verb: ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another verb: ");
        verb2 = scanner.nextLine();

        System.out.print("Enter another verb: ");
         verb3 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun1 = scanner.nextLine();

        System.out.print("Enter another noun: ");
        noun2= scanner.nextLine();

        System.out.println("Yesterday I went to " + adjective1 + " park to see if I could " + verb1 + " with my " +  noun1);
        System.out.println("Suddenly, a " + adjective2 + " " + noun2 + " appeared and started to " + verb2 + " around.");
        System.out.println("Everyone was so " + adjective3 + " that we decided to " + verb3 + " together.");
        System.out.println("It was the most " + adjective4 + " day ever.");
        System.out.println();

        scanner.close();
    }
}
