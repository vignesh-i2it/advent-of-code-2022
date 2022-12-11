package day9;

import java.util.ArrayList;

/**
 * Part 1: Advent of code - Day 9
 *
 * @author Vignesh Parameshwaran
 * created on 2022/12/09
 */
public class RopeBridgePart1 {

    public static String input = Day9InputFile.input;

    static int headRow = 0;
    static int headCol = 0;

    static int tailRow = 0;
    static int tailCol = 0;

    static ArrayList<String> tailPositions = new ArrayList<>();

    public static boolean iSTailNearby(int hR, int hC, int tR, int tC) {
        return (Math.abs(hR - tR) < 2 && Math.abs(hC - tC) < 2);
    }

    public static String tailPosition(int hR, int hC, int tR, int tC) {

        String tailPosition = "";

        if ((hR - tR == -2) && (hC == tC)) {
            tailPosition += "headTwoStepsDirectlyUp";
        } else if ((hC - tC == 2) && (hR == tR)) {
            tailPosition += "headTwoStepsDirectlyRight";
        } else if ((hR - tR == 2) && (hC == tC)) {
            tailPosition += "headTwoStepsDirectlyDown";
        } else if ((hC - tC == -2) && (hR == tR)) {
            tailPosition += "headTwoStepsDirectlyLeft";
        } else if ( ((hC - tC == 1) && (hR - tR == -2)) || ((hC - tC == 2) && (hR - tR == -1)) ) {
            tailPosition += "headAwayInUpperRightQuadrant";
        } else if ( ((hC - tC == -1) && (hR - tR == -2)) || ((hC - tC == -2) && (hR - tR == -1)) ) {
            tailPosition += "headAwayInUpperLeftQuadrant";
        } else if ( ((hC - tC == -1) && (hR - tR == 2)) || ((hC - tC == -2) && (hR - tR == 1)) ) {
            tailPosition += "headAwayInLowerLeftQuadrant";
        } else if ( ((hC - tC == 1) && (hR - tR == 2)) || ((hC - tC == 2) && (hR - tR == 1)) ) {
            tailPosition += "headAwayInLowerRightQuadrant";
        }

        return tailPosition;
    }

    public static boolean combinationAlreadyThere(ArrayList<String> combinations, String position) {

        boolean exists = false;

        for(String combination : combinations) {
            if(combination.equals(position)) {
                exists = true;
                break;
            }
        }
        return exists;
    }



    public static void main(String[] args) {

        tailPositions.add(tailRow + "," + tailCol);

        String[] moves = input.split("\n");

        for(String move : moves) {

            String[] motions = move.split(" ");

            int repetitions = Integer.parseInt(motions[1]);

            for(int i = 0; i < repetitions; i++){
                switch (motions[0]) {
                    case "U":
                        headRow--;
                        break;
                    case "R":
                        headCol++;
                        break;
                    case "D":
                        headRow++;
                        break;
                    case "L":
                        headCol--;
                        break;
                }

                if (!iSTailNearby(headRow,headCol,tailRow,tailCol)) {

                    String tailPositionWRTHead = tailPosition(headRow, headCol, tailRow, tailCol);

                    switch (tailPositionWRTHead) {

                        case "headTwoStepsDirectlyUp":
                            tailRow--;
                            break;
                        case "headTwoStepsDirectlyRight":
                            tailCol++;
                            break;
                        case "headTwoStepsDirectlyDown":
                            tailRow++;
                            break;
                        case "headTwoStepsDirectlyLeft":
                            tailCol--;
                            break;


                        case "headAwayInUpperRightQuadrant":
                            tailRow--;
                            tailCol++;
                            break;
                        case "headAwayInUpperLeftQuadrant":
                            tailRow--;
                            tailCol--;
                            break;
                        case "headAwayInLowerLeftQuadrant":
                            tailRow++;
                            tailCol--;
                            break;
                        case "headAwayInLowerRightQuadrant":
                            tailRow++;
                            tailCol++;
                            break;
                    }

                }

                String currentTailPosition = tailRow + "," + tailCol;

                //System.out.println(currentTailPosition);

                if(!combinationAlreadyThere(tailPositions, currentTailPosition)) {
                    tailPositions.add(currentTailPosition);
                }

            }


        }

        System.out.println(tailPositions.size());
    }

}
