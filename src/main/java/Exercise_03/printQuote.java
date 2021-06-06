/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
 */

package Exercise_03;

import java.util.Scanner;

public class printQuote {
    public static void main(String[] args){
        System.out.print("What is the quote?");
        Scanner input = new Scanner(System.in);
        //setup for the quote string
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        //setup for the person who said the quote
        String person = input.nextLine();

        //print out for the quote with the quotation marks as escape characters
        System.out.print(person + " says, \""+ quote +"\"" );
    }
}
