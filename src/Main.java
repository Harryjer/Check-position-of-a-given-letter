import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//ASCII => a-97, A-65

        //taking the letter from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an English Leteer");

        //take the letters from the begining and save it on a variable
        char letter =scanner.next().charAt(0);

        //if the user enters a capital letter, this convert the letter in to lower case
        letter =Character.toLowerCase(letter);

        //store this letter value by converting it to an int.
        int ascivalue = (int)letter;

        //print the asci value
        System.out.println(ascivalue);

        //convert asci value for real time value
        int position = ascivalue-96;

        //print the real time value.
        System.out.println("Position is : " + position);

    }
}