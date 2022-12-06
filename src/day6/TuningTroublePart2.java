package day6;

/**
 * Part 2: Advent of code - Day 6
 *
 * @author Vignesh Parameshwaran
 * created on 2022/12/06
 */
public class TuningTroublePart2 {

    public static void main(String[] args) {

        int currentCharacter = 14;

        String input = TuningTroublePart1.input;

        while (currentCharacter <= input.length()) {
            if(TuningTroublePart1.uniqueCharacters(input.substring(currentCharacter - 14, currentCharacter))) {
                break;
            } else {
                currentCharacter++;
            }
        }

        System.out.println(currentCharacter);
    }
}
