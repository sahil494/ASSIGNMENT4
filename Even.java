import java.util.Scanner;
class Even
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number");
    int n=s.nextInt();
    int i;
    for (i=2;i<=n;i+=2)
    {
      {
        System.out.println(i);
      }
    }
  }
}