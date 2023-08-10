public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swaping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; // pivot index
    };

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotidx = partition(arr, low, high);

            quickSort(arr, low, pivotidx - 1);
            quickSort(arr, pivotidx + 1, high);
        }
    };

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        // print unsorted
        System.out.print("Unsorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // sorting
        quickSort(arr, 0, n - 1);
        
        // print sorted
        System.out.print("Sorted array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}