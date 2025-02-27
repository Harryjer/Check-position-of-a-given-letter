import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//ASCII => a-97, A-65

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide an English Leteer");

        char letter =scanner.next().charAt(0);
        letter =Character.toLowerCase(letter);
        int ascivalue = (int)letter;

        System.out.println(ascivalue);
        int position = ascivalue-96;
        System.out.println("Position is : " + position);

    }
}