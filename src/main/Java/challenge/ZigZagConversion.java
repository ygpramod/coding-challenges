package challenge;
import java.util.concurrent.atomic.AtomicInteger;

public class ZigZagConversion {
    public String convert(String s, int rows) {
        if (rows == 1 || s.length() <= rows)
            return s;
        StringBuilder[] array = new StringBuilder[rows];
        for (int i = 0; i < array.length; i++) {
            array[i] = new StringBuilder();
        }
        AtomicInteger stringCounter = new AtomicInteger(0);
        helper(s, stringCounter, rows, array);
        return String.join("", array);
    }

    private void helper(String string, AtomicInteger counter, int rows, StringBuilder[] array) {
        int row = 0;
        while (counter.get() < string.length() && row < rows) {
            array[row].append(string.charAt(counter.getAndIncrement()));
            row++;
        }
        row -= 2;
        while (counter.get() < string.length() && row > 0) {
            array[row].append(string.charAt(counter.getAndIncrement()));
            row--;
        }
        if (counter.get() < string.length()) {
            helper(string, counter, rows, array);
        }
    }
}
