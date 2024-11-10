import java.util.Scanner;
class Maximum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,max;
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
if(a>b)
{
max=a;
}
 else
{
max=b;
}
System.out.printf("the maximum number beteween " +a+" and " +b+ " is:"+max);
}
}
