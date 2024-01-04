class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double m1 = 0;
        double m2 = 0;

        int[] merge = new int[m + n];
        System.arraycopy(nums1, 0, merge, 0, m);
        System.arraycopy(nums2, 0, merge, m, n);
        Arrays.sort(merge);
        if (merge.length % 2 == 0) {
            m1 = merge[(merge.length - 1) / 2];
            m2 = merge[((merge.length - 1) / 2) + 1];
            double mid = (m1 + m2) / 2;
            return mid;
        } else {
            int z = Math.round(merge.length / 2);
            return merge[z];
        }

        // if (merge.length == 1) {
        // double mid = merge[0];
        // return mid;
        // }
        // if (merge.length == 2) {
        // double mid = (merge[0] + merge[1]) / 2;
        // return mid;
        // }
        // if (merge.length == 3) {
        // if (nums1==null) {
        // double mid = (merge[1] + merge[2]) / 2;
        // return mid;
        // } else {
        // double mid = merge[1];
        // return mid;
        // }

        // }
        // if (merge.length > 3)
        // m1 = merge[(merge.length - 1) / 2];
        // m2 = merge[((merge.length - 1) / 2) + 1];
        // double mid = (m1 + m2) / 2;

        // return mid;

    }

}