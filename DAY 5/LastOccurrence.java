 class LastOccurrence
 {
public static void main(String[] args)
 {
        String myStr = "SANA";
        char searchChar = 'A';
        int lastIndex = myStr.lastIndexOf(searchChar);
        System.out.println("String: " + myStr);
        System.out.println("The last index of character '" + searchChar + "' in the string: " + lastIndex);
    }
}