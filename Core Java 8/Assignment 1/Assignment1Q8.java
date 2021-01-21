class BubbleSort {

    public int[] bubbleSort(int arr[]) {
        int arrSize = arr.length;
        int i = 0;
        int j = 1;
        for (int p = 0; p < arrSize; p++) {
            while (j < arrSize) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
                i++;
                j++;

            }
            i=0;
            j=1;
        }
        return arr;

    }

}

public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
        
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
        for (int element: sort.bubbleSort(arr)) {
            System.out.println(element);
        }
    }
}