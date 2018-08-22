import java.util.Scanner;
class Pattern
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number");
    int n=s.nextInt();
    int i,j;
    for (i=n;i>=1;i--)
    {
      for (j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}