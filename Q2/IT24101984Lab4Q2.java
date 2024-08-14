import java.util.Scanner;

public class IT24101984Lab4Q2  {
public static void main(String[] args)  {
 
Scanner input = new Scanner(System.in);

 float exMarks,labSub,markPre,labPre,finMark,totPres;

 //User input

 System.out.print("Enter your exams marks : ");
 exMarks = input.nextFloat();

 //Validate the input
  if (exMarks > 100 || exMarks < 0)
  {
   System.out.print("Invaid Input for exam marks. Terminating program..");
   return;
  }



  System.out.print("Please enter the lab submission marks (out of 100) : ");
  labSub = input.nextFloat();

  //Validate the input2
  if (labSub > 100 || labSub <0) 
  {
    System.out.print("Invaid Input for exam marks. Terminating program..");
    return;
  }



  System.out.print("Please enter the percentage given for the exam : ");
  markPre = input.nextFloat();

   System.out.print("Please enter the percentage given for the exam : ");
   labPre = input.nextFloat();


 if (markPre > 100 || markPre <0 )
   {
     System.out.print("The precentage must add ip to 100. Terminating the program..");
     return;
    }


 if (labPre > 100 || labPre < 0)
 { 
  System.out.print("The precentage must add ip to 100. Terminating the program..");
  return;
  }
     

 totPres = markPre + labPre;

  //Validate totPres
  if (totPres > 100 || totPres < 0) 
  {
   System.out.print("The precentage must add ip to 100. Terminating the program..");
   return;
   }

 //Final Marks
   
  finMark = (exMarks * markPre / 100) + (labSub * labPre / 100);

//Display final mark

  System.out.print("Final exam mark is : " + finMark);


  }
 }

