import java.util.Scanner;

public class Qn4
{   
    public static void main(String [] args)   
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int inputYear = input.nextInt();
        String[] zodiac = {
            "monkey",
            "rooster",
            "dog",
            "pig",
            "rat",
            "ox",
            "tiger",
            "rabbit",
            "dragon",
            "snake",
            "horse",
            "sheep",
        };
        System.out.print(zodiac[inputYear%12]);
    }   
}  
