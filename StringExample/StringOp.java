public class StringOp {
    public static void main(String args[]) {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);  
        System.out.println( helloString );


        // String lenghth

        System.out.println("\n....String lenghth................................\n");
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );

        // Concatenating Strings

        System.out.println("\n....Concatenating Strings................................\n");
        String string1 = "saw I was ";
        System.out.println("Dot " + string1 + "Tod");

        // Creating Format Strings

        System.out.println("\n....Creating Format Strings................................\n");
        float floatVar = 2.35f;
        int intVar = 3;
        String stringVar = "hello";
        String fs;
        fs = String.format("The value of the float variable is " +
                        "%f, while the value of the integer " +
                        "variable is %d, and the string " +
                        "is %s", floatVar, intVar, stringVar);
        System.out.println(fs);


        // String Methods

        String str1 = "Strings are immutable";
        String str2 = new String("Arrays are mutable");


        char result1 = str1.charAt(8);   // Returns the character at the specified index.
        System.out.println(result1);

        int result2 = str2.compareTo( str1 );  // Compares two strings lexicographically.
        System.out.println(result2);

        result2 = str1.compareToIgnoreCase( str2 ); // Compares two strings lexicographically, ignoring case differences.
        System.out.println(result2);

        String result3 = str1.concat(", " + str2);  // Concatenates the specified string to the end of this string.
        System.out.println(result3);

        boolean result4 = str1.endsWith( "immutable" );   // Tests if this string ends with the specified suffix.
        System.out.println("Returned Value = " + result4);

        result4 = str1.endsWith( "immu" );
        System.out.println("Returned Value = " + result4 );

        result4 = str1.contentEquals( str2 );   // Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.
        System.out.println(result4);



     }
}
