import java.util.Scanner;
class Uppercase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char x;
System.out.println("enter x value");
x=sc.next().charAt(0);
if(x >= 'a' &&  x <= 'z')
{
System.out.println("x is lower case");
}
else if(x>='A' && x<='Z')
{
System.out.println("x is upper case");
}
else
{
System.out.println("invalid");
}
}
}