package day8;

import java.util.ArrayList;

/**
 * Part 1: Advent of code - Day 8
 *
 * @author Vignesh Parameshwaran
 * created on 2022/12/08
 */
public class TreeHousePart1 {

    public static String input = InputFile.input;

    public static ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

    public static boolean isVisible(int row, int column, ArrayList<ArrayList<Integer>> grid) {

        int height = grid.get(row).get(column);

        int rowCount = grid.size();

        int columnCount = grid.get(0).size();

        //checking from top
        boolean isVisible = true;
        for(int i = row - 1; i >= 0; i--) {
            int adjacents = grid.get(i).get(column);
            if(adjacents >= height){
                isVisible = false;
                break;
            }
        }
        if(isVisible) {
            return true;
        }

        //checking from right
        isVisible = true;
        for(int j = column + 1; j < columnCount ; j++) {
            int adjacents = grid.get(row).get(j);
            if(adjacents >= height){
                isVisible = false;
                break;
            }
        }
        if(isVisible) {
            return true;
        }

        //checking from bottom
        isVisible = true;
        for(int i = row + 1; i < rowCount; i++) {
            int adjacents = grid.get(i).get(column);
            if(adjacents >= height){
                isVisible = false;
                break;
            }
        }
        if(isVisible) {
            return true;
        }

        //checking from left
        isVisible = true;
        for(int j = column - 1; j >= 0; j--) {
            int adjacents = grid.get(row).get(j);
            if(adjacents >= height){
                isVisible = false;
                break;
            }
        }

        return isVisible;
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

        int visibleTreeCount = (rowCount * 2) + (columnCount - 2) * 2;

        for(int i = 1; i < rowCount - 1; i++) {
            for(int j = 1; j < columnCount - 1; j++) {
                if(isVisible(i, j, grid)) {
                    visibleTreeCount++;
                }
            }
        }

        System.out.println(visibleTreeCount);

    }


}
