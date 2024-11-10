import java.util.Scanner;
class Alphabetornot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char x;
System.out.println("enter x value");
x=sc.next().charAt(0);
if(x >= 'a' &&  x <= 'z' || x >= 'A' &&  x <= 'Z')
{
System.out.println("x is alphabet");
}
else
{
System.out.println("x is not an alphabet");
}
}
}