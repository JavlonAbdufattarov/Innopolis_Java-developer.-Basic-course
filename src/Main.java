import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String letter = scanner.nextLine();
            countArrow(letter);
            if(Objects.equals(letter, "q")){
                break;
            }
        }
    }
    public static void addLetter(String Letter){
        if(Letter.equals("p")){
            Letter=Letter+"a";
        }
        else if(Letter.equals("l")){
            Letter=Letter+"z";
        }
        else if (Letter.equals("m")) {
            Letter=Letter+"q";
        }
        System.out.println(Letter);
    }

    public static int countArrow(String symbols){
        char[] сharacterDivision = symbols.toCharArray();
        int count = 0;
        for (int i = 0; i < сharacterDivision.length-4; i++) {
            String fourth = new String(сharacterDivision, i, 5);
            if(Objects.equals(fourth, ">>-->") ||Objects.equals(fourth, "<--<<")){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
