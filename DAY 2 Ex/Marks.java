import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
int phy,che,bio,maths,comp,Percentage,total;
Scanner sc=new Scanner(System.in);
System.out.println("enter physics marks");
phy=sc.nextInt();
System.out.println("enter chemistry marks");
che=sc.nextInt();
System.out.println("enter biology marks");
bio=sc.nextInt();
System.out.println("enter maths marks");
maths=sc.nextInt();
System.out.println("enter computer  marks");
comp=sc.nextInt();
total=phy+che+bio+maths+comp;
Percentage=total*100/500;
if(Percentage >= 90)
{
System.out.println("Grade A");
}
else if(Percentage >= 80)
{
System.out.println("Grade B");
}
else if(Percentage >= 70)
{
System.out.println("Grade C");
}
else if(Percentage >= 60)
{
System.out.println("Grade D");
}
else if(Percentage >= 40)
{
System.out.println("Grade E");
}
else if( Percentage < 40)
{
System.out.println("Grade F");
}
else
{
System.out.println("Fail");
}
}
}

