import java.util.Scanner;
class Armstrong{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
int remainder=0,result=0,orig;
orig=num;
while (num!=0)
{
remainder=num%10;
result=result+remainder*remainder*remainder;
num=num/10;
}
if (orig==result)
{
System.out.println("Number is Armstrong no.");
}
else 
{
System.out.println("Number is not an armsttrong");
}
}
}
