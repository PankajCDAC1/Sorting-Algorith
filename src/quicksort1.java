public class quicksort1 {
  static   int partition(int[] A, int low , int high) {
        int pivot = A[low];
        int i = low + 1;
        int j = high;

        do {
            while (A[i] < pivot) {
                i++;
            }
            while (A[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }while(i<j);
//swap A[low] and A[j]
        int temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        return j;
    }
static void quicksort(int[] A, int low , int high){
if(low<high) {
    int partitionindex = partition(A, low, high);
    quicksort(A, low, partitionindex - 1); //sort left subarray
    quicksort(A, partitionindex + 1, high); //sort right subarray
}}
public static void main(String[] args) {
        int[] A = {5, 4, 8, 10, 3, 9, 1,45,44};

        //for unsorted Array
        System.out.println("Unsorted Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
           quicksort(A,0,A.length-1);
        System.out.println("\nsorted Array");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }}
