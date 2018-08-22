import java.util.Scanner;
class Found
{
public static void main(String[] args)
{
  int i,flag=1;
  int arr[]=new int[]{1,4,6,7,8,9,10};
  Scanner s=new Scanner(System.in);
  System.out.println("enter element to be found");
  int num=s.nextInt();
   for (i=0;i<arr.length;i++)
    {
       if (arr[i]==num)
          {
              flag=0;
          }
    }
    if (flag==0)
    {
     System.out.println("Element exist in the array");
    }
     else 
     {
      System.out.println("Element does not exist in the array");
     }
}
}
          