import java.util.Scanner;
public class IT24101984Lab4Q1  {
public static void main(String[] args)  {

 Scanner input = new Scanner(System.in);

  double num;

 //Get the user input
 
  System.out.print("Enter a number : ");
   num = input.nextDouble();

  //Condition
  if (num > 0)
  {
   System.out.print("The number is : Positive");
   }

  else if (num < 0)
  {
   System.out.print("The number is : Negative");
  }
  
  else
   {
    System.out.print("The number is zero");
    }


  }
}
  