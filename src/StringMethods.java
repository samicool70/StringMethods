/**
 *@author: Sami Jr
 *@license GNU
 *@Date 9/14/2017
 *@Purpose To demonstrate how to use string methods
 */

public class StringMethods {
    public static void main(String [] args) {
        System.out.println("Levitate".substring(5));
        String newWord = new String("Interrogate");
        System.out.println("New Word: " + newWord);
        System.out.println("Elephant".substring(0, 5));
        System.out.println("Elephant".charAt(7));
        System.out.println(newWord.compareTo("Elephant"));
        System.out.println(newWord.concat(", don't cry"));
        System.out.println("Elephant".equals("eat"));
        System.out.println("Elephant".equalsIgnoreCase("Elephant"));
        System.out.println("Elephant".indexOf("Kate"));
        System.out.println("Elephant".lastIndexOf("a"));
        System.out.println(newWord.toLowerCase());
        System.out.println("run, google run!".toUpperCase());
        System.out.println("Glass".replace("s", "k"));
        System.out.println(String.valueOf(newWord));
        System.out.println("   I need some peaches   ".trim());

        StringBuffer stringBuffer = new StringBuffer();//Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
        stringBuffer.insert(0, "Elasticity");//Inserts the string into this character sequence.
        System.out.println("String Capacity: " + stringBuffer.capacity());
        System.out.println("String Length: " + stringBuffer.length());
        System.out.println("String: " + stringBuffer);
        stringBuffer.replace(2, 7, "LMNO");//Replaces the characters in a substring of this sequence with characters in the specified String
        System.out.println("String: " + stringBuffer);
        stringBuffer.append(" is rubbery!");
        stringBuffer.replace(2, 7, "asti");
        System.out.println(stringBuffer);

    }
}
