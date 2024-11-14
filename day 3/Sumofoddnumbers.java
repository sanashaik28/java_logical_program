import java.util.Scanner;
class Sumofoddnumbers 
{
public static void main(String args[]) 
{
int n,sum=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter n value: ");
n = sc.nextInt();
for (int i = 1; i <= n; i+=2) 
{
            sum += i;
}
System.out.println("The sum of all even numbers between 1 and " + n + " is: " + sum);
}
}

