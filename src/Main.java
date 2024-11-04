import java.text.CollationElementIterator;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String letter = scanner.nextLine().replace(" ","") ;
            sortLetter(letter);

            if(Objects.equals(letter, "q")){
                break;
            }
        }
    }
    //fist task
    // Задача1.Для введенной с клавиатуры буквы английского алфавита нужно вывести
    // слевастоящую буквуна стандартной клавиатуре.
    // Приэтомклавиатуразамкнута,т.е.справаотбуквы«p»стоитбуква«a»,аслеваот"а"буква"р",такжесоседнимисчитаютсябуквы«l»ибуква«z»,абуква«m»сбуквой«q».Входныеданные:строкавходногопотокасодержитодинсимвол—маленькуюбуквуанглийскогоалфавита.
    // Выходныеданные:следуетвывестибуквустоящуюслеваотзаданнойбуквы,сучетомзамкнутостиклавиатуры.
    //я не понял это задание можно скипнуть )

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
    //second task Задача2.Заданапоследовательность,состоящаятолькоизсимволов‘>’,‘<’и‘-‘.
    // Требуетсянайтиколичествострел,которыеспрятанывэтойпоследовательности.
    // Стрелы–этоподстрокивида‘>>-->’и‘<--<<’.
    // Входныеданные:впервойстрокевходногопотоказаписанастрока,состоящаяизсимволов‘>’,‘<’и‘-‘(безпробелов).
    // Строкаможетсодержатьдо 106символов.
    // Выходныеданные:вединственнуюстрокувыходногопотоканужновывестиискомоеколичествострелок.
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
    //third task
    //Заданастрока,состоящая из букв английского алфавита,разделенных одним пробелом.
    // Необходимо каждую последовательность символов упорядочить повозрастанию и вывести
    // словав нижнем регистре.
    // Входныеданные:в единственной строке последовательность символов представляющее два слова.
    // Выходныеданные:упорядоченные повозрастанию буквы внижнем регистре.
    public static String sortLetter(String arrayLetter){
        String lowerCase = arrayLetter.toLowerCase();
        Arrays.sort(lowerCase.toCharArray());
        System.out.println(lowerCase);
        return lowerCase;
    }


}
