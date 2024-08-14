import java.util.Scanner;
public class IT24101984Lab4Q3  {
public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

 int number;
 String result;

 System.out.print("Enter a number : ");
 number = input.nextInt();


 result = (number > 0) ? "The number is positive" : (number < 0 ) ? "The number is Negative" : "The number is zero";

 System.out.print(result);

  }
}
 