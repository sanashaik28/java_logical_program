import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int year;
System.out.println("enter a year number");
year=sc.nextInt();
if(year%400==0 && year%100==0)
{
System.out.println("year is a leap year");
}
else
{
System.out.println("not a leap year");
}
}
}