package challenge;

public class MedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] median;
        if(len % 2 == 0)
            median = new int[]{len / 2 - 1, len / 2};
        else
            median = new int[] {len / 2};
        double total = 0;

        int[] sortedArray = new int[nums1.length + nums2.length];

        for (int i = 0, j = 0, k = 0; i + j < len; k++){
            if(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    sortedArray[k] = nums1[i];
                    i++;
                } else {
                    sortedArray[k] = nums2[j];
                    j++;
                }            } else if (j >= nums2.length) {
                sortedArray[k] = nums1[i];
                i++;
            } else {
                sortedArray[k] = nums2[j];
                j++;
            }
            if(median.length == 1 && median[0] == k)
                return sortedArray[k];
            if(median.length == 2 && (median[0] == k || median [1] == k)){
                if (k == median[0])
                    total = sortedArray[k];
                else
                    return (total + sortedArray[k]) / 2;
            }
        }
        return total;
    }
}
