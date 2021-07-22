package challenge;

public class QuickSort {

    public int[] sort(int[] array) {
        return sort(array, 0, array.length - 1);
    }

    private int[] sort(int[] array, int pivot, int right) {
        var left = pivot + 1;
        if (right < left)
            return array;

        while (right >= left) {
            if (array[left] > array[pivot] && array[right] < array[pivot])
                swapElements(array, left, right);
            if (array[left] <= array[pivot])
                left++;
            if (array[right] >= array[pivot])
                right--;
        }
        swapElements(array, pivot, right);

        sort(array, pivot, right - 1);
        sort(array, right + 1, array.length - 1);

        return array;
    }

    private void swapElements(int[] array, int left, int right) {
        var temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
