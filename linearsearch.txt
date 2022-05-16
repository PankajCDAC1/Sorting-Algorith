public class LinearSearch {
    static int linearsearch(int A[], int element , int size) {
        for (int i = 0; i < size; i++) {
            if (A[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int A[] = {1,3,2,5,4,7,6,76,66,74536,77,78,19};
        int size = A.length;
        int element = 19;
        int searchindex = linearsearch(A,element,size);
        System.out.print("THE ELEMENT  " + element + " was found at index of  "+ searchindex);
    }


}
