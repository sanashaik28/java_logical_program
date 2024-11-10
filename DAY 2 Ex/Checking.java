import java.util.Scanner;
class Checking
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
System.out.println("enter an input:");
ch=sc.next().charAt(0);
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
System.out.println("it is an alphabet");
}
else if(ch>='!'||ch<='*')
{
System.out.println("special character");
}
else
{
System.out.println("integer");
}
}
}