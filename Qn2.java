import java.util.Scanner;

public class Qn2 
{   
    public static void main(String [] args)   
    {   

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextFloat();
        double num2 = input.nextFloat();
        double num3 = input.nextFloat();

        System.out.printf("The average of %.1f %.1f %.1f is %.1f", num1, num2, num3, (num1+num2 +num3)/3);
    }   
}  