import java.util.Scanner;
class Count
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num,count=0;
System.out.println("enter a number:");
num=s.nextInt();
if(num==0)
{
count=1;
}
else
{
while(num!=0)
{
num/=10;
count++;
}
}
System.out.println("the count of a number is:"+count);
s.close();
}
}

