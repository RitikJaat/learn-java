public class MergeSort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];

            } else {
                merged[x++] = arr[index2++];
            }
        }
        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    };

    public static void Divide(int arr[], int sindex, int eindex) {
        if (sindex >= eindex) {
            return;
        }
        // this one can cause error in too big integer values(sindex + eindex) / 2;
        int mid = sindex + (eindex - sindex) / 2;
        Divide(arr, sindex, mid);
        Divide(arr, mid + 1, eindex);
        conquer(arr, sindex, mid, eindex);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;
        Divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
