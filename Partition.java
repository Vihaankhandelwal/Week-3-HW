public final class Partition {

    private Partition() {}

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    // Lomuto partition
    // Pivot is a[high]
    // Returns the final pivot index
    public static int partitionLomuto(int[] a, int low, int high) {
        if (a == null) throw new IllegalArgumentException("array is null");
        if (low < 0 || high < 0 || low >= a.length || high >= a.length || low > high) {
            throw new IllegalArgumentException("invalid low/high");
        }

        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, high);
        return i + 1;
    }
    // Hoare partition
    // Pivot is a[low]
    // Returns the split index j (not necessarily the pivot’s final index)
    public static int partitionHoare(int[] a, int low, int high) {
        if (a == null) throw new IllegalArgumentException("array is null");
        if (low < 0 || high < 0 || low >= a.length || high >= a.length || low > high) {
            throw new IllegalArgumentException("invalid low/high");
        }

        int pivot = a[low];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (a[i] < pivot);

            do {
                j--;
            } while (a[j] > pivot);

            if (i >= j) return j;

            swap(a, i, j);
        }
    }
}
