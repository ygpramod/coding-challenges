package challenge;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ZigZagConversion {
    public String convert(String s, int rows) {
        if (rows == 1 || s.length() <= rows)
            return s;
        int columnsNeededToStore;
        if (rows == 2) columnsNeededToStore = (s.length() + 1) / 2;
        else columnsNeededToStore = ((s.length() * (rows - 1)) / (rows * 2 - 2)) + 1 ;
        String[][] matrix = new String[rows][columnsNeededToStore];
        int column = 0;
        AtomicInteger stringCounter = new AtomicInteger(0);
        helper(s, stringCounter, rows, column, matrix);
        String convertedString = "";
        for (int i = 0; i < rows; i++) {
            convertedString = convertedString.concat(Arrays.stream(matrix[i]).filter(Objects::nonNull).collect(Collectors.joining()));
        }
        return convertedString;
    }

    private void helper(String s, AtomicInteger stringCounter, int rows, int column, String[][] matrix) {
        int row = 0;
        while (stringCounter.get() < s.length() && row < rows) {
            matrix[row][column] = String.valueOf(s.charAt(stringCounter.getAndIncrement()));
            row++;
        }
        row -= 2;
        column++;
        while (stringCounter.get() < s.length() && row > 0) {
            matrix[row][column] = String.valueOf(s.charAt(stringCounter.getAndIncrement()));
            row--;
            column++;
        }
        if (stringCounter.get() < s.length()) {
            helper(s, stringCounter, rows, column, matrix);
        }
    }
}
