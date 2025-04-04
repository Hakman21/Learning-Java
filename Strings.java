public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello World!";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("The length of the alphabet is: " + alphabet.length());

        System.out.println("Upper Case: " + greeting.toUpperCase());
        System.out.println("Lower Case: " + greeting.toLowerCase());


        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));



        String first_name = "Hak";
        String last_name = "Man";
        System.out.println("Concatenation: " + first_name + " " + last_name);
        System.out.println(first_name.concat(last_name));

        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)
        System.out.println("String and Int concat: " + z);


        /*

        \'	'	Single quote
        \"	"	Double quote
        \\	\	Backslash

        */

        String text1 = "We are the so-called \"Vikings\" from the north.";
        String text2 = "It\'s alright.";
        String text3 = "The character \\ is called backslash.";
        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);

        /*

        \n	New Line	
        \r	Carriage Return	- Moves the cursor to the beginning of the current line.
        \t	Tab	
        \b	Backspace - Deletes the previous character.
        \f	Form Feed - Moves the cursor to the next page (used in printers, rarely visible in modern output).

        */

        System.out.println(text1 + "\n" + text2);

    }
}