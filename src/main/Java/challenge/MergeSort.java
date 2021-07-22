package challenge;

public class MergeSort {
    public int[] splitAndMerge(int[] array) {
        var length = array.length;
        if (length == 1)
            return array;

        var mid = (length - 1) / 2;
        var left = splitAndMerge(split(array, 0, mid));
        var right = splitAndMerge(split(array, mid + 1, length - 1));

        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        var result = new int[left.length + right.length];

        for (int i = 0, j = 0, k = 0; k < result.length; k++) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    result[k] = left[i];
                    i++;
                } else {
                    result[k] = right[j];
                    j++;
                }
            } else if (i < left.length){
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
        }
        return result;
    }

    private int[] split(int[] array, int start, int end) {
        var newArray = new int[end - start + 1];
        for (int i = start, j = 0; i <= end; i++, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }
}
