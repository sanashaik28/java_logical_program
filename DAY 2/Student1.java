import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sno,maths,os,java,total;
String sname;
float savg;
System.out.println("enter student number:");
sno=sc.nextInt();
System.out.println("enter student name:");
sname=sc.next();
System.out.println("enter maths marks:");
maths=sc.nextInt();
System.out.println("enter os marks:");
os=sc.nextInt();
System.out.println("enter java marks:");
java=sc.nextInt();
total=maths+os+java;
savg=total/3;
 System.out.println("student number is:"+sno);
 System.out.println("student name is:"+sname);
 System.out.println(" marks scored in maths:"+maths);
 System.out.println(" marks scored in os:"+os);
 System.out.println(" marks scored in java:"+java);
 System.out.println("total marks:"+total);
 System.out.println("average of marks:"+savg);
}
}

 


