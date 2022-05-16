public class bubblesorting {
    public static void main (String args[]){

    int A[] = {5, 2, 1, 4, 9, 10};
    int n = 6;
    //Printing Unsorted Array
        System.out.println("UNSORTED ARRAY");
        for(int i=0; i< n; i++){
            System.out.print(A[i]+" ");

        }
        System.out.println("\n________________________________________________________");
        //bubble Sort
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }}}
        //printing Sorted Array
        for(int i=0; i< n; i++){
            System.out.print(A[i]+" ");
        }
}}
