import java.util.Scanner;
class Employee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int eno;
String ename;
float esal;
System.out.println("Enter employee number:");
eno=sc.nextInt();
System.out.println("Enter employee name:");
ename=sc.next();
System.out.println("Enter employee salary:");
esal=sc.nextFloat();
System.out.println("the given employee number is:"+eno);
System.out.println("the given employee name is:"+ename);
System.out.println("the given employee salary is:"+esal);
}
}


