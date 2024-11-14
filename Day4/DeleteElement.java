import java.util.Scanner;

public class DeleteElement{

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create the array
        int[] array = new int[n];
        
        // Input: Elements of the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the position (index) of the element to delete (0 to " + (n - 1) + "): ");
        int position = scanner.nextInt();
       
        if (position < 0 || position >= n) {
            System.out.println("Invalid position!");
        } else {
      
            for (int i = position; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
           
            array[n - 1] = 0; // You could also set it to a different value if needed
            
            System.out.println("Array after deletion:");
            for (int i = 0; i < n - 1; 
               }
