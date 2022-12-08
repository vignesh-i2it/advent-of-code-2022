package day8;

import java.util.ArrayList;

/**
 * Part 2: Advent of code - Day 8
 *
 * @author Vignesh Parameshwaran
 * created on 2022/12/08
 */
public class TreeHousePart2 {

    public static String input = InputFile.input;

    public static ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

    public static int scenicScoreCalculator(int row, int column, ArrayList<ArrayList<Integer>> grid) {

        int height = grid.get(row).get(column);

        int rowCount = grid.size();

        int columnCount = grid.get(0).size();

        int scenicScore = 1;

        int viewDistanceCounter = 0;

        //looking up
        for(int i = row - 1; i >= 0; i--) {
            int adjacents = grid.get(i).get(column);
            if(adjacents < height){
                viewDistanceCounter++;
            } else if (adjacents == height) {
                viewDistanceCounter++;
                break;
            } else {
                break;
            }
        }
        scenicScore *= viewDistanceCounter;

        
        //checking from right
        viewDistanceCounter = 0;
        for(int j = column + 1; j < columnCount ; j++) {
            int adjacents = grid.get(row).get(j);
            if(adjacents < height){
                viewDistanceCounter++;
            } else if (adjacents == height) {
                viewDistanceCounter++;
                break;
            } else {
                break;
            }
        }
        scenicScore *= viewDistanceCounter;

        //checking from bottom
        viewDistanceCounter = 0;
        for(int i = row + 1; i < rowCount; i++) {
            int adjacents = grid.get(i).get(column);
            if(adjacents < height){
                viewDistanceCounter++;
            } else if (adjacents == height) {
                viewDistanceCounter++;
                break;
            } else {
                break;
            }
        }
        scenicScore *= viewDistanceCounter;

        //checking from left
        viewDistanceCounter = 0;
        for(int j = column - 1; j >= 0; j--) {
            int adjacents = grid.get(row).get(j);
            if(adjacents < height){
                viewDistanceCounter++;
            } else if (adjacents == height) {
                viewDistanceCounter++;
                break;
            } else {
                break;
            }
        }
        scenicScore *= viewDistanceCounter;

        return scenicScore;

    }

    public static void main(String[] args) {

        //Creating the grid
        String[] rows = input.split("\n");

        int rowCount = rows.length;

        int columnCount = rows[0].length();

        int currentRow = 0;

        for(String row : rows) {

            String[] trees = row.split("");

            grid.add(new ArrayList<>());

            for(String tree : trees) {
                grid.get(currentRow).add(Integer.parseInt(tree));
            }

            currentRow++;
        }

        int highestScenicScore = 0;

        for(int i = 1; i < rowCount - 1; i++) {
            for(int j = 1; j < columnCount - 1; j++) {

                int scenicScore = scenicScoreCalculator(i, j, grid);
                if( scenicScore > highestScenicScore) {
                    highestScenicScore = scenicScore;
                }
            }
        }

        System.out.println(highestScenicScore);



    }

}
