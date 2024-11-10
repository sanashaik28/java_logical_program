import java.util.Scanner;
class GrossSalary
{
public static void main(String args[]) 
{
double hra,da,grossSalary;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the basic salary of the employee: ");
double basicSalary = sc.nextDouble();        
if (basicSalary <= 10000) 
{
hra = 0.20 * basicSalary;
da = 0.80 * basicSalary;
} 
else if (basicSalary <= 20000) 
{
hra = 0.25 * basicSalary;
da = 0.90 * basicSalary;
} 
else 
{
hra = 0.30 * basicSalary;
da = 0.95 * basicSalary;
}
grossSalary = basicSalary + hra + da;
System.out.println("Gross Salary of the employee: " + grossSalary);
}
}