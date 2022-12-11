package day10;

/**
 * Part 1: Advent of code - Day 10
 *
 * @author Vignesh Parameshwaran
 * created on 2022/12/11
 */
public class CathodeRayTubePart1 {

    public static String input = Day10InputFile.input;

    public static int cycle = 1;

    public static int x = 1;

    public static int sum = 0;

    public static int divisor = 20;

    public static void main(String[] args) {

        String[] instructions = input.split("\n");

        for(String instruction : instructions) {

            String[] values = instruction.split(" ");

            if(values[0].equals("addx")) {

                cycle++;

                if(cycle%divisor == 0) {
                    sum += (x * cycle);
                    divisor += 40;
                }

                cycle++;

                x += Integer.parseInt(values[1]);

            } else {
                cycle++;
            }

            if(cycle%divisor == 0){
                sum += (x * cycle);
                divisor += 40;
            }


            if(cycle >= 220) {
                break;
            }

        }

        System.out.println("final sum: " + sum);

    }

}
