import java.util.Scanner;

public class Qn1 
{   
    static final double PI = 3.14159;
    public static void main(String [] args)   
    {   

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double circleArea = radius * radius * PI;
        System.out.printf("The area for the circle of radius %.1f is " + circleArea, radius);

    }   
}  