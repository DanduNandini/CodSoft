import java.util.Scanner;
public class StudentResult
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number of subjects:");
     int Subjects=sc.nextInt();
     int[] marks=new int[Subjects];
     int total=0;
     for (int i=0;i<Subjects;i++)
     {
      System.out.print("Enter marks for subject"+(i+1)+" out of 100 :");
      marks[i]=sc.nextInt();
      total+=marks[i];
    }
    double average=(double) total/Subjects;
    char grade;
    if(average>=90)
    {
      grade='A';
    }
    else if (average>=80)
    {
    grade='B';
    }
    else if (average>=70)
    {
      grade = 'C';
    }
    else if(average>=60)
    {
      grade = 'D';
    }
    else
    {
      grade = 'F';
   }
   System.out.println("\n Result");
   System.out.println("Total Marks:"+total+" out of "+(Subjects*100));
   System.out.println("Average Percentage:"+average+"%");
   System.out.println("Grade:"+grade);
   sc.close();
   }
   
}