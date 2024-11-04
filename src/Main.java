import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String letter = scanner.nextLine();
            addLetter(letter);
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
}
