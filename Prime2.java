import java.util.Scanner;
class Prime2
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number");
    int n=s.nextInt();
    int i,j,count=0;
    for (i=1;i<=n;i++)
    {
      count=0;
      for (j=1;j<=n;j++)
      {
        if (i%j==0)
        {
        count++;
        }
      }
      if (count==2)
      {
        System.out.println(i);
      }
    }
  }
}