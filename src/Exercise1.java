import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args)
    {
        //calculate the area of rectangle
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();
        System.out.print("Enter the height:");
        height = scanner.nextDouble();
        area = width * height;
        System.out.print("the area is " +  area + " cm²"); //for superscript: Num lock on , press Alt and 0178
        scanner.close();
    }
}
