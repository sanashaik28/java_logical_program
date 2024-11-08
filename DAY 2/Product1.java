import java.util.Scanner;
class Product{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String pname;
int pnum;
int pcost;
float pquantity;
float Bill;
System.out.println("Enter a product name:");
pname=sc.next();
System.out.println("Enter a product number:");
pnum=sc.nextInt();
System.out.println("Enter a product cost:");
pcost=sc.nextInt();
System.out.println("Enter a product quantity:");
pquantity=sc.nextFloat();
Bill=pcost*pquantity;
System.out.println("total bill is:"+Bill);
System.out.println("The given product name is:"+pname);
System.out.println("The given product number is:"+pnum);
System.out.println("The given product cost is:"+pcost);
System.out.println("How many "+pname+" we want:"+pquantity);
}
}




