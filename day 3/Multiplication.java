import java.util.Scanner;
class Multiplication
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0;
System.out.println("enter n value;");
n=sc.nextInt();
for(int i=1;i<=20;i++)
{
System.out.println(n+"x"+i+"="+n*i);
}
}
}   
