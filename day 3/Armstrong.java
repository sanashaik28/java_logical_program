import java.util.Scanner;
class Armstrong
{
public static boolean isArmstrong(int number)
 {
  int originalNumber = number;
  int numberOfDigits = String.valueOf(number).length();
  int sum = 0;
   while (number != 0)
  {
  int digit = number % 10;
  sum += Math.pow(digit, numberOfDigits);
  number /= 10;
  }
  return sum == originalNumber;
   }
   public static void main(String[] args) 
{
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number n: ");
 int n = sc.nextInt();
 System.out.println("Armstrong numbers between 1 and " + n + " are:");
 for (int i = 1; i <= n; i++) 
{
  if (isArmstrong(i)) 
{
  System.out.println(i);
}
}
}
}