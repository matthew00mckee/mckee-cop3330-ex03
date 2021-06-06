package Exercise_03;

import java.util.Scanner;

public class printQuote {
    public static void main(String[] args){
        System.out.print("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String person = input.nextLine();

        System.out.print(person + " says, \""+ quote + "\"" );
    }
}
