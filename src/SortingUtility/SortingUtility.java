package SortingUtility; /**
 * ABC Company Sorting Utility class. Utility class for useful Java methods.
 * Used to implement bubblesort and quicksort on the SortingUtility.ProductList.java class.
 *
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 * @author
 * @author
 *
 * @@ - indicates comment to be deleted.
 * TODO: ADD YOUR INFORMATION TO AUTHOR LIST
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class SortingUtility {
    private static Scanner keyboard = new Scanner(System.in); //used by all methods, MUST be kept clean
    private static final int SCREEN_HEIGHT = 50;

    /**
     * private class method bubbleSort called by public sort method
     */
    private void bubbleSort(){

    }

    /***** @@NOTES QUICK SORT CLASS IMPLEMENTATION*****/
    /*
    For the extra credit assignment in Chapter 12, #8 (QuickSort), the split point formula they gave in the book is wrong.
    Here is the correct formula.
        splitPoint = (a[begin] + a[end] + a[size/2]) / 3
    */

       /* public class QuickSort
        {
            // QUICKSORT Display 12.8 (pp.701)

            public static void sort(double[] a, int begin, int end)
            {
                if((end - begin) >= 1)
                {
                    int splitPoint = split(a, begin, end);
                    sort(a, begin, splitPoint);
                    sort(a, splitPoint + 1, end);
                    join(a,begin, splitPoint, end);
                }// else sorting one (or fewer) elements so do nothing.

            }

            public static int split(double[] a, int begin, int end)
            {
                double[] temp;
                int size = (end - begin + 1);

                temp = new double[size];

                double splitValue = a[begin];

                int up = 0;
                int down = size -1;

                // Note that a[begin] = splitValue is skipped.

                for ( int i = begin + 1; i <= end; i++)
                {
                    if (a[i] <= splitValue)
                    {
                        temp[up] = a[i];
                        up++;
                    }
                    else
                    {
                        temp[down] = a[i];
                        down--;
                    }
                }

                // 0 < up = down < size

                temp[up] = a[begin]; // positions the split value

                //temp[i] <= splitValue for i < up
                // temp[up] = splitValue
                // temp[i] > splitValue for i > up

                for(int i = 0; i < size; i++)
                {
                    a[begin + i] = temp[i];
                }
                return (begin + up);
            }

            private static void join(double[] a, int begin, int splitPoint, int end)
            {
                // do nothing.
            }


    }*/


    /**
     * private class method quickSort called by public sort method
     */
    private void quickSort(){

    }

    /**
     * Sorting Utility method to sort list of products either by quick sort method or bubble sort method.
     *
     * @param items the product list containing the items(Products) to be sorted.
     * @param sortingApproach an integer (1 or 2) indicating sorting method (1. quickSort, 2. bubbleSort)
     * @return returns a list of sorted products to the client.
     */
    public List<Product> sort(List<Product> items, int sortingApproach){


        return items; //stub
    }


    /****************************** @@EXTRA USEFUL JAVA METHODS ******************************/
    /**
     * Centers and prints text value within total width (like width in printf) given for one line,
     * ends with new line (uses getCentered method)
     *
     * @param width minimum width for one line, assuming width is greater than text length
     * @param text string value to be displayed in centered format
     */
    public static void printCentered(int width, String text)
    {
        System.out.println( SortingUtility.getCentered(width, text) );
    }

    /**
     * Centers and returns text value within total width (like width in printf) given
     *
     * @param width minimum width for one line, assuming width is greater than text length
     * @param text string value to be put in centered format
     *
     * @return text centered within width given, padded on right with spaces
     */
    public static String getCentered(int width, String text)
    {
        int leftWidth, rightPadding;
        String specData, specPadding, fullSpec;

        leftWidth = (width + text.length() ) / 2;
        rightPadding = width - leftWidth;

        specData = "%" + leftWidth + "s";
        specPadding = "%" + rightPadding + "s";
        fullSpec = specData + specPadding;

        return String.format(fullSpec, text, ""); //"" is so spaces get padded to the right
    }

    /**
     * Creates line of text using given length and symbol
     *
     * @param length number of characters long line should be
     * @param symbol character to use in line
     *
     * @return String of given length of symbols, no new line at the end
     */
    public static String getLine(int length, char symbol)
    {
        String result = "";

        for(int i = 0; i < length; i++)
        {
            result += symbol;
        }

        return result;
    }

    /**
     * Reads input from user until valid integer value entered (error-checked using bounds)
     *
     * @param prompt string value containing the question to ask user for input (assuming in format "question: ")
     * @param lower an integer for the lower bounds for input, assume lower < upper
     * @param upper an integer for the upper bounds for input, assume upper > lower
     *
     * @return returns integer value between lower and upper (inclusive)
     */
    public static int readInt(String prompt, int lower, int upper)
    {
        String temp;
        int result;
        boolean isNotValid;

        isNotValid = true; // initialize loop variables, compiler will complain because they are initialized in try/catch
        result = 0;

        do
        {
            System.out.print(prompt);
            temp = keyboard.nextLine();

            try
            {
                result = Integer.parseInt(temp);
                isNotValid = (result < lower) || (result > upper);

                if(isNotValid)
                {
                    System.out.println("ERROR: please enter value between " + lower + " - " + upper);
                }
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("Error: integer input is required");
            }

        } while(isNotValid);


        return result;
    }

    /**
     * Reads input from user and returns exactly what they typed in
     *
     * @param prompt String value containing the question to ask user for input (assuming in format "question: ")
     *
     * @return returns String of whatever user typed in
     */
    public static String readString(String prompt)
    {
        String result;

        System.out.print(prompt);
        result = keyboard.nextLine();

        return result;
    }


    /**
     * Reads input from user until valid double value entered (error-checked using bounds)
     *
     * @param prompt string value containing the question to ask user for input (assuming in format "question: ")
     * @param lower an double for the lower bounds for input, assume lower < upper
     * @param upper an double for the upper bounds for input, assume upper > lower
     *
     * @return returns double value between lower and upper (inclusive)
     */
    public static double readDouble(String prompt, double lower, double upper)
    {
        String temp;
        double result;
        boolean isNotValid;

        isNotValid = true;
        result = 0;

        do
        {
            System.out.print(prompt);
            temp = keyboard.nextLine();

            try
            {
                result = Double.parseDouble(temp);
                isNotValid = (result < lower) || (result > upper);

                if(isNotValid)
                {
                    System.out.println("ERROR: please enter value between " + lower + " - " + upper);
                }
            }
            catch(NumberFormatException nfe)
            {
                System.out.println("ERROR: double input is required");
            }
        } while(isNotValid);


        return result;
    }

    /**
     * Reads double does not use scanner, or require prompt, acts as gatekeeper for BAD DATA.
     * @param lower lower bound for double
     * @param upper upper bound for double
     * @return the checked double value
     */
    public static double readDouble(double temp,double lower, double upper){
        double result = temp;
        boolean isNotValid;

        try
        {
            isNotValid = (result < lower) || (result > upper);

            if(isNotValid)
            {
                System.out.println("ERROR: trying to set double not within bounds!\nreport bounds: " + lower + " - " + upper);
                exit(0); // safely terminating program
            }
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("ERROR: double within bounds is required");
            exit(0); // safely terminating program
        }
        return result;
    }


    /**
     * Reads input from user until valid char value entered (error-checked using validChars)
     *
     * @param prompt string value containing the question to ask user for input (assuming in format "question: ")
     * @param validChars string value containing exhaustive list of all valid chars (i.e., "YyNn")
     *
     * @return returns char value within validChars provided
     */
    public static char readChar(String prompt, String validChars)
    {
        String temp;
        char result;
        boolean isNotValid;

        isNotValid = true;
        result = 0;

        do
        {
            System.out.print(prompt);
            temp = keyboard.nextLine();
            try
            {
                result = temp.charAt(0);
                isNotValid = validChars.indexOf(result) == -1;

                if(isNotValid)
                {
                    System.out.println("ERROR: please enter one of the following valid characters: " + validChars);
                }
            }
            catch(StringIndexOutOfBoundsException sOutOfBounds)
            {
                System.out.println("ERROR: input type does not match");
            }
        } while(isNotValid);


        return result;
    }

    /**
     * Reformats string data as a title (capitalizes first letter of every word and removes extra whitespace)
     *
     * @param value string data to be reformatted
     *
     * @return returns new string in title format
     **/
    public static String toTitle(String value)
    {
        StringBuffer titledSentence = new StringBuffer();
        String[] words = value.split(" ");

        for(String word : words)
        {
            word = SortingUtility.toTitleWord(word);
            titledSentence.append(word + " ");
        }

        return titledSentence.toString().trim(); //trim off last space
    }

    /**
     * Helper method for toTitle method, returns reformatted and appended string as a capitalized word
     *
     * @param word string value passed in as a single word with no leading or trailing whitespace
     *
     * @return returns appended string with capitalization
     **/
    private static String toTitleWord(String word)
    {
        char firstLetterUpper = Character.toUpperCase( word.charAt(0) );
        String restOfWordLower = word.substring(1).toLowerCase();

        return firstLetterUpper + restOfWordLower;
    }

    /**
     * Sleeps (freezes then unfreezes) screen for the number of milliseconds provided.
     *
     * @param milliseconds the length of time to sleep in milliseconds
     **/
    public static void sleep(long milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException ie)
        {
            System.err.println("Sleeping of thread interrupted, critical error, shutting down");
            System.err.println(ie.getStackTrace());
            exit(0);
        }
    }

    /**
     * Pauses screen until user hits enter.
     *
     * @prompt instructions to give to user (make sure to let them know to hit ENTER to continue)
     **/
    public static void pause(String prompt)
    {
        System.out.print(prompt);
        keyboard.nextLine(); // pauses screen without keeping input (user must hit enter to continue)
    }

    /**
     * Pauses screen until user hits enter.
     **/
    public static void pause()
    {
        SortingUtility.pause("Press <ENTER> to continue...");
    }

    /**
     * Clears console of contents
     **/
    public static void clear()
    {
        for(int i = 0; i < SortingUtility.SCREEN_HEIGHT;  i++)
        {
            System.out.println();
        }
    }


    /**
     * Generates MD5 hashed password and returns as a String. Prevents storage of plain text string values.
     *
     * change parameter to accept char[] and reassemble String within this method for hashing.
     **/
    public static String getSecurePassword(String passwordToHash)
    {
        // convert char[] into String to be hashed.
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            //Get the hash's bytes
            byte[] bytes = md.digest(passwordToHash.getBytes());
            //This bytes[] has bytes in decimal format;

            // convert bytes to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    // Java Encoded String Passwords: https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/
    /**** @@ END OF USEFUL JAVA METHODS ****/
}
